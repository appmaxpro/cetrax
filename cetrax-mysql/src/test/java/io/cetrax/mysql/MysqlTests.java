/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.mysql;

import io.cetrax.Cetrax;

import javax.sql.DataSource;
import java.io.IOException;

class MysqlTests {
    private static final Cetrax CETRAX;

    static {
        try {
            CETRAX = new CetraxOnMysql(getDataSource());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Cetrax getCetrax() throws IOException {
        return CETRAX;
    }

    private static DataSource getDataSource() {
        return MysqlDataSourceProvider.getDatasource(
                new MysqlDataSourceProperties()
                        .setHostname("localhost")
                        .setPort(3306)
        );
    }

}
