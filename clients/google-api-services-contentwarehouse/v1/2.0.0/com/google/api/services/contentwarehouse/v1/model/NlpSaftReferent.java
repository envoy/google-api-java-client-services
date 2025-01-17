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
 * A referent contains information about what a discourse context entity is referring to. It acts
 * like a canonical mention of the entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSaftReferent extends com.google.api.client.json.GenericJson {

  /**
   * Distance of this referent from the markables in the Document. Smaller values imply that the
   * referent is more accessible to be an antecedent for a markable in the Document. The expectation
   * is that this field would increase with every new Document in which this referent is not
   * mentioned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distance;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String explicitness;

  /**
   * Application-specific information about this referent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet info;

  /**
   * Entity name phrase. The phrase indices are relative to the token array above. The phrase should
   * normally cover all the tokens in the name and the head must be set to be the head token of the
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSaftPhrase phrase;

  /**
   * Prominence score for referent. This is roughly equivalent to the number of previous mentions of
   * the referent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double prominence;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * Tokenized representation for the canonical name of the referent entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NlpSaftToken> token;

  /**
   * Distance of this referent from the markables in the Document. Smaller values imply that the
   * referent is more accessible to be an antecedent for a markable in the Document. The expectation
   * is that this field would increase with every new Document in which this referent is not
   * mentioned.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistance() {
    return distance;
  }

  /**
   * Distance of this referent from the markables in the Document. Smaller values imply that the
   * referent is more accessible to be an antecedent for a markable in the Document. The expectation
   * is that this field would increase with every new Document in which this referent is not
   * mentioned.
   * @param distance distance or {@code null} for none
   */
  public NlpSaftReferent setDistance(java.lang.Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExplicitness() {
    return explicitness;
  }

  /**
   * @param explicitness explicitness or {@code null} for none
   */
  public NlpSaftReferent setExplicitness(java.lang.String explicitness) {
    this.explicitness = explicitness;
    return this;
  }

  /**
   * Application-specific information about this referent.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getInfo() {
    return info;
  }

  /**
   * Application-specific information about this referent.
   * @param info info or {@code null} for none
   */
  public NlpSaftReferent setInfo(Proto2BridgeMessageSet info) {
    this.info = info;
    return this;
  }

  /**
   * Entity name phrase. The phrase indices are relative to the token array above. The phrase should
   * normally cover all the tokens in the name and the head must be set to be the head token of the
   * name.
   * @return value or {@code null} for none
   */
  public NlpSaftPhrase getPhrase() {
    return phrase;
  }

  /**
   * Entity name phrase. The phrase indices are relative to the token array above. The phrase should
   * normally cover all the tokens in the name and the head must be set to be the head token of the
   * name.
   * @param phrase phrase or {@code null} for none
   */
  public NlpSaftReferent setPhrase(NlpSaftPhrase phrase) {
    this.phrase = phrase;
    return this;
  }

  /**
   * Prominence score for referent. This is roughly equivalent to the number of previous mentions of
   * the referent.
   * @return value or {@code null} for none
   */
  public java.lang.Double getProminence() {
    return prominence;
  }

  /**
   * Prominence score for referent. This is roughly equivalent to the number of previous mentions of
   * the referent.
   * @param prominence prominence or {@code null} for none
   */
  public NlpSaftReferent setProminence(java.lang.Double prominence) {
    this.prominence = prominence;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * @param role role or {@code null} for none
   */
  public NlpSaftReferent setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * Tokenized representation for the canonical name of the referent entity.
   * @return value or {@code null} for none
   */
  public java.util.List<NlpSaftToken> getToken() {
    return token;
  }

  /**
   * Tokenized representation for the canonical name of the referent entity.
   * @param token token or {@code null} for none
   */
  public NlpSaftReferent setToken(java.util.List<NlpSaftToken> token) {
    this.token = token;
    return this;
  }

  @Override
  public NlpSaftReferent set(String fieldName, Object value) {
    return (NlpSaftReferent) super.set(fieldName, value);
  }

  @Override
  public NlpSaftReferent clone() {
    return (NlpSaftReferent) super.clone();
  }

}
