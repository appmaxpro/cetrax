/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.grpc;

import io.cetrax.Cetrax;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigValueFactory;

import java.util.concurrent.ThreadLocalRandom;

import static io.cetrax.server.Constants.PATH_CONFIG_FILE;

class GrpcTests {
    private static final int randomPort = ThreadLocalRandom.current().nextInt(10000, 30000);
    private static final Cetrax CETRAX = new CetraxOnGrpc("localhost:" + randomPort);

    static Cetrax getCetrax() {
        return CETRAX;
    }

    static io.cetrax.server.CetraxEnvironment getTestCetraxProperties() {
        final Config cetraxProperties = ConfigFactory
                .load(PATH_CONFIG_FILE)
                .withValue("cetrax.grpc.port", ConfigValueFactory.fromAnyRef(randomPort));
        return new io.cetrax.server.CetraxEnvironment(cetraxProperties);
    }
}
