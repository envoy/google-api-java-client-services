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
 * Constraints for the occupancy of a hotel or vacation rental.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingLocalRoomConstraint extends com.google.api.client.json.GenericJson {

  /**
   * It is possible to have fractional bathrooms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minNumBathrooms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long minNumBedrooms;

  /**
   * It is possible to have fractional bathrooms.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinNumBathrooms() {
    return minNumBathrooms;
  }

  /**
   * It is possible to have fractional bathrooms.
   * @param minNumBathrooms minNumBathrooms or {@code null} for none
   */
  public NlpSemanticParsingLocalRoomConstraint setMinNumBathrooms(java.lang.Double minNumBathrooms) {
    this.minNumBathrooms = minNumBathrooms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinNumBedrooms() {
    return minNumBedrooms;
  }

  /**
   * @param minNumBedrooms minNumBedrooms or {@code null} for none
   */
  public NlpSemanticParsingLocalRoomConstraint setMinNumBedrooms(java.lang.Long minNumBedrooms) {
    this.minNumBedrooms = minNumBedrooms;
    return this;
  }

  @Override
  public NlpSemanticParsingLocalRoomConstraint set(String fieldName, Object value) {
    return (NlpSemanticParsingLocalRoomConstraint) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingLocalRoomConstraint clone() {
    return (NlpSemanticParsingLocalRoomConstraint) super.clone();
  }

}
