/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.sharded;

import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;

import java.io.IOException;
import java.util.UUID;

class ShardedTests {
    private static final String path = "/tmp/cetrax-sharded-test/" + UUID.randomUUID().toString();
    private static final Cetrax CETRAX;
    private static final int shardsCount = 5;

    static {
        final Cetrax[] shards = new Cetrax[shardsCount];
        for (int i = 0; i < shardsCount; ++i) {
            try {
                shards[i] = new CetraxOnH2(String.format("%s/shard-%d", path, i));
//                shards[i] = new CetraxOnMysql("localhost", 3306 + i, null, null);
            } catch (IOException e) {}
        }
        CETRAX = new ShardedCetrax(shards);
    }

    public static Cetrax getCetrax() {
        return CETRAX;
    }
}
