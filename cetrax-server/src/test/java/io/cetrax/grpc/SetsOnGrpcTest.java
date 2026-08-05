/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.grpc;

import io.cetrax.Cetrax;
import io.cetrax.common.AbstractBaseSetsTest;
import io.cetrax.server.grpc.GrpcServer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class SetsOnGrpcTest extends AbstractBaseSetsTest {
    private GrpcServer server = new GrpcServer(GrpcTests.getTestCetraxProperties());

    public SetsOnGrpcTest() throws IOException {
    }

    @BeforeClass
    private void start() throws IOException {
        this.server.start();
    }

    @AfterClass
    private void stop() throws IOException {
        this.server.shutdown();
    }

    @Override
    public Cetrax getCetrax() {
        return GrpcTests.getCetrax();
    }
}
