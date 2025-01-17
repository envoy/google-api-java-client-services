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
 * DateTimeProperty contains various metadata about the DateTime interpretation. Next field: 13
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingDatetimeDateTimeProperty extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dateFormat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean expandYearToCurrent;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hourStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inferredDateValue;

  /**
   * Note: this may be changed to a repeated field in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadata;

  /**
   * Metadata about the personal reference if the date was generated from a personal reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CopleyPersonalReferenceMetadata personalReferenceMetadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relationToReference;

  /**
   * Expresses the relative DateTime query that gave rise to these grounded semantics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeRelativeDateTime relative;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceCalendar;

  /**
   * If the annotation was created by using personal data, we record the provenance for that data
   * here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CopleySourceTypeList sourceTypeList;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> timeFormat;

  /**
   * True iff the timezone value in AbsoluteDateTime is explicit in the annotated text or not. In
   * the following examples the timezone is explicit: Query Timezone --------------------------
   * -------- 10pst Pacific Standard Time 10 utc UTC 10 sydney time Australia Eastern Time
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean timezoneIsExplicit;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDateFormat() {
    return dateFormat;
  }

  /**
   * @param dateFormat dateFormat or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setDateFormat(java.lang.String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExpandYearToCurrent() {
    return expandYearToCurrent;
  }

  /**
   * @param expandYearToCurrent expandYearToCurrent or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setExpandYearToCurrent(java.lang.Boolean expandYearToCurrent) {
    this.expandYearToCurrent = expandYearToCurrent;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHourStatus() {
    return hourStatus;
  }

  /**
   * @param hourStatus hourStatus or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setHourStatus(java.lang.String hourStatus) {
    this.hourStatus = hourStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInferredDateValue() {
    return inferredDateValue;
  }

  /**
   * @param inferredDateValue inferredDateValue or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setInferredDateValue(java.lang.String inferredDateValue) {
    this.inferredDateValue = inferredDateValue;
    return this;
  }

  /**
   * Note: this may be changed to a repeated field in the future.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadata() {
    return metadata;
  }

  /**
   * Note: this may be changed to a repeated field in the future.
   * @param metadata metadata or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Metadata about the personal reference if the date was generated from a personal reference.
   * @return value or {@code null} for none
   */
  public CopleyPersonalReferenceMetadata getPersonalReferenceMetadata() {
    return personalReferenceMetadata;
  }

  /**
   * Metadata about the personal reference if the date was generated from a personal reference.
   * @param personalReferenceMetadata personalReferenceMetadata or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setPersonalReferenceMetadata(CopleyPersonalReferenceMetadata personalReferenceMetadata) {
    this.personalReferenceMetadata = personalReferenceMetadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRelationToReference() {
    return relationToReference;
  }

  /**
   * @param relationToReference relationToReference or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setRelationToReference(java.lang.String relationToReference) {
    this.relationToReference = relationToReference;
    return this;
  }

  /**
   * Expresses the relative DateTime query that gave rise to these grounded semantics.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeRelativeDateTime getRelative() {
    return relative;
  }

  /**
   * Expresses the relative DateTime query that gave rise to these grounded semantics.
   * @param relative relative or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setRelative(NlpSemanticParsingDatetimeRelativeDateTime relative) {
    this.relative = relative;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceCalendar() {
    return sourceCalendar;
  }

  /**
   * @param sourceCalendar sourceCalendar or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setSourceCalendar(java.lang.String sourceCalendar) {
    this.sourceCalendar = sourceCalendar;
    return this;
  }

  /**
   * If the annotation was created by using personal data, we record the provenance for that data
   * here.
   * @return value or {@code null} for none
   */
  public CopleySourceTypeList getSourceTypeList() {
    return sourceTypeList;
  }

  /**
   * If the annotation was created by using personal data, we record the provenance for that data
   * here.
   * @param sourceTypeList sourceTypeList or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setSourceTypeList(CopleySourceTypeList sourceTypeList) {
    this.sourceTypeList = sourceTypeList;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTimeFormat() {
    return timeFormat;
  }

  /**
   * @param timeFormat timeFormat or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setTimeFormat(java.util.List<java.lang.String> timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

  /**
   * True iff the timezone value in AbsoluteDateTime is explicit in the annotated text or not. In
   * the following examples the timezone is explicit: Query Timezone --------------------------
   * -------- 10pst Pacific Standard Time 10 utc UTC 10 sydney time Australia Eastern Time
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTimezoneIsExplicit() {
    return timezoneIsExplicit;
  }

  /**
   * True iff the timezone value in AbsoluteDateTime is explicit in the annotated text or not. In
   * the following examples the timezone is explicit: Query Timezone --------------------------
   * -------- 10pst Pacific Standard Time 10 utc UTC 10 sydney time Australia Eastern Time
   * @param timezoneIsExplicit timezoneIsExplicit or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTimeProperty setTimezoneIsExplicit(java.lang.Boolean timezoneIsExplicit) {
    this.timezoneIsExplicit = timezoneIsExplicit;
    return this;
  }

  @Override
  public NlpSemanticParsingDatetimeDateTimeProperty set(String fieldName, Object value) {
    return (NlpSemanticParsingDatetimeDateTimeProperty) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingDatetimeDateTimeProperty clone() {
    return (NlpSemanticParsingDatetimeDateTimeProperty) super.clone();
  }

}
