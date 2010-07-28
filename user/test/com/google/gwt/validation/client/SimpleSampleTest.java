/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.validation.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for {@link SimpleSample}.
 */
public class SimpleSampleTest extends GWTTestCase {
  SimpleSample sample;

  @Override
  protected void gwtSetUp() {
    sample = new SimpleSample();
  }

  public void testAnnotatedClassCompiles() throws Exception {
    // Only tests that validation annotated class compile
    assertEquals(null, sample.getName());
  }

  @Override
  public String getModuleName() {
    return "com.google.gwt.validation.Validation";
  }
}
