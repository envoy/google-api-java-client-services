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
 * Contains customer data for profile owner proxied from D3.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiCustomerInfo extends com.google.api.client.json.GenericJson {

  /**
   * DEPRECATED. Use obfuscated_customer_id instead. If result has a GSuite Customer ID, this field
   * will continue to be populated with -1 to indicate the presence of a value for backwards
   * compatibility with clients in the wild. See b/144596193.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long customerId;

  /**
   * Customer organization name for dasher user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * Obfuscated FlexOrgs customer ID for Dasher user. See cs/symbol:CustomerIdObfuscator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obfuscatedCustomerId;

  /**
   * DEPRECATED. Use obfuscated_customer_id instead. If result has a GSuite Customer ID, this field
   * will continue to be populated with -1 to indicate the presence of a value for backwards
   * compatibility with clients in the wild. See b/144596193.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCustomerId() {
    return customerId;
  }

  /**
   * DEPRECATED. Use obfuscated_customer_id instead. If result has a GSuite Customer ID, this field
   * will continue to be populated with -1 to indicate the presence of a value for backwards
   * compatibility with clients in the wild. See b/144596193.
   * @param customerId customerId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiCustomerInfo setCustomerId(java.lang.Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer organization name for dasher user.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * Customer organization name for dasher user.
   * @param customerName customerName or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiCustomerInfo setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Obfuscated FlexOrgs customer ID for Dasher user. See cs/symbol:CustomerIdObfuscator.
   * @return value or {@code null} for none
   */
  public java.lang.String getObfuscatedCustomerId() {
    return obfuscatedCustomerId;
  }

  /**
   * Obfuscated FlexOrgs customer ID for Dasher user. See cs/symbol:CustomerIdObfuscator.
   * @param obfuscatedCustomerId obfuscatedCustomerId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiCustomerInfo setObfuscatedCustomerId(java.lang.String obfuscatedCustomerId) {
    this.obfuscatedCustomerId = obfuscatedCustomerId;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiCustomerInfo set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiCustomerInfo) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiCustomerInfo clone() {
    return (AppsPeopleOzExternalMergedpeopleapiCustomerInfo) super.clone();
  }

}
