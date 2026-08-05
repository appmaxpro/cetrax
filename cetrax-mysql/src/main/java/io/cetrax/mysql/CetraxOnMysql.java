/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.mysql;

import io.cetrax.*;

import javax.sql.DataSource;
import java.io.IOException;

public class CetraxOnMysql implements Cetrax {
    private final Objects objects;
    private final Sets sets;
    private final Events events;

    public CetraxOnMysql(final String hostname, final int port, final String username, final String password)
            throws IOException {
        this.objects = new ObjectsOnMysql(hostname, port, username, password);
        this.sets = new SetsOnMysql(hostname, port, username, password);
        this.events = new EventsOnMysql(hostname, port, username, password);
    }

    public CetraxOnMysql(final DataSource dataSource) throws IOException {
        this.objects = new ObjectsOnMysql(dataSource);
        this.sets = new SetsOnMysql(dataSource);
        this.events = new EventsOnMysql(dataSource);
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
