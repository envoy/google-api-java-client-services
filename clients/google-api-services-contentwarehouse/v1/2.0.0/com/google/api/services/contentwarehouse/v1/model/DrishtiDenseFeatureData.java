/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Model definition for DrishtiDenseFeatureData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DrishtiDenseFeatureData extends com.google.api.client.json.GenericJson {

  /**
   * If extra is present it must be of the same length as value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DrishtiFeatureExtra> extra;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DrishtiFeatureExtra generalExtra;

  /**
   * Dense data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> value;

  /**
   * If extra is present it must be of the same length as value.
   * @return value or {@code null} for none
   */
  public java.util.List<DrishtiFeatureExtra> getExtra() {
    return extra;
  }

  /**
   * If extra is present it must be of the same length as value.
   * @param extra extra or {@code null} for none
   */
  public DrishtiDenseFeatureData setExtra(java.util.List<DrishtiFeatureExtra> extra) {
    this.extra = extra;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DrishtiFeatureExtra getGeneralExtra() {
    return generalExtra;
  }

  /**
   * @param generalExtra generalExtra or {@code null} for none
   */
  public DrishtiDenseFeatureData setGeneralExtra(DrishtiFeatureExtra generalExtra) {
    this.generalExtra = generalExtra;
    return this;
  }

  /**
   * Dense data.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getValue() {
    return value;
  }

  /**
   * Dense data.
   * @param value value or {@code null} for none
   */
  public DrishtiDenseFeatureData setValue(java.util.List<java.lang.Float> value) {
    this.value = value;
    return this;
  }

  @Override
  public DrishtiDenseFeatureData set(String fieldName, Object value) {
    return (DrishtiDenseFeatureData) super.set(fieldName, value);
  }

  @Override
  public DrishtiDenseFeatureData clone() {
    return (DrishtiDenseFeatureData) super.clone();
  }

}
