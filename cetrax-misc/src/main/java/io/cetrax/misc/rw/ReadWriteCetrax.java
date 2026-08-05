/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.misc.rw;

import io.cetrax.*;
import static io.cetrax.common.CommonPreconditions.checkArgument;

public class ReadWriteCetrax implements Cetrax {
    private final ReadWriteObjects objects;
    private final ReadWriteSets sets;
    private final ReadWriteEvents events;

    public ReadWriteCetrax(final Cetrax writable, final Cetrax readable) {
        checkArgument(writable != null, "null writable");
        checkArgument(readable != null, "null readable");

        this.objects = new ReadWriteObjects(writable.objects(), readable.objects());
        this.sets = new ReadWriteSets(writable.sets(), readable.sets());
        this.events = new ReadWriteEvents(writable.events(), readable.events());
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
