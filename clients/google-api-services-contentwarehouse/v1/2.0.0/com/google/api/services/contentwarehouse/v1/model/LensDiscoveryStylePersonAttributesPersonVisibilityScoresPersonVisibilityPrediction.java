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
 * Model definition for
 * LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction extends com.google.api.client.json.GenericJson {

  /**
   * Confidence score of the visibility type prediction discretized into range [0, 100].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer discretizedIconicPersonVisibilityConfidence;

  /**
   * Classification of how much of the body of the most iconic person in the image is visible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconicPersonVisibilityType;

  /**
   * Confidence score of the visibility type prediction discretized into range [0, 100].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiscretizedIconicPersonVisibilityConfidence() {
    return discretizedIconicPersonVisibilityConfidence;
  }

  /**
   * Confidence score of the visibility type prediction discretized into range [0, 100].
   * @param discretizedIconicPersonVisibilityConfidence discretizedIconicPersonVisibilityConfidence or {@code null} for none
   */
  public LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction setDiscretizedIconicPersonVisibilityConfidence(java.lang.Integer discretizedIconicPersonVisibilityConfidence) {
    this.discretizedIconicPersonVisibilityConfidence = discretizedIconicPersonVisibilityConfidence;
    return this;
  }

  /**
   * Classification of how much of the body of the most iconic person in the image is visible.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconicPersonVisibilityType() {
    return iconicPersonVisibilityType;
  }

  /**
   * Classification of how much of the body of the most iconic person in the image is visible.
   * @param iconicPersonVisibilityType iconicPersonVisibilityType or {@code null} for none
   */
  public LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction setIconicPersonVisibilityType(java.lang.String iconicPersonVisibilityType) {
    this.iconicPersonVisibilityType = iconicPersonVisibilityType;
    return this;
  }

  @Override
  public LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction set(String fieldName, Object value) {
    return (LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction) super.set(fieldName, value);
  }

  @Override
  public LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction clone() {
    return (LensDiscoveryStylePersonAttributesPersonVisibilityScoresPersonVisibilityPrediction) super.clone();
  }

}
