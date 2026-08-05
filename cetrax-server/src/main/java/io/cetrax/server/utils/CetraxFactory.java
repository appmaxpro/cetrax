/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.server.utils;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.cetrax.Cetrax;
import io.cetrax.Sets;
import io.cetrax.h2.CetraxOnH2;
import io.cetrax.h2.H2DataSourceProperties;
import io.cetrax.h2.H2DataSourceProvider;
import io.cetrax.misc.async.AsyncCetrax;
import io.cetrax.misc.loggable.LoggableCetrax;
import io.cetrax.misc.rw.ReadWriteCetrax;
import io.cetrax.misc.sharded.ShardedCetrax;
import io.cetrax.mysql.CetraxOnMysql;
import io.cetrax.mysql.MysqlDataSourceProperties;
import io.cetrax.mysql.MysqlDataSourceProvider;
import io.cetrax.s3.CetraxOnS3;
import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static io.cetrax.server.Constants.CANTOR_H2_COMPRESSED;
import static io.cetrax.server.Constants.CANTOR_H2_IN_MEMORY;
import static io.cetrax.server.Constants.CANTOR_H2_PASSWORD;
import static io.cetrax.server.Constants.CANTOR_H2_PATH;
import static io.cetrax.server.Constants.CANTOR_H2_USERNAME;
import static io.cetrax.server.Constants.CANTOR_MYSQL_HOSTNAME;
import static io.cetrax.server.Constants.CANTOR_MYSQL_PASSWORD;
import static io.cetrax.server.Constants.CANTOR_MYSQL_PORT;
import static io.cetrax.server.Constants.CANTOR_MYSQL_USERNAME;
import static io.cetrax.server.Constants.CANTOR_S3_BUCKET_NAME;
import static io.cetrax.server.Constants.CANTOR_S3_BUCKET_REGION;
import static io.cetrax.server.Constants.CANTOR_S3_ENDPOINT_OVERRIDE;
import static io.cetrax.server.Constants.CANTOR_S3_PROXY_HOST;
import static io.cetrax.server.Constants.CANTOR_S3_PROXY_PORT;
import static io.cetrax.server.Constants.CANTOR_S3_SETS_TYPE;

public class CetraxFactory {
    private static final Logger logger = LoggerFactory.getLogger(io.cetrax.server.utils.CetraxFactory.class);
    // this variable expects the format <hostname1>:<port1>,<hostname2>:<port2>,...
    private static final String ENV_MYSQL_SHARDS = "MYSQL_SHARDS";

    private final io.cetrax.server.CetraxEnvironment cetraxEnvironment;

    public CetraxFactory(final io.cetrax.server.CetraxEnvironment cetraxEnvironment) {
        this.cetraxEnvironment = cetraxEnvironment;
    }

    public Cetrax getCetrax() throws IOException {
        final String storageType = this.cetraxEnvironment.getStorageType();
        if (storageType.equalsIgnoreCase("s3")) {
            final Config config = this.cetraxEnvironment.getConfig(storageType);
            if (!config.hasPath(CANTOR_S3_SETS_TYPE)) {
                throw new IllegalArgumentException("Missing configuration setting for 's3." + CANTOR_S3_SETS_TYPE + "'");
            }

            logger.info("creating s3 cetrax instance with sets on {}...", config.getString(CANTOR_S3_SETS_TYPE));
            final String bucketName = config.getString(CANTOR_S3_BUCKET_NAME);
            if (Strings.isNullOrEmpty(bucketName)) {
                throw new IllegalArgumentException("Bucket name invalid. Please set 's3." + CANTOR_S3_BUCKET_NAME + "'");
            }

            // no support for s3 on sets therefore another cetrax type must be used
            final Sets sets = getCetraxByType(config.getString(CANTOR_S3_SETS_TYPE)).sets();
            return new LoggableCetrax(new CetraxOnS3(createAwsClient(config), bucketName) {
                @Override
                public Sets sets() {
                    return sets;
                }
            });
        }
        return getCetraxByType(storageType);
    }

    private Cetrax getCetraxByType(final String storageType) throws IOException {
        if (storageType.equalsIgnoreCase("mysql")) {
            final String mysqlShards = this.cetraxEnvironment.getEnvironmentVariable(ENV_MYSQL_SHARDS);

            final List<MysqlDataSourceProperties> dataSources;
            if (mysqlShards != null) {
                dataSources = getMysqlFromEnv(mysqlShards);
            } else {
                dataSources = getMysqlDataSourceProperties(this.cetraxEnvironment.getConfigAsList(storageType));
            }

            if (dataSources.size() == 1) {
                logger.info("creating single instance mysql cetrax...");
                final Cetrax readCetrax = new CetraxOnMysql(MysqlDataSourceProvider.getDatasource(dataSources.get(0)));
                final Cetrax writeCetrax = new CetraxOnMysql(MysqlDataSourceProvider.getDatasource(dataSources.get(0)));
                return new LoggableCetrax(new AsyncCetrax(new ReadWriteCetrax(writeCetrax, readCetrax), newExecutorService()));
            }

            final Cetrax[] cetraxes = new Cetrax[dataSources.size()];
            for (int index = 0; index < cetraxes.length; index++) {
                final Cetrax readCetrax = new CetraxOnMysql(MysqlDataSourceProvider.getDatasource(dataSources.get(index)));
                final Cetrax writeCetrax = new CetraxOnMysql(MysqlDataSourceProvider.getDatasource(dataSources.get(index)));
                cetraxes[index] = new AsyncCetrax(new ReadWriteCetrax(writeCetrax, readCetrax), newExecutorService());
            }
            logger.info("creating shared mysql cetrax with {} instances: {}", cetraxes.length, dataSources);
            return new LoggableCetrax(new ShardedCetrax(cetraxes));
        } else if (storageType.equalsIgnoreCase("h2")) {
            final List<H2DataSourceProperties> dataSources = getH2DataSourceProperties(
                    this.cetraxEnvironment.getConfigAsList(storageType)
            );

            if (dataSources.size() == 1) {
                logger.info("creating single instance h2 cetrax...");
                return new LoggableCetrax(new CetraxOnH2(H2DataSourceProvider.getDatasource(dataSources.get(0))));
            }

            final Cetrax[] cetraxes = new Cetrax[dataSources.size()];
            for (int index = 0; index < cetraxes.length; index++) {
                cetraxes[index] = new CetraxOnH2(H2DataSourceProvider.getDatasource(dataSources.get(index)));
            }
            logger.info("creating shared h2 cetrax with {} instances: {}", cetraxes.length, dataSources);
            return new LoggableCetrax(new ShardedCetrax(cetraxes));
        } else {
            throw new IllegalArgumentException("invalid storage type");
        }
    }

