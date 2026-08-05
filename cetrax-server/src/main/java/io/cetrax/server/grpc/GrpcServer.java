/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.server.grpc;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.cetrax.Cetrax;
import io.cetrax.grpc.EventsGrpcService;
import io.cetrax.grpc.ObjectsGrpcService;
import io.cetrax.grpc.SetsGrpcService;
import io.cetrax.server.Constants;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class GrpcServer {
    private static final Logger logger = LoggerFactory.getLogger(GrpcServer.class);

    private final Server server;

    public GrpcServer(final io.cetrax.server.CetraxEnvironment cetraxEnvironment) throws IOException {
        final io.cetrax.server.utils.CetraxFactory cetraxProvider = new io.cetrax.server.utils.CetraxFactory(cetraxEnvironment);

        final int port = cetraxEnvironment.getConfigAsInteger(Constants.CANTOR_PORT_GRPC, -1);
        logger.info("creating new grpc server listening on port '{}' with storage type: '{}'",
                port,
                cetraxEnvironment.getStorageType()
        );

        final Cetrax cetrax = cetraxProvider.getCetrax();
        this.server = ServerBuilder
                .forPort(port)
                .maxInboundMessageSize(64 * 1024 * 1024) // 64MB
                .addService(new ObjectsGrpcService(cetrax))
                .addService(new SetsGrpcService(cetrax))
                .addService(new EventsGrpcService(cetrax))
                .executor(Executors.newCachedThreadPool(
                        new ThreadFactoryBuilder().setNameFormat("cetrax-grpc-worker-%d").build())
                )
                .build();

        addShutdownHook();
    }

    public CompletableFuture<?> start() {
        return CompletableFuture.runAsync(() -> {
            try {
                Thread.currentThread().setName("cetrax-grpc-server-main-thread");
                logger.info("starting grpc server...");
                this.server.start();
                blockUntilShutdown();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void shutdown() {
        this.server.shutdown();
    }

    private void addShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(GrpcServer.this::stop));
    }

    private void stop() {
        if (this.server != null) {
            this.server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (this.server != null) {
            this.server.awaitTermination();
        }
    }

}

