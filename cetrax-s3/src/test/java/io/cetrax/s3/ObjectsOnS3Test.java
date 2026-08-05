/*
 * Copyright (c) 2020, Salesforce.com, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package io.cetrax.s3;

import com.adobe.testing.s3mock.testng.S3Mock;
import com.adobe.testing.s3mock.testng.S3MockListener;
import io.cetrax.common.AbstractBaseObjectsTest;

//@Listeners(value = { S3MockListener.class })
//@Test(enabled = false)
//public class ObjectsOnS3Test extends AbstractBaseObjectsTest {
//
//    @Override
//    protected double getStoreMagnitude() {
//        return 0.25;
//    }
//
//    @Override
//    protected Cetrax getCetrax() throws IOException {
//        final AmazonS3 s3Client = S3Mock.getInstance().createS3Client("us-west-1");
//        s3Client.createBucket("default");
//        return new CetraxOnS3(s3Client, "default");
//    }
//}
