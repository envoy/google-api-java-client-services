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
 * Collects signals from one query and one candidate. Next available tag: 9
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefNameDebugInfoCandidateInfo extends com.google.api.client.json.GenericJson {

  /**
   * Whether the entity is purely from strong result entities, and is matchless in query annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isMatchlessResultContext;

  /**
   * Mid of the candidate entity or empty string for the full world.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * Debug name of the entity (not usually populated).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float resultEntityScore;

  /**
   * Whether the entity is purely from strong result entities, and is matchless in query annotation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsMatchlessResultContext() {
    return isMatchlessResultContext;
  }

  /**
   * Whether the entity is purely from strong result entities, and is matchless in query annotation.
   * @param isMatchlessResultContext isMatchlessResultContext or {@code null} for none
   */
  public RepositoryWebrefNameDebugInfoCandidateInfo setIsMatchlessResultContext(java.lang.Boolean isMatchlessResultContext) {
    this.isMatchlessResultContext = isMatchlessResultContext;
    return this;
  }

  /**
   * Mid of the candidate entity or empty string for the full world.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * Mid of the candidate entity or empty string for the full world.
   * @param mid mid or {@code null} for none
   */
  public RepositoryWebrefNameDebugInfoCandidateInfo setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Debug name of the entity (not usually populated).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Debug name of the entity (not usually populated).
   * @param name name or {@code null} for none
   */
  public RepositoryWebrefNameDebugInfoCandidateInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getResultEntityScore() {
    return resultEntityScore;
  }

  /**
   * @param resultEntityScore resultEntityScore or {@code null} for none
   */
  public RepositoryWebrefNameDebugInfoCandidateInfo setResultEntityScore(java.lang.Float resultEntityScore) {
    this.resultEntityScore = resultEntityScore;
    return this;
  }

  @Override
  public RepositoryWebrefNameDebugInfoCandidateInfo set(String fieldName, Object value) {
    return (RepositoryWebrefNameDebugInfoCandidateInfo) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefNameDebugInfoCandidateInfo clone() {
    return (RepositoryWebrefNameDebugInfoCandidateInfo) super.clone();
  }

}
