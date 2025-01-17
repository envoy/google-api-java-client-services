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
 * Next available ID: 8
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSciencelitCitationData extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NlpSciencelitArticleId> articleId;

  static {
    // hack to force ProGuard to consider NlpSciencelitArticleId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NlpSciencelitArticleId.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NlpSciencelitAuthor> author;

  static {
    // hack to force ProGuard to consider NlpSciencelitAuthor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NlpSciencelitAuthor.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalLink;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullText;

  /**
   * Reference used in text (e.g., PMC rid).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reference;

  /**
   * Scholar citation information from scholar index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScienceCitation scholarCitation;

  /**
   * Optional information about the publication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<NlpSciencelitArticleId> getArticleId() {
    return articleId;
  }

  /**
   * @param articleId articleId or {@code null} for none
   */
  public NlpSciencelitCitationData setArticleId(java.util.List<NlpSciencelitArticleId> articleId) {
    this.articleId = articleId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<NlpSciencelitAuthor> getAuthor() {
    return author;
  }

  /**
   * @param author author or {@code null} for none
   */
  public NlpSciencelitCitationData setAuthor(java.util.List<NlpSciencelitAuthor> author) {
    this.author = author;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalLink() {
    return externalLink;
  }

  /**
   * @param externalLink externalLink or {@code null} for none
   */
  public NlpSciencelitCitationData setExternalLink(java.lang.String externalLink) {
    this.externalLink = externalLink;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFullText() {
    return fullText;
  }

  /**
   * @param fullText fullText or {@code null} for none
   */
  public NlpSciencelitCitationData setFullText(java.lang.String fullText) {
    this.fullText = fullText;
    return this;
  }

  /**
   * Reference used in text (e.g., PMC rid).
   * @return value or {@code null} for none
   */
  public java.lang.String getReference() {
    return reference;
  }

  /**
   * Reference used in text (e.g., PMC rid).
   * @param reference reference or {@code null} for none
   */
  public NlpSciencelitCitationData setReference(java.lang.String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Scholar citation information from scholar index.
   * @return value or {@code null} for none
   */
  public ScienceCitation getScholarCitation() {
    return scholarCitation;
  }

  /**
   * Scholar citation information from scholar index.
   * @param scholarCitation scholarCitation or {@code null} for none
   */
  public NlpSciencelitCitationData setScholarCitation(ScienceCitation scholarCitation) {
    this.scholarCitation = scholarCitation;
    return this;
  }

  /**
   * Optional information about the publication.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional information about the publication.
   * @param title title or {@code null} for none
   */
  public NlpSciencelitCitationData setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public NlpSciencelitCitationData set(String fieldName, Object value) {
    return (NlpSciencelitCitationData) super.set(fieldName, value);
  }

  @Override
  public NlpSciencelitCitationData clone() {
    return (NlpSciencelitCitationData) super.clone();
  }

}