    private List<MysqlDataSourceProperties> getMysqlFromEnv(final String mysqlShardsString) {
        final List<MysqlDataSourceProperties> propertiesList = new ArrayList<>();

        final String[] mysqlShards = mysqlShardsString.split(",");
        for (final String mysqlShard : mysqlShards) {
            final String[] hostPort = mysqlShard.split(":");
            if (hostPort.length != 2) {
                throw new IllegalArgumentException(ENV_MYSQL_SHARDS + " is in an invalid format. Expected: <hostname1>:<port1>,<hostname2>:<port2>,... Found: " + mysqlShardsString);
            }

            final MysqlDataSourceProperties properties = new MysqlDataSourceProperties();
            properties.setHostname(hostPort[0]);
            properties.setPort(Integer.parseInt(hostPort[1]));
            propertiesList.add(properties);
        }
        return propertiesList;
    }

    private List<MysqlDataSourceProperties> getMysqlDataSourceProperties(final List<? extends Config> configObjects) {
        final List<MysqlDataSourceProperties> propertiesList = new ArrayList<>();
        for (final Config config : configObjects) {
            final MysqlDataSourceProperties properties = new MysqlDataSourceProperties();
            properties.setHostname(config.getString(CANTOR_MYSQL_HOSTNAME));
            properties.setPort(config.getInt(CANTOR_MYSQL_PORT));
            properties.setUsername(config.getString(CANTOR_MYSQL_USERNAME));
            properties.setPassword(config.getString(CANTOR_MYSQL_PASSWORD));
            propertiesList.add(properties);
        }
        return propertiesList;
    }

    private List<H2DataSourceProperties> getH2DataSourceProperties(final List<? extends Config> configObjects) {
        final List<H2DataSourceProperties> propertiesList = new ArrayList<>();
        for (final Config config : configObjects) {
            final H2DataSourceProperties properties = new H2DataSourceProperties();
            properties.setPath(config.getString(CANTOR_H2_PATH));
            properties.setInMemory(config.getBoolean(CANTOR_H2_IN_MEMORY));
            properties.setCompressed(config.getBoolean(CANTOR_H2_COMPRESSED));
            properties.setUsername(config.getString(CANTOR_H2_USERNAME));
            properties.setPassword(config.getString(CANTOR_H2_PASSWORD));
            propertiesList.add(properties);
        }
        return propertiesList;
    }

    private AmazonS3 createAwsClient(final Config config) {
        final String region = config.getString(CANTOR_S3_BUCKET_REGION);
        final AmazonS3ClientBuilder amazonS3ClientBuilder = AmazonS3ClientBuilder.standard();

        final ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.withProtocol(Protocol.HTTPS)
            .withMaxConnections(256)
            .withConnectionMaxIdleMillis(TimeUnit.MINUTES.toMillis(5)) // keep connections alive for 5 minutes
            .withConnectionTimeout(3_000) // timeout on connect after 3 seconds
            .withRequestTimeout(10_000) // timeout out the request after 10 seconds
            .withMaxErrorRetry(3); // on errors, retry max of 3 times

        final boolean endpointOverride = config.hasPath(CANTOR_S3_ENDPOINT_OVERRIDE) && config.getBoolean(CANTOR_S3_ENDPOINT_OVERRIDE);
        if (endpointOverride) {
            amazonS3ClientBuilder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(String.format("%s-fips", region), region));
        } else {
            amazonS3ClientBuilder.withRegion(region);
        }

        final String proxyHost = config.hasPath(CANTOR_S3_PROXY_HOST) ? config.getString(CANTOR_S3_PROXY_HOST) : "";
        final int proxyPort = config.hasPath(CANTOR_S3_PROXY_PORT) ? config.getInt(CANTOR_S3_PROXY_PORT) : -1;
        if (!Strings.isNullOrEmpty(proxyHost)) {
            clientConfiguration.setProxyHost(proxyHost);
            clientConfiguration.setProxyPort(proxyPort);
        }

        return amazonS3ClientBuilder.withClientConfiguration(clientConfiguration).build();
    }

    private ExecutorService newExecutorService() {
        return Executors.newCachedThreadPool(
                new ThreadFactoryBuilder().setNameFormat("cetrax-worker-%d").build()
        );
    }
}
