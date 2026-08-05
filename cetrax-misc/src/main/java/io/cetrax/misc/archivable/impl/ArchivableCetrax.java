/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.archivable.impl;

import io.cetrax.Cetrax;
import io.cetrax.Events;
import io.cetrax.Objects;
import io.cetrax.Sets;
import io.cetrax.misc.archivable.CetraxArchiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.cetrax.common.CommonPreconditions.checkArgument;

/**
 * The ArchivableCetrax implementation is a wrapper around a delegate Cetrax instance and a {@link CetraxArchiver} reference.
 * The {@code delegate} is the main data-store which is used directly for {@link Sets} and {@link Objects}.
 * The {@code archiveDelegate} is used to archive any events removed when calling {@link Events#expire} for
 * longer term storage.
 * <br/>
 * Use it like this:
 * <pre>
 * Cetrax delegate = ...
 * Archiver archiver = ...
 * Cetrax cetrax = new ArchivableCetrax(delegate, archiver);
 * </pre>
 */
public class ArchivableCetrax implements Cetrax {
    private static final Logger logger = LoggerFactory.getLogger(ArchivableCetrax.class);

    private final Objects objects;
    private final Sets sets;
    private final Events events;

    public ArchivableCetrax(final Cetrax delegate, final CetraxArchiver archiver) {
        checkArgument(delegate != null, "null delegate");
        checkArgument(archiver != null, "null archiver");

        logger.info("new instance of archivable cetrax created");

        //TODO: add support for ArchivableObjects and ArchivableSets
        this.objects = delegate.objects();
        this.sets = delegate.sets();
        this.events = new ArchivableEvents(delegate.events(), archiver.events());
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
