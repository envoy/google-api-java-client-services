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
 * We divide up a week into individual open intervals. If any are present then they must be arranged
 * in strictly increasing order, with non-empty spaces between successive intervals, and all times
 * between 0 and 604800, the number of seconds in a week.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusinessHours extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dayopen;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusinessHoursInterval> interval;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDayopen() {
    return dayopen;
  }

  /**
   * @param dayopen dayopen or {@code null} for none
   */
  public BusinessHours setDayopen(java.lang.Integer dayopen) {
    this.dayopen = dayopen;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<BusinessHoursInterval> getInterval() {
    return interval;
  }

  /**
   * @param interval interval or {@code null} for none
   */
  public BusinessHours setInterval(java.util.List<BusinessHoursInterval> interval) {
    this.interval = interval;
    return this;
  }

  @Override
  public BusinessHours set(String fieldName, Object value) {
    return (BusinessHours) super.set(fieldName, value);
  }

  @Override
  public BusinessHours clone() {
    return (BusinessHours) super.clone();
  }

}
