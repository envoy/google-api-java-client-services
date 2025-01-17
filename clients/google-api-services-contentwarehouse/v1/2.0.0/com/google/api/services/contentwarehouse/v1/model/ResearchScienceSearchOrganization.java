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
 * Organization, such as the source of a dataset or a funder NOTE: source_organization_mid and
 * source_organization_mid_label should always have the same length: the mid and label correspond to
 * each other. We don't use a map for consistency with Location and if we switch to map, we should
 * switch to it in both. Next ID: 6
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResearchScienceSearchOrganization extends com.google.api.client.json.GenericJson {

  /**
   * KG mid for the organization or person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> organizationMid;

  /**
   * Label (in the preferred language of the dataset) for the mid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> organizationMidLabel;

  /**
   * Unreconciled organization name. We store it here only if there are no organization_mid values
   * present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizationName;

  /**
   * Original organization url
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizationUrl;

  /**
   * Original name before reconciliation; empty if not reconciled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalOrganizationName;

  /**
   * KG mid for the organization or person.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOrganizationMid() {
    return organizationMid;
  }

  /**
   * KG mid for the organization or person.
   * @param organizationMid organizationMid or {@code null} for none
   */
  public ResearchScienceSearchOrganization setOrganizationMid(java.util.List<java.lang.String> organizationMid) {
    this.organizationMid = organizationMid;
    return this;
  }

  /**
   * Label (in the preferred language of the dataset) for the mid.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOrganizationMidLabel() {
    return organizationMidLabel;
  }

  /**
   * Label (in the preferred language of the dataset) for the mid.
   * @param organizationMidLabel organizationMidLabel or {@code null} for none
   */
  public ResearchScienceSearchOrganization setOrganizationMidLabel(java.util.List<java.lang.String> organizationMidLabel) {
    this.organizationMidLabel = organizationMidLabel;
    return this;
  }

  /**
   * Unreconciled organization name. We store it here only if there are no organization_mid values
   * present.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizationName() {
    return organizationName;
  }

  /**
   * Unreconciled organization name. We store it here only if there are no organization_mid values
   * present.
   * @param organizationName organizationName or {@code null} for none
   */
  public ResearchScienceSearchOrganization setOrganizationName(java.lang.String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * Original organization url
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizationUrl() {
    return organizationUrl;
  }

  /**
   * Original organization url
   * @param organizationUrl organizationUrl or {@code null} for none
   */
  public ResearchScienceSearchOrganization setOrganizationUrl(java.lang.String organizationUrl) {
    this.organizationUrl = organizationUrl;
    return this;
  }

  /**
   * Original name before reconciliation; empty if not reconciled.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalOrganizationName() {
    return originalOrganizationName;
  }

  /**
   * Original name before reconciliation; empty if not reconciled.
   * @param originalOrganizationName originalOrganizationName or {@code null} for none
   */
  public ResearchScienceSearchOrganization setOriginalOrganizationName(java.lang.String originalOrganizationName) {
    this.originalOrganizationName = originalOrganizationName;
    return this;
  }

  @Override
  public ResearchScienceSearchOrganization set(String fieldName, Object value) {
    return (ResearchScienceSearchOrganization) super.set(fieldName, value);
  }

  @Override
  public ResearchScienceSearchOrganization clone() {
    return (ResearchScienceSearchOrganization) super.clone();
  }

}
