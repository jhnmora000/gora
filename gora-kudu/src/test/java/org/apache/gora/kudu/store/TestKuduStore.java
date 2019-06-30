/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.gora.kudu.store;

import org.apache.gora.kudu.GoraKuduTestDriver;
import org.apache.gora.store.DataStoreTestBase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test case for KuduStore.
 */
public class TestKuduStore extends DataStoreTestBase {

  static {
    setTestDriver(new GoraKuduTestDriver());
  }

  @Test
  @Override
  public void testCreateSchema() throws Exception {
    super.testCreateSchema();
  }

  @Test
  @Override
  public void testSchemaExists() throws Exception {
    super.testSchemaExists();
  }
  @Test
  @Override
  public void testPut() throws Exception {
    super.testPut();
  }
  @Test
  @Override
  public void testExists() throws Exception {
    super.testExists();
  }

  @Test
  @Override
  public void testBenchamarkExists() throws Exception {
    super.testBenchamarkExists();
  }

  @Test
  @Ignore
  @Override
  public void testAutoCreateSchema() throws Exception {
    super.testAutoCreateSchema();
  }

  @Test
  @Ignore
  @Override
  public void testTruncateSchema() throws Exception {
    super.testTruncateSchema();
  }

  @Test
  @Ignore
  @Override
  public void testDeleteSchema() throws Exception {
    super.testDeleteSchema();
  }

  @Test
  @Ignore
  @Override
  public void testNewInstance() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testPutNested() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testPutArray() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testPutBytes() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testPutMap() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testPutMixedMaps() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testUpdate() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testEmptyUpdate() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGet() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetRecursive() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetDoubleRecursive() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetNested() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGet3UnionField() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetWithFields() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetWebPage() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetWebPageDefaultFields() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetNonExisting() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQuery() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryStartKey() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryEndKey() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryKeyRange() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryWebPageSingleKey() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryWebPageSingleKeyDefaultFields() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testQueryWebPageQueryEmptyResults() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testDelete() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testDeleteByQuery() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testDeleteByQueryFields() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testGetPartitions() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSize() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeStartKey() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeEndKey() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeKeyRange() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeWithLimit() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeStartKeyWithLimit() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeEndKeyWithLimit() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testResultSizeKeyRangeWithLimit() throws Exception {
  }

  @Test
  @Ignore
  @Override
  public void testObjectFieldValue() throws Exception {
  }

}