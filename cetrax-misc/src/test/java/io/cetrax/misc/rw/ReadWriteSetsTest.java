/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.rw;

import io.cetrax.Cetrax;
import io.cetrax.common.AbstractBaseSetsTest;

import java.io.IOException;

public class ReadWriteSetsTest extends AbstractBaseSetsTest {
    @Override
    public Cetrax getCetrax() throws IOException {
        return ReadWriteTests.getCetrax();
    }
}