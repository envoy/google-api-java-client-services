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
 * TimingStatPair message stores a timing period name and a time value. This is intentionally vague
 * for doing fine level timing of rendering as what we measure is likely to change as we iterate.
 * The intention is also that these values will just be dumped to varzs for evaluation purposed and
 * not used programmatically.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HtmlrenderWebkitHeadlessProtoAnonTimingStatPair extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double timeS;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoAnonTimingStatPair setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getTimeS() {
    return timeS;
  }

  /**
   * @param timeS timeS or {@code null} for none
   */
  public HtmlrenderWebkitHeadlessProtoAnonTimingStatPair setTimeS(java.lang.Double timeS) {
    this.timeS = timeS;
    return this;
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoAnonTimingStatPair set(String fieldName, Object value) {
    return (HtmlrenderWebkitHeadlessProtoAnonTimingStatPair) super.set(fieldName, value);
  }

  @Override
  public HtmlrenderWebkitHeadlessProtoAnonTimingStatPair clone() {
    return (HtmlrenderWebkitHeadlessProtoAnonTimingStatPair) super.clone();
  }

}
