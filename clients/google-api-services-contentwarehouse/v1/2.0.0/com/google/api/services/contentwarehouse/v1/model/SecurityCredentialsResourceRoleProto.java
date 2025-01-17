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
 * A type of sharing target that points to some resource's ACL. Used to refer to the set of
 * Principals that have the given privilege ('role_id') for the given resource ('application_id',
 * 'object_id', 'object_part'). The meaning of 'role_id' is interpreted only by implementations of
 * AclRpcService and is usually dependent on 'application_id' All fields except object_part are
 * required. If present, object_part must be non-empty.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityCredentialsResourceRoleProto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectPart;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer roleId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationId() {
    return applicationId;
  }

  /**
   * @param applicationId applicationId or {@code null} for none
   */
  public SecurityCredentialsResourceRoleProto setApplicationId(java.lang.String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * @param objectId objectId or {@code null} for none
   */
  public SecurityCredentialsResourceRoleProto setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectPart() {
    return objectPart;
  }

  /**
   * @param objectPart objectPart or {@code null} for none
   */
  public SecurityCredentialsResourceRoleProto setObjectPart(java.lang.String objectPart) {
    this.objectPart = objectPart;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRoleId() {
    return roleId;
  }

  /**
   * @param roleId roleId or {@code null} for none
   */
  public SecurityCredentialsResourceRoleProto setRoleId(java.lang.Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  @Override
  public SecurityCredentialsResourceRoleProto set(String fieldName, Object value) {
    return (SecurityCredentialsResourceRoleProto) super.set(fieldName, value);
  }

  @Override
  public SecurityCredentialsResourceRoleProto clone() {
    return (SecurityCredentialsResourceRoleProto) super.clone();
  }

}
