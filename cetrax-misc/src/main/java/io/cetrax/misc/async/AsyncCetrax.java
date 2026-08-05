/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.async;

import io.cetrax.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

import static io.cetrax.common.CommonPreconditions.checkArgument;

public class AsyncCetrax implements Cetrax {
    private static final Logger logger = LoggerFactory.getLogger(AsyncCetrax.class);

    private final AsyncObjects objects;
    private final AsyncSets sets;
    private final AsyncEvents events;

    public AsyncCetrax(final Cetrax delegate, final ExecutorService executorService) {
        checkArgument(delegate != null, "null delegate");
        checkArgument(executorService != null, "null executor service");

        logger.info("new instance of async cetrax created");

        this.objects = new AsyncObjects(delegate.objects(), executorService);
        this.sets = new AsyncSets(delegate.sets(), executorService);
        this.events = new AsyncEvents(delegate.events(), executorService);
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
