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
 * A conceptual structure for storing sentiment snippet information in mustang. Essentially an
 * adaptation of PhraseAnnotationProperties from //repository/annotations/proto/annotations.proto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryAnnotationsMustangSentimentSnippetAnnotations extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated: use snippet_score instead
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float deprecatedMagnitude;

  /**
   * Deprecated: use snippet_score instead
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float deprecatedPolarity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer end;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isTruncated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phraseType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer snippetScore;

  /**
   * This protobuffer is serving double duty as both a Mustang attachment and the response proto
   * that gets returned by Mustang in the WWWSnippetResponse's info MessageSet. When stored as an
   * attachment, this field will always be empty. However, when returned with the
   * WWWSnippetResponse, Mustang will print and store the actual sentiment snippet's text here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippetText;

  /**
   * begin and end are token offsets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer start;

  /**
   * Deprecated: use snippet_score instead
   * @return value or {@code null} for none
   */
  public java.lang.Float getDeprecatedMagnitude() {
    return deprecatedMagnitude;
  }

  /**
   * Deprecated: use snippet_score instead
   * @param deprecatedMagnitude deprecatedMagnitude or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setDeprecatedMagnitude(java.lang.Float deprecatedMagnitude) {
    this.deprecatedMagnitude = deprecatedMagnitude;
    return this;
  }

  /**
   * Deprecated: use snippet_score instead
   * @return value or {@code null} for none
   */
  public java.lang.Float getDeprecatedPolarity() {
    return deprecatedPolarity;
  }

  /**
   * Deprecated: use snippet_score instead
   * @param deprecatedPolarity deprecatedPolarity or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setDeprecatedPolarity(java.lang.Float deprecatedPolarity) {
    this.deprecatedPolarity = deprecatedPolarity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * @param end end or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setEnd(java.lang.Integer end) {
    this.end = end;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsTruncated() {
    return isTruncated;
  }

  /**
   * @param isTruncated isTruncated or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setIsTruncated(java.lang.Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhraseType() {
    return phraseType;
  }

  /**
   * @param phraseType phraseType or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setPhraseType(java.lang.String phraseType) {
    this.phraseType = phraseType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSnippetScore() {
    return snippetScore;
  }

  /**
   * @param snippetScore snippetScore or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setSnippetScore(java.lang.Integer snippetScore) {
    this.snippetScore = snippetScore;
    return this;
  }

  /**
   * This protobuffer is serving double duty as both a Mustang attachment and the response proto
   * that gets returned by Mustang in the WWWSnippetResponse's info MessageSet. When stored as an
   * attachment, this field will always be empty. However, when returned with the
   * WWWSnippetResponse, Mustang will print and store the actual sentiment snippet's text here.
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippetText() {
    return snippetText;
  }

  /**
   * This protobuffer is serving double duty as both a Mustang attachment and the response proto
   * that gets returned by Mustang in the WWWSnippetResponse's info MessageSet. When stored as an
   * attachment, this field will always be empty. However, when returned with the
   * WWWSnippetResponse, Mustang will print and store the actual sentiment snippet's text here.
   * @param snippetText snippetText or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setSnippetText(java.lang.String snippetText) {
    this.snippetText = snippetText;
    return this;
  }

  /**
   * begin and end are token offsets.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * begin and end are token offsets.
   * @param start start or {@code null} for none
   */
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations setStart(java.lang.Integer start) {
    this.start = start;
    return this;
  }

  @Override
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations set(String fieldName, Object value) {
    return (RepositoryAnnotationsMustangSentimentSnippetAnnotations) super.set(fieldName, value);
  }

  @Override
  public RepositoryAnnotationsMustangSentimentSnippetAnnotations clone() {
    return (RepositoryAnnotationsMustangSentimentSnippetAnnotations) super.clone();
  }

}
