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
 * Routines team stores the core Structure Based Routine data as the payload. We will add specific
 * metadata on a per-need basis. LINT.IfChange(proto_structure_based_routine) Next id: 12 These two
 * forms of payload are equivalent data in different formats and both will be stored in Home Graph.
 * 1. The internal format will fan out to the DynamicEntity Footprints for read in Settings flow and
 * Execution. 2. The UI format will be stripped out upon replication to DynamicEntity Footprints due
 * to its redundancy and the Footprints data size limit, i.e. DE Footprints will only contain the
 * internal format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine extends com.google.api.client.json.GenericJson {

  /**
   * Whether this Routine is enabled or not. If false, then this Routine can't be triggered by
   * Voice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The unique identifier for a class of workflows. For example: * "sbr_001" => Away * "sbr_002" =>
   * Home * "category_template" => CUSTOM
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googlePreconfigWorkflowId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * Internal format payload primarily for Routines team use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * The security level of the Structure Based Routine as determined by the most security-sensitive
   * task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityLevel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shared;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> storagePayload;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String structureId;

  /**
   * Voice or event triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutineTrigger> triggers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * UI format payload primarily for external team use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> uiPayload;

  /**
   * Whether this Routine is enabled or not. If false, then this Routine can't be triggered by
   * Voice.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether this Routine is enabled or not. If false, then this Routine can't be triggered by
   * Voice.
   * @param enabled enabled or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The unique identifier for a class of workflows. For example: * "sbr_001" => Away * "sbr_002" =>
   * Home * "category_template" => CUSTOM
   * @return value or {@code null} for none
   */
  public java.lang.String getGooglePreconfigWorkflowId() {
    return googlePreconfigWorkflowId;
  }

  /**
   * The unique identifier for a class of workflows. For example: * "sbr_001" => Away * "sbr_002" =>
   * Home * "category_template" => CUSTOM
   * @param googlePreconfigWorkflowId googlePreconfigWorkflowId or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setGooglePreconfigWorkflowId(java.lang.String googlePreconfigWorkflowId) {
    this.googlePreconfigWorkflowId = googlePreconfigWorkflowId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * @param language language or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Internal format payload primarily for Routines team use.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Internal format payload primarily for Routines team use.
   * @param payload payload or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * The security level of the Structure Based Routine as determined by the most security-sensitive
   * task.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityLevel() {
    return securityLevel;
  }

  /**
   * The security level of the Structure Based Routine as determined by the most security-sensitive
   * task.
   * @param securityLevel securityLevel or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setSecurityLevel(java.lang.String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShared() {
    return shared;
  }

  /**
   * @param shared shared or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setShared(java.lang.Boolean shared) {
    this.shared = shared;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getStoragePayload() {
    return storagePayload;
  }

  /**
   * @param storagePayload storagePayload or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setStoragePayload(java.util.Map<String, java.lang.Object> storagePayload) {
    this.storagePayload = storagePayload;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStructureId() {
    return structureId;
  }

  /**
   * @param structureId structureId or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setStructureId(java.lang.String structureId) {
    this.structureId = structureId;
    return this;
  }

  /**
   * Voice or event triggers.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutineTrigger> getTriggers() {
    return triggers;
  }

  /**
   * Voice or event triggers.
   * @param triggers triggers or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setTriggers(java.util.List<AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutineTrigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * UI format payload primarily for external team use.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getUiPayload() {
    return uiPayload;
  }

  /**
   * UI format payload primarily for external team use.
   * @param uiPayload uiPayload or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine setUiPayload(java.util.Map<String, java.lang.Object> uiPayload) {
    this.uiPayload = uiPayload;
    return this;
  }

  @Override
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine set(String fieldName, Object value) {
    return (AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine) super.set(fieldName, value);
  }

  @Override
  public AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine clone() {
    return (AssistantVerticalsHomeautomationProtoCommonStructureBasedRoutine) super.clone();
  }

}
