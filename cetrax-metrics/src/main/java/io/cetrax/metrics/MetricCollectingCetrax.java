/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.metrics;

import com.codahale.metrics.MetricRegistry;
import io.cetrax.Cetrax;
import io.cetrax.Events;
import io.cetrax.Objects;
import io.cetrax.Sets;

public class MetricCollectingCetrax implements Cetrax {
    private final Objects objects;
    private final Sets sets;
    private final Events events;

    public MetricCollectingCetrax(final MetricRegistry metrics, final Cetrax delegate) {
        this.objects = new MetricCollectingObjects(metrics, delegate.objects());
        this.sets = new MetricCollectingSets(metrics, delegate.sets());
        this.events = new MetricCollectingEvents(metrics, delegate.events());
    }

    @Override
    public Objects objects() {
        return this.objects;
    }

    @Override
    public Sets sets() {
        return this.sets;
    }

    @Override
    public Events events() {
        return this.events;
    }
}
