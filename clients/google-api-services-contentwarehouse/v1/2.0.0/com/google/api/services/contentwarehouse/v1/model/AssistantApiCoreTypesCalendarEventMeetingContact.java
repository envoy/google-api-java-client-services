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
 * Next id: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiCoreTypesCalendarEventMeetingContact extends com.google.api.client.json.GenericJson {

  /**
   * ID that corresponds to in ConferenceData.conference_id in calendar.common.ConferenceData proto.
   * For Meet, this is the identifier used to join a meeting via URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conferenceId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dialInNumberClasses;

  /**
   * Default meeting phone number, for example: "tel:+1-475-777-1840"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumberUri;

  /**
   * A PIN that the participant will need to input after dialing in the conference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pinNumber;

  /**
   * Provider info for the meeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCoreTypesProvider provider;

  /**
   * The region code for the default meeting phone number
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The universal meeting PIN number for phone numbers in all available countries
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String universalPinNumber;

  /**
   * URL that can be used to join the meeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * ID that corresponds to in ConferenceData.conference_id in calendar.common.ConferenceData proto.
   * For Meet, this is the identifier used to join a meeting via URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getConferenceId() {
    return conferenceId;
  }

  /**
   * ID that corresponds to in ConferenceData.conference_id in calendar.common.ConferenceData proto.
   * For Meet, this is the identifier used to join a meeting via URL.
   * @param conferenceId conferenceId or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setConferenceId(java.lang.String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDialInNumberClasses() {
    return dialInNumberClasses;
  }

  /**
   * @param dialInNumberClasses dialInNumberClasses or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setDialInNumberClasses(java.util.List<java.lang.String> dialInNumberClasses) {
    this.dialInNumberClasses = dialInNumberClasses;
    return this;
  }

  /**
   * Default meeting phone number, for example: "tel:+1-475-777-1840"
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumberUri() {
    return phoneNumberUri;
  }

  /**
   * Default meeting phone number, for example: "tel:+1-475-777-1840"
   * @param phoneNumberUri phoneNumberUri or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setPhoneNumberUri(java.lang.String phoneNumberUri) {
    this.phoneNumberUri = phoneNumberUri;
    return this;
  }

  /**
   * A PIN that the participant will need to input after dialing in the conference.
   * @return value or {@code null} for none
   */
  public java.lang.String getPinNumber() {
    return pinNumber;
  }

  /**
   * A PIN that the participant will need to input after dialing in the conference.
   * @param pinNumber pinNumber or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setPinNumber(java.lang.String pinNumber) {
    this.pinNumber = pinNumber;
    return this;
  }

  /**
   * Provider info for the meeting.
   * @return value or {@code null} for none
   */
  public AssistantApiCoreTypesProvider getProvider() {
    return provider;
  }

  /**
   * Provider info for the meeting.
   * @param provider provider or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setProvider(AssistantApiCoreTypesProvider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The region code for the default meeting phone number
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * The region code for the default meeting phone number
   * @param regionCode regionCode or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * @param source source or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * The universal meeting PIN number for phone numbers in all available countries
   * @return value or {@code null} for none
   */
  public java.lang.String getUniversalPinNumber() {
    return universalPinNumber;
  }

  /**
   * The universal meeting PIN number for phone numbers in all available countries
   * @param universalPinNumber universalPinNumber or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setUniversalPinNumber(java.lang.String universalPinNumber) {
    this.universalPinNumber = universalPinNumber;
    return this;
  }

  /**
   * URL that can be used to join the meeting.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL that can be used to join the meeting.
   * @param url url or {@code null} for none
   */
  public AssistantApiCoreTypesCalendarEventMeetingContact setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public AssistantApiCoreTypesCalendarEventMeetingContact set(String fieldName, Object value) {
    return (AssistantApiCoreTypesCalendarEventMeetingContact) super.set(fieldName, value);
  }

  @Override
  public AssistantApiCoreTypesCalendarEventMeetingContact clone() {
    return (AssistantApiCoreTypesCalendarEventMeetingContact) super.clone();
  }

}
