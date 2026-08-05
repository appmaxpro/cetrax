/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.loggable;

import io.cetrax.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.cetrax.common.CommonPreconditions.checkArgument;

/**
 * The LoggableCetrax implementation is a wrapper around a delegate Cetrax instance, adding
 * logging to each method call. The log line contains the method called along with parameters and
 * time spent on the call.
 *
 * Use it like this:
 *
 * Cetrax delegate = ...
 * Cetrax cetrax = new LoggableCetrax(delegate);
 */
public class LoggableCetrax implements Cetrax {
    private static final Logger logger = LoggerFactory.getLogger(LoggableCetrax.class);

    private final Objects objects;
    private final Sets sets;
    private final Events events;

    public LoggableCetrax(final Cetrax delegate) {
        checkArgument(delegate != null, "null delegate");

        logger.info("new instance of loggable cetrax created");

        this.objects = new LoggableObjects(delegate.objects());
        this.sets = new LoggableSets(delegate.sets());
        this.events = new LoggableEvents(delegate.events());
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
