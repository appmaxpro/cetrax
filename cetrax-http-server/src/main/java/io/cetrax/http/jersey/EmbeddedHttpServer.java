/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.http.jersey;

import io.cetrax.Cetrax;
import io.cetrax.grpc.CetraxOnGrpc;
import io.cetrax.h2.CetraxOnH2;
import io.cetrax.h2.H2DataSourceProperties;
import io.cetrax.h2.H2DataSourceProvider;
import io.cetrax.http.resources.EventsResource;
import io.cetrax.http.resources.FunctionsResource;
import io.cetrax.http.resources.ObjectsResource;
import io.cetrax.http.resources.SetsResource;
import io.cetrax.misc.loggable.LoggableCetrax;
import io.cetrax.mysql.CetraxOnMysql;
import org.eclipse.jetty.ee10.servlet.DefaultServlet;
import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class EmbeddedHttpServer {
    private static final Logger logger = LoggerFactory.getLogger(EmbeddedHttpServer.class);

    Server createServer(final int port, final String basePath) {
        final ResourceConfig config = new SwaggerJaxrsConfig();

        // bind resources with required constructor parameters
        final Cetrax cetrax = getCetraxOnGrpc();
        config.registerInstances(
                new EventsResource(cetrax),
                new ObjectsResource(cetrax),
                new SetsResource(cetrax),
                new FunctionsResource(cetrax)
        );

        final Server server = new Server(port);

        // load jersey servlets
        final ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(config));
        final ServletContextHandler context = new ServletContextHandler("/");
        server.setHandler(context);
        context.addServlet(jerseyServlet, basePath);

        // serve static resources
        context.setBaseResourceAsString("cetrax-http-server/src/main/resources/static");
        context.addServlet(DefaultServlet.class, "/");

        return server;
    }

    private Cetrax getCetraxOnGrpc() {
        final Cetrax cetraxOnGrpc = new CetraxOnGrpc("localhost:7443");
        return new LoggableCetrax(cetraxOnGrpc);
    }

    private Cetrax getCetraxOnMysql() {
        try {
            final Cetrax cetraxOnMysql = new CetraxOnMysql("localhost", 3306, null, null);
            return new LoggableCetrax(cetraxOnMysql);
        } catch (final IOException e) {
            logger.error("failed to initialize cetrax:", e);
        }
        return null;
    }

    private Cetrax getCetraxOnH2() {
        try {
            // set up a simple cetrax using H2
            final H2DataSourceProperties h2Properties = new H2DataSourceProperties()
                    .setPath("/tmp/cetrax-server-tmp/")
                    .setInMemory(false)
                    .setCompressed(false)
                    .setUsername("cetrax")
                    .setPassword("");

            final Cetrax cetraxOnH2 = new CetraxOnH2(H2DataSourceProvider.getDatasource(h2Properties));
            // use loggable wrapper so all calls to cetrax will be logged
            return new LoggableCetrax(cetraxOnH2);
        } catch (final IOException e) {
            logger.error("failed to initialize cetrax:", e);
        }
        return null;
    }
}
