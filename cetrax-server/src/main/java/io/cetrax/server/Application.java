/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.server;

import io.cetrax.server.grpc.GrpcServer;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(final String[] args) throws IOException {
        if (args.length < 1) {
            printUsage();
            return;
        }

        // set system wide default timezone to utc
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        final String configPath = args[0];
        logger.info("loading configs from {}", configPath);
        final Config cetraxProperties = ConfigFactory.parseFile(new File(configPath)).resolve();
        logger.info("configs are: {}", cetraxProperties);
        final CetraxEnvironment environment = new CetraxEnvironment(cetraxProperties);

        printCetrax();
        if (environment.getConfigAsInteger(Constants.CANTOR_PORT_GRPC, -1) != -1) {
            logger.info("'cetrax.grpc.port' is set. setting up grpc server...");
            final GrpcServer grpcServer = new GrpcServer(environment);
            grpcServer.start().join();
        } else {
            logger.info("'cetrax.grpc.port' not set. will not attempt to set up grpc server.");
        }

        // redirect JUL to slf4j
        SLF4JBridgeHandler.install();
    }

    private static void printUsage() {
        System.err.println("usage: java -jar cetrax-server.jar <path-to-config>");
    }

    private static void printCetrax() {
        logger.info("\n\n--- starting cetrax ---\n\n");
    }
}
