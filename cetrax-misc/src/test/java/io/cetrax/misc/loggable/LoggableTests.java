/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.loggable;

import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;

import java.io.IOException;
import java.util.UUID;

class LoggableTests {
    private static final String path = "/tmp/cetrax-loggable-test/" + UUID.randomUUID().toString();

    public static Cetrax getCetrax() throws IOException {
        return new LoggableCetrax(new CetraxOnH2(path));
    }
}
