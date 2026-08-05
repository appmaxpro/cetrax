/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.async;

import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AsyncTests {
    private static final String path = "/tmp/cetrax-async-test/" + UUID.randomUUID().toString();
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static Cetrax getCetrax() throws IOException {
        return new AsyncCetrax(new CetraxOnH2(path), executor);
    }
}
