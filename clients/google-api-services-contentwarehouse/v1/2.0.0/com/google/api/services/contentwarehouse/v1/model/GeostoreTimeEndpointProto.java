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
 * Not all combinations of optional fields in TimeEndpointProto are allowed. The granularity of time
 * is a path along the directed graph with these edges: second -> minute minute -> hour hour -> day
 * of week hour -> day of month hour -> day of year day of week -> week of month day of week -> week
 * of year day of month -> month day of year -> year week of month -> month week of year -> year
 * month -> year A TimeEndpointProto may not specify two fields that are unordered with respect to
 * each other ("day of year" and "day of week", for instance). The absence of fields larger than any
 * specified field indicates repetition (e.g. no year indicates that the interval occurs every
 * year). The absence of units that are "smaller" than the largest specified unit indicates a
 * default lowest value (no hour means midnight (0)). When intersecting time intervals, "smaller"
 * units repeat within the "larger" unit as many times as necessary. For example, the intersection
 * of the interval from hour 0 to hour 24 with the interval from second 0 to second 1 is equivalent
 * to the union of the set of intervals which represents the first second of every minute of every
 * hour of every day. -----------------------------------------------------------------------------
 * WARNING - if you add new fields to TimeEndpointProto you need to: - ensure
 * AreTimeEndpointsEquivalent considers the new fields (and update the corresponding tests)
 * -----------------------------------------------------------------------------
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreTimeEndpointProto extends com.google.api.client.json.GenericJson {

  /**
   * Valid ranges are 0-7, 1-31, and 1-366 (see day_type below)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer day;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dayType;

  /**
   * Valid range is 0-24. Because it could be unclear what wrapping hours mean in relation to days,
   * 24 is used to denote midnight at the end of a day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hour;

  /**
   * Valid range is 0-59, except when a repetitive minute interval ends at the end of an hour, in
   * which case 60 is a legal end value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minute;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String month;

  /**
   * Valid range is 0-59, except when a repetitive second interval ends at the end of a minute, in
   * which case 60 is a legal end value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer second;

  /**
   * Valid ranges are 0-5 and 1-53 (depending on the value of week_type, see below).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer week;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String weekType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * Valid ranges are 0-7, 1-31, and 1-366 (see day_type below)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * Valid ranges are 0-7, 1-31, and 1-366 (see day_type below)
   * @param day day or {@code null} for none
   */
  public GeostoreTimeEndpointProto setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDayType() {
    return dayType;
  }

  /**
   * @param dayType dayType or {@code null} for none
   */
  public GeostoreTimeEndpointProto setDayType(java.lang.String dayType) {
    this.dayType = dayType;
    return this;
  }

  /**
   * Valid range is 0-24. Because it could be unclear what wrapping hours mean in relation to days,
   * 24 is used to denote midnight at the end of a day.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHour() {
    return hour;
  }

  /**
   * Valid range is 0-24. Because it could be unclear what wrapping hours mean in relation to days,
   * 24 is used to denote midnight at the end of a day.
   * @param hour hour or {@code null} for none
   */
  public GeostoreTimeEndpointProto setHour(java.lang.Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Valid range is 0-59, except when a repetitive minute interval ends at the end of an hour, in
   * which case 60 is a legal end value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinute() {
    return minute;
  }

  /**
   * Valid range is 0-59, except when a repetitive minute interval ends at the end of an hour, in
   * which case 60 is a legal end value.
   * @param minute minute or {@code null} for none
   */
  public GeostoreTimeEndpointProto setMinute(java.lang.Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMonth() {
    return month;
  }

  /**
   * @param month month or {@code null} for none
   */
  public GeostoreTimeEndpointProto setMonth(java.lang.String month) {
    this.month = month;
    return this;
  }

  /**
   * Valid range is 0-59, except when a repetitive second interval ends at the end of a minute, in
   * which case 60 is a legal end value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSecond() {
    return second;
  }

  /**
   * Valid range is 0-59, except when a repetitive second interval ends at the end of a minute, in
   * which case 60 is a legal end value.
   * @param second second or {@code null} for none
   */
  public GeostoreTimeEndpointProto setSecond(java.lang.Integer second) {
    this.second = second;
    return this;
  }

  /**
   * Valid ranges are 0-5 and 1-53 (depending on the value of week_type, see below).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWeek() {
    return week;
  }

  /**
   * Valid ranges are 0-5 and 1-53 (depending on the value of week_type, see below).
   * @param week week or {@code null} for none
   */
  public GeostoreTimeEndpointProto setWeek(java.lang.Integer week) {
    this.week = week;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWeekType() {
    return weekType;
  }

  /**
   * @param weekType weekType or {@code null} for none
   */
  public GeostoreTimeEndpointProto setWeekType(java.lang.String weekType) {
    this.weekType = weekType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public GeostoreTimeEndpointProto setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public GeostoreTimeEndpointProto set(String fieldName, Object value) {
    return (GeostoreTimeEndpointProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreTimeEndpointProto clone() {
    return (GeostoreTimeEndpointProto) super.clone();
  }

}
