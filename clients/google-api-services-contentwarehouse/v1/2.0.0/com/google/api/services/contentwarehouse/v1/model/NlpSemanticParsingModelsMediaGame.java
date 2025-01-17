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
 * Example: "Deus Ex Human Revolution"
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsMediaGame extends com.google.api.client.json.GenericJson {

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingAnnotationEvalData evalData;

  /**
   * Annotation comes from a text annotator. Needed to boost recall. Typically need to be verified
   * in superroot, and have separate scoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAnnotatedFromText;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingQRefAnnotation qref;

  /**
   * Required, corresponds to the raw text, like "Deus Ex Human Revolution"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawText;

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingAnnotationEvalData getEvalData() {
    return evalData;
  }

  /**
   * Required, but should only be used inside Aqua and must not be used by outside clients!!
   * @param evalData evalData or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGame setEvalData(NlpSemanticParsingAnnotationEvalData evalData) {
    this.evalData = evalData;
    return this;
  }

  /**
   * Annotation comes from a text annotator. Needed to boost recall. Typically need to be verified
   * in superroot, and have separate scoring.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAnnotatedFromText() {
    return isAnnotatedFromText;
  }

  /**
   * Annotation comes from a text annotator. Needed to boost recall. Typically need to be verified
   * in superroot, and have separate scoring.
   * @param isAnnotatedFromText isAnnotatedFromText or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGame setIsAnnotatedFromText(java.lang.Boolean isAnnotatedFromText) {
    this.isAnnotatedFromText = isAnnotatedFromText;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingQRefAnnotation getQref() {
    return qref;
  }

  /**
   * @param qref qref or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGame setQref(NlpSemanticParsingQRefAnnotation qref) {
    this.qref = qref;
    return this;
  }

  /**
   * Required, corresponds to the raw text, like "Deus Ex Human Revolution"
   * @return value or {@code null} for none
   */
  public java.lang.String getRawText() {
    return rawText;
  }

  /**
   * Required, corresponds to the raw text, like "Deus Ex Human Revolution"
   * @param rawText rawText or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGame setRawText(java.lang.String rawText) {
    this.rawText = rawText;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsMediaGame set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsMediaGame) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsMediaGame clone() {
    return (NlpSemanticParsingModelsMediaGame) super.clone();
  }

}
