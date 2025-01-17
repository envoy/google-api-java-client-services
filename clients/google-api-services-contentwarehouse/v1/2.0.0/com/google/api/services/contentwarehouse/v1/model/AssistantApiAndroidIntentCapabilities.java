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
 * Capabilities related to Android intent support. These capabilities can apply to any device on the
 * Android platform. Provides the list of Android package names that support a given Android intent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiAndroidIntentCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantApiAndroidIntentCapabilitiesAndroidIntentCapability> androidIntentCapability;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantApiAndroidIntentCapabilitiesAndroidIntentCapability> getAndroidIntentCapability() {
    return androidIntentCapability;
  }

  /**
   * @param androidIntentCapability androidIntentCapability or {@code null} for none
   */
  public AssistantApiAndroidIntentCapabilities setAndroidIntentCapability(java.util.List<AssistantApiAndroidIntentCapabilitiesAndroidIntentCapability> androidIntentCapability) {
    this.androidIntentCapability = androidIntentCapability;
    return this;
  }

  @Override
  public AssistantApiAndroidIntentCapabilities set(String fieldName, Object value) {
    return (AssistantApiAndroidIntentCapabilities) super.set(fieldName, value);
  }

  @Override
  public AssistantApiAndroidIntentCapabilities clone() {
    return (AssistantApiAndroidIntentCapabilities) super.clone();
  }

}
