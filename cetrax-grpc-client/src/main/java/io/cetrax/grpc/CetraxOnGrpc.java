/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.grpc;

import io.cetrax.*;

public class CetraxOnGrpc implements Cetrax {
    private final Objects objects;
    private final Sets sets;
    private final Events events;

    public CetraxOnGrpc(final String target) {
        this.objects = new ObjectsOnGrpc(target);
        this.sets = new SetsOnGrpc(target);
        this.events = new EventsOnGrpc(target);
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
