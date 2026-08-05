/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.rw;

import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;

import java.io.IOException;
import java.util.UUID;

class ReadWriteTests {
    private static final String path = "/tmp/cetrax-async-test/" + UUID.randomUUID().toString();

    public static Cetrax getCetrax() throws IOException {
        final Cetrax cetrax = new CetraxOnH2(path);
        return new ReadWriteCetrax(cetrax, cetrax);
    }
}
