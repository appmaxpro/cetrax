/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.async;

import io.cetrax.Cetrax;
import io.cetrax.common.AbstractBaseEventsTest;

import java.io.IOException;

public class AsyncEventsTest extends AbstractBaseEventsTest {
    @Override
    public Cetrax getCetrax() throws IOException {
        return AsyncTests.getCetrax();
    }
}