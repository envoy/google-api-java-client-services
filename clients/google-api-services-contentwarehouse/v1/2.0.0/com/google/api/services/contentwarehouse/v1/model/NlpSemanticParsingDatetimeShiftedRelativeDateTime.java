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
 * Model definition for NlpSemanticParsingDatetimeShiftedRelativeDateTime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingDatetimeShiftedRelativeDateTime extends com.google.api.client.json.GenericJson {

  /**
   * The base could be an absolute datetime point for example: "March 1", a relative datetime point,
   * for example: "2 days before March 1" or a symbolic base type, for example: CURRENT_DATETIME.
   * This could also be used to combine EXPLICIT_PRONOUN with the actual value of that reference
   * being setup as a datetime point in base or relative_base
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeAbsoluteDateTime base;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseType;

  /**
   * Can be used to tag relative datetime expressions with metadata information in the grammar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeResolutionProperties relativeBase;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeQuantity shiftAmount;

  /**
   * If true, shifting to the past; if false, shifting to the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shiftPast;

  /**
   * The base could be an absolute datetime point for example: "March 1", a relative datetime point,
   * for example: "2 days before March 1" or a symbolic base type, for example: CURRENT_DATETIME.
   * This could also be used to combine EXPLICIT_PRONOUN with the actual value of that reference
   * being setup as a datetime point in base or relative_base
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeAbsoluteDateTime getBase() {
    return base;
  }

  /**
   * The base could be an absolute datetime point for example: "March 1", a relative datetime point,
   * for example: "2 days before March 1" or a symbolic base type, for example: CURRENT_DATETIME.
   * This could also be used to combine EXPLICIT_PRONOUN with the actual value of that reference
   * being setup as a datetime point in base or relative_base
   * @param base base or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setBase(NlpSemanticParsingDatetimeAbsoluteDateTime base) {
    this.base = base;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseType() {
    return baseType;
  }

  /**
   * @param baseType baseType or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setBaseType(java.lang.String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Can be used to tag relative datetime expressions with metadata information in the grammar.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadata() {
    return metadata;
  }

  /**
   * Can be used to tag relative datetime expressions with metadata information in the grammar.
   * @param metadata metadata or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeResolutionProperties getRelativeBase() {
    return relativeBase;
  }

  /**
   * @param relativeBase relativeBase or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setRelativeBase(NlpSemanticParsingDatetimeResolutionProperties relativeBase) {
    this.relativeBase = relativeBase;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeQuantity getShiftAmount() {
    return shiftAmount;
  }

  /**
   * @param shiftAmount shiftAmount or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setShiftAmount(NlpSemanticParsingDatetimeQuantity shiftAmount) {
    this.shiftAmount = shiftAmount;
    return this;
  }

  /**
   * If true, shifting to the past; if false, shifting to the future.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShiftPast() {
    return shiftPast;
  }

  /**
   * If true, shifting to the past; if false, shifting to the future.
   * @param shiftPast shiftPast or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime setShiftPast(java.lang.Boolean shiftPast) {
    this.shiftPast = shiftPast;
    return this;
  }

  @Override
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime set(String fieldName, Object value) {
    return (NlpSemanticParsingDatetimeShiftedRelativeDateTime) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime clone() {
    return (NlpSemanticParsingDatetimeShiftedRelativeDateTime) super.clone();
  }

}
