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
 * Specifies the desired format for the server to use when it returns `audio_out` messages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAssistantAccessoryV1AudioOutConfig extends com.google.api.client.json.GenericJson {

  /**
   * Current audio mode on the device while issuing the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioMode;

  /**
   * Current audio routing on the device while issuing the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioRoutingMode;

  /**
   * *Required* The encoding of audio data to be returned in all `audio_out` messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encoding;

  /**
   * *Optional* Specifies preferred encoding bitrate (bits-per-second). Currently this is only
   * implemented for OGG_OPUS for bitrates of 12000, 16000, 24000, 32000. If not specified, OGG_OPUS
   * defaults to 32000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer preferredBitrateBps;

  /**
   * Current audio mode on the device while issuing the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioMode() {
    return audioMode;
  }

  /**
   * Current audio mode on the device while issuing the query.
   * @param audioMode audioMode or {@code null} for none
   */
  public GoogleAssistantAccessoryV1AudioOutConfig setAudioMode(java.lang.String audioMode) {
    this.audioMode = audioMode;
    return this;
  }

  /**
   * Current audio routing on the device while issuing the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioRoutingMode() {
    return audioRoutingMode;
  }

  /**
   * Current audio routing on the device while issuing the query.
   * @param audioRoutingMode audioRoutingMode or {@code null} for none
   */
  public GoogleAssistantAccessoryV1AudioOutConfig setAudioRoutingMode(java.lang.String audioRoutingMode) {
    this.audioRoutingMode = audioRoutingMode;
    return this;
  }

  /**
   * *Required* The encoding of audio data to be returned in all `audio_out` messages.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncoding() {
    return encoding;
  }

  /**
   * *Required* The encoding of audio data to be returned in all `audio_out` messages.
   * @param encoding encoding or {@code null} for none
   */
  public GoogleAssistantAccessoryV1AudioOutConfig setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * *Optional* Specifies preferred encoding bitrate (bits-per-second). Currently this is only
   * implemented for OGG_OPUS for bitrates of 12000, 16000, 24000, 32000. If not specified, OGG_OPUS
   * defaults to 32000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPreferredBitrateBps() {
    return preferredBitrateBps;
  }

  /**
   * *Optional* Specifies preferred encoding bitrate (bits-per-second). Currently this is only
   * implemented for OGG_OPUS for bitrates of 12000, 16000, 24000, 32000. If not specified, OGG_OPUS
   * defaults to 32000.
   * @param preferredBitrateBps preferredBitrateBps or {@code null} for none
   */
  public GoogleAssistantAccessoryV1AudioOutConfig setPreferredBitrateBps(java.lang.Integer preferredBitrateBps) {
    this.preferredBitrateBps = preferredBitrateBps;
    return this;
  }

  @Override
  public GoogleAssistantAccessoryV1AudioOutConfig set(String fieldName, Object value) {
    return (GoogleAssistantAccessoryV1AudioOutConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleAssistantAccessoryV1AudioOutConfig clone() {
    return (GoogleAssistantAccessoryV1AudioOutConfig) super.clone();
  }

}
