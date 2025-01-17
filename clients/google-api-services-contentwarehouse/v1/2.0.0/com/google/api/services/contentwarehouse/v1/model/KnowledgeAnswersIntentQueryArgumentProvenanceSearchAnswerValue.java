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
 * The value was carried over from a SearchAnswerValue triggered by a previous query (go/search-
 * answer-values). For example: U: Movies with Tom Cruise. [Movies(actor=/m/tom_cruise)] G: Tom
 * Cruise's movies include Top Gun, The Mummy, and 52 others. U: Reviews for the second one.
 * [Reviews(movie=/m/the_mummy)] The "movie" argument in the last query would have a provenance of
 * SEARCH_ANSWER_VALUE.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue extends com.google.api.client.json.GenericJson {

  /**
   * This identifies the SearchAnswerValues where this value was pulled from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EventIdMessage eventId;

  /**
   * Each SearchAnswerValue can have a primary value and a list of metadata values. If this index is
   * set, this value was pulled from the metadata value at this index, otherwise it was pulled from
   * the primary value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer metadataValueIndex;

  /**
   * The display text of this answer value. It's taken from the search answer value display text if
   * present, or the canonical name if it's an entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The index of the SearchAnswerValue where this value was pulled from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer valueIndex;

  /**
   * This identifies the SearchAnswerValues where this value was pulled from.
   * @return value or {@code null} for none
   */
  public EventIdMessage getEventId() {
    return eventId;
  }

  /**
   * This identifies the SearchAnswerValues where this value was pulled from.
   * @param eventId eventId or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue setEventId(EventIdMessage eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Each SearchAnswerValue can have a primary value and a list of metadata values. If this index is
   * set, this value was pulled from the metadata value at this index, otherwise it was pulled from
   * the primary value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMetadataValueIndex() {
    return metadataValueIndex;
  }

  /**
   * Each SearchAnswerValue can have a primary value and a list of metadata values. If this index is
   * set, this value was pulled from the metadata value at this index, otherwise it was pulled from
   * the primary value.
   * @param metadataValueIndex metadataValueIndex or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue setMetadataValueIndex(java.lang.Integer metadataValueIndex) {
    this.metadataValueIndex = metadataValueIndex;
    return this;
  }

  /**
   * The display text of this answer value. It's taken from the search answer value display text if
   * present, or the canonical name if it's an entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The display text of this answer value. It's taken from the search answer value display text if
   * present, or the canonical name if it's an entity.
   * @param text text or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * The index of the SearchAnswerValue where this value was pulled from.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getValueIndex() {
    return valueIndex;
  }

  /**
   * The index of the SearchAnswerValue where this value was pulled from.
   * @param valueIndex valueIndex or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue setValueIndex(java.lang.Integer valueIndex) {
    this.valueIndex = valueIndex;
    return this;
  }

  @Override
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue set(String fieldName, Object value) {
    return (KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue clone() {
    return (KnowledgeAnswersIntentQueryArgumentProvenanceSearchAnswerValue) super.clone();
  }

}
