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
 * Model definition for VideoVideoStreamInfoVideoStreamCleanAperture.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoVideoStreamInfoVideoStreamCleanAperture extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer horizontalOffset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer verticalOffset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * @param height height or {@code null} for none
   */
  public VideoVideoStreamInfoVideoStreamCleanAperture setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHorizontalOffset() {
    return horizontalOffset;
  }

  /**
   * @param horizontalOffset horizontalOffset or {@code null} for none
   */
  public VideoVideoStreamInfoVideoStreamCleanAperture setHorizontalOffset(java.lang.Integer horizontalOffset) {
    this.horizontalOffset = horizontalOffset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVerticalOffset() {
    return verticalOffset;
  }

  /**
   * @param verticalOffset verticalOffset or {@code null} for none
   */
  public VideoVideoStreamInfoVideoStreamCleanAperture setVerticalOffset(java.lang.Integer verticalOffset) {
    this.verticalOffset = verticalOffset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * @param width width or {@code null} for none
   */
  public VideoVideoStreamInfoVideoStreamCleanAperture setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public VideoVideoStreamInfoVideoStreamCleanAperture set(String fieldName, Object value) {
    return (VideoVideoStreamInfoVideoStreamCleanAperture) super.set(fieldName, value);
  }

  @Override
  public VideoVideoStreamInfoVideoStreamCleanAperture clone() {
    return (VideoVideoStreamInfoVideoStreamCleanAperture) super.clone();
  }

}
