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
 * Represents the set of members (of a given type) in a Google+ Square (see http://go/squares). A
 * Square with default member_type is currently (1/2012) identical to the GaiaGroup with the same
 * ID, but that is expected to change soon (see http://go/superglue). Support for this principal
 * type is currently (1/2012) incomplete -- e.g., Keystore does not support it yet (see b/5703421).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityCredentialsSquareProto extends com.google.api.client.json.GenericJson {

  /**
   * The type of Square members to consider, e.g. "all members" vs. "owners" vs. "admins". These are
   * defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options
   * in social/graph/storage/proto/id.proto. See square.pb (defined in
   * production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types
   * associated with square. Currently required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberType;

  /**
   * Currently required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long squareId;

  /**
   * The type of Square members to consider, e.g. "all members" vs. "owners" vs. "admins". These are
   * defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options
   * in social/graph/storage/proto/id.proto. See square.pb (defined in
   * production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types
   * associated with square. Currently required.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberType() {
    return memberType;
  }

  /**
   * The type of Square members to consider, e.g. "all members" vs. "owners" vs. "admins". These are
   * defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options
   * in social/graph/storage/proto/id.proto. See square.pb (defined in
   * production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types
   * associated with square. Currently required.
   * @param memberType memberType or {@code null} for none
   */
  public SecurityCredentialsSquareProto setMemberType(java.lang.Integer memberType) {
    this.memberType = memberType;
    return this;
  }

  /**
   * Currently required.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSquareId() {
    return squareId;
  }

  /**
   * Currently required.
   * @param squareId squareId or {@code null} for none
   */
  public SecurityCredentialsSquareProto setSquareId(java.lang.Long squareId) {
    this.squareId = squareId;
    return this;
  }

  @Override
  public SecurityCredentialsSquareProto set(String fieldName, Object value) {
    return (SecurityCredentialsSquareProto) super.set(fieldName, value);
  }

  @Override
  public SecurityCredentialsSquareProto clone() {
    return (SecurityCredentialsSquareProto) super.clone();
  }

}
