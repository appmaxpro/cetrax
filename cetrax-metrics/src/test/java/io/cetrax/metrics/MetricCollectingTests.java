/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.metrics;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Slf4jReporter;
import io.cetrax.Cetrax;
import io.cetrax.h2.CetraxOnH2;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

class MetricCollectingTests {
    private static final String path = "/tmp/cetrax-metric-collecting-test/" + UUID.randomUUID().toString();

    public static Cetrax getCetrax() throws IOException {
        final MetricRegistry registry = new MetricRegistry();
        Slf4jReporter.forRegistry(registry)
                .outputTo(LoggerFactory.getLogger(MetricCollectingTests.class))
                .withLoggingLevel(Slf4jReporter.LoggingLevel.INFO)
                .build()
                .start(1L, TimeUnit.SECONDS);
        return new MetricCollectingCetrax(registry, new CetraxOnH2(Paths.get(path, "cetrax").toString()));
    }
}
