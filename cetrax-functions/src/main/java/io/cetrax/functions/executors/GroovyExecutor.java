/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.functions.executors;

import io.cetrax.functions.Context;
import io.cetrax.functions.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Executor for functions implemented in Groovy.
 */
public class GroovyExecutor implements Executor {
    private static final Logger logger = LoggerFactory.getLogger(GroovyExecutor.class);

    @Override
    public List<String> getExtensions() {
        return Collections.singletonList("g");
    }

    @Override
    public void run(final String function,
                    final byte[] body,
                    final Context context,
                    final Map<String, String> params)
            throws IOException {
    }
}
