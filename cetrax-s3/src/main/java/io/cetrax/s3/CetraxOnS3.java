/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.s3;

import com.amazonaws.services.s3.AmazonS3;
import io.cetrax.Cetrax;
import io.cetrax.Events;
import io.cetrax.Objects;
import io.cetrax.Sets;

import java.io.IOException;

/**
 * This implementation is designed to only use a single s3 bucket.
 */
public class CetraxOnS3 implements Cetrax {
    private final Objects objects;
    private final Events events;

    public CetraxOnS3(final AmazonS3 s3Client, final String bucketName) throws IOException {
        this.objects = new ObjectsOnS3(s3Client, bucketName);
        this.events = new EventsOnS3(s3Client, bucketName);
    }

    @Override
    public Objects objects() {
        return this.objects;
    }

    @Override
    public Sets sets() {
        throw new UnsupportedOperationException("Sets are not implemented on S3");
    }

    @Override
    public Events events() {
        return this.events;
    }
}
