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
 * Represents a Google+ Circle. Currently (12/2011), a Circle is identical to the ContactGroup with
 * matching parameters, but Circle must only be used for true Circles and not other Focus groups,
 * and should be preferred over ContactGroup where applicable. Soon it may become more efficient to
 * check membership in a Circle than in a ContactGroup (see http://go/superglue). Support for this
 * principal type is currently (12/2011) incomplete -- e.g., Keystore does not support it yet (see
 * b/5703421).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityCredentialsCircleProto extends com.google.api.client.json.GenericJson {

  /**
   * Circle ID is unique only relative to the owner's Gaia ID. Currently required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long circleId;

  /**
   * The owner of the circle. Currently required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ownerGaiaId;

  /**
   * If present, then tests for membership in this circle must use data known to be at least as
   * fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-important-
   * write Before using this, be sure that any service checking authorization against this circle
   * supports checking consistency timestamps. For example, as of 12/2011, Keystore only supports
   * this for the Moonshine configuration, and in others authorization checks will fail if the
   * timestamp is present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long requiredConsistencyTimestampUsec;

  /**
   * Circle ID is unique only relative to the owner's Gaia ID. Currently required.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCircleId() {
    return circleId;
  }

  /**
   * Circle ID is unique only relative to the owner's Gaia ID. Currently required.
   * @param circleId circleId or {@code null} for none
   */
  public SecurityCredentialsCircleProto setCircleId(java.lang.Long circleId) {
    this.circleId = circleId;
    return this;
  }

  /**
   * The owner of the circle. Currently required.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOwnerGaiaId() {
    return ownerGaiaId;
  }

  /**
   * The owner of the circle. Currently required.
   * @param ownerGaiaId ownerGaiaId or {@code null} for none
   */
  public SecurityCredentialsCircleProto setOwnerGaiaId(java.lang.Long ownerGaiaId) {
    this.ownerGaiaId = ownerGaiaId;
    return this;
  }

  /**
   * If present, then tests for membership in this circle must use data known to be at least as
   * fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-important-
   * write Before using this, be sure that any service checking authorization against this circle
   * supports checking consistency timestamps. For example, as of 12/2011, Keystore only supports
   * this for the Moonshine configuration, and in others authorization checks will fail if the
   * timestamp is present.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRequiredConsistencyTimestampUsec() {
    return requiredConsistencyTimestampUsec;
  }

  /**
   * If present, then tests for membership in this circle must use data known to be at least as
   * fresh as the given (FBS-assigned) timestamp. See http://go/fbs-consistent-read-after-important-
   * write Before using this, be sure that any service checking authorization against this circle
   * supports checking consistency timestamps. For example, as of 12/2011, Keystore only supports
   * this for the Moonshine configuration, and in others authorization checks will fail if the
   * timestamp is present.
   * @param requiredConsistencyTimestampUsec requiredConsistencyTimestampUsec or {@code null} for none
   */
  public SecurityCredentialsCircleProto setRequiredConsistencyTimestampUsec(java.lang.Long requiredConsistencyTimestampUsec) {
    this.requiredConsistencyTimestampUsec = requiredConsistencyTimestampUsec;
    return this;
  }

  @Override
  public SecurityCredentialsCircleProto set(String fieldName, Object value) {
    return (SecurityCredentialsCircleProto) super.set(fieldName, value);
  }

  @Override
  public SecurityCredentialsCircleProto clone() {
    return (SecurityCredentialsCircleProto) super.clone();
  }

}
