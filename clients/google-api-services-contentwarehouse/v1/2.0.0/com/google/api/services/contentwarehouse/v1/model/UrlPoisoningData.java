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
 * Url poisoning information. This information is sparse: if num_spam_siblings is not populated,
 * none of the following fields will be populated. Next tag: 6
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlPoisoningData extends com.google.api.client.json.GenericJson {

  /**
   * fetched from the web. Time when the page was last
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NotChangedTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long notChangedTimeMs;

  /**
   * Time when the page was
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("OriginalCrawlTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long originalCrawlTimeMs;

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ReuseTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long reuseTimeMs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numSpamSiblings;

  /**
   * when it is fetched from the repository. URL of the document for debugging
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * fetched from the web. Time when the page was last
   * @return value or {@code null} for none
   */
  public java.lang.Long getNotChangedTimeMs() {
    return notChangedTimeMs;
  }

  /**
   * fetched from the web. Time when the page was last
   * @param notChangedTimeMs notChangedTimeMs or {@code null} for none
   */
  public UrlPoisoningData setNotChangedTimeMs(java.lang.Long notChangedTimeMs) {
    this.notChangedTimeMs = notChangedTimeMs;
    return this;
  }

  /**
   * Time when the page was
   * @return value or {@code null} for none
   */
  public java.lang.Long getOriginalCrawlTimeMs() {
    return originalCrawlTimeMs;
  }

  /**
   * Time when the page was
   * @param originalCrawlTimeMs originalCrawlTimeMs or {@code null} for none
   */
  public UrlPoisoningData setOriginalCrawlTimeMs(java.lang.Long originalCrawlTimeMs) {
    this.originalCrawlTimeMs = originalCrawlTimeMs;
    return this;
  }

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * @return value or {@code null} for none
   */
  public java.lang.Long getReuseTimeMs() {
    return reuseTimeMs;
  }

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * @param reuseTimeMs reuseTimeMs or {@code null} for none
   */
  public UrlPoisoningData setReuseTimeMs(java.lang.Long reuseTimeMs) {
    this.reuseTimeMs = reuseTimeMs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumSpamSiblings() {
    return numSpamSiblings;
  }

  /**
   * @param numSpamSiblings numSpamSiblings or {@code null} for none
   */
  public UrlPoisoningData setNumSpamSiblings(java.lang.Integer numSpamSiblings) {
    this.numSpamSiblings = numSpamSiblings;
    return this;
  }

  /**
   * when it is fetched from the repository. URL of the document for debugging
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * when it is fetched from the repository. URL of the document for debugging
   * @param url url or {@code null} for none
   */
  public UrlPoisoningData setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public UrlPoisoningData set(String fieldName, Object value) {
    return (UrlPoisoningData) super.set(fieldName, value);
  }

  @Override
  public UrlPoisoningData clone() {
    return (UrlPoisoningData) super.clone();
  }

}
