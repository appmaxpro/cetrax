/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.h2;

import io.cetrax.Cetrax;

import java.io.IOException;
import java.util.UUID;

class H2Tests {
    private static final String path = "/tmp/cetrax-test-db/" + UUID.randomUUID().toString();

    static Cetrax getCetrax() throws IOException {
        return new CetraxOnH2(path);
    }
}
