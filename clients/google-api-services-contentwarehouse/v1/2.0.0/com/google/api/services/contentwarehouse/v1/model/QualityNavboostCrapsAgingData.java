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
 * Model definition for QualityNavboostCrapsAgingData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityNavboostCrapsAgingData extends com.google.api.client.json.GenericJson {

  /**
   * Documents with byline date younger than month at the event time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityNavboostCrapsAgingDataAgingAgeBucket lastMonthBucket;

  /**
   * Documents with byline date younger than week at the event time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityNavboostCrapsAgingDataAgingAgeBucket lastWeekBucket;

  /**
   * Documents with byline date younger than year at the event time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityNavboostCrapsAgingDataAgingAgeBucket lastYearBucket;

  /**
   * Documents with byline date older than year at the event time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityNavboostCrapsAgingDataAgingAgeBucket yearPlusBucket;

  /**
   * Documents with byline date younger than month at the event time.
   * @return value or {@code null} for none
   */
  public QualityNavboostCrapsAgingDataAgingAgeBucket getLastMonthBucket() {
    return lastMonthBucket;
  }

  /**
   * Documents with byline date younger than month at the event time.
   * @param lastMonthBucket lastMonthBucket or {@code null} for none
   */
  public QualityNavboostCrapsAgingData setLastMonthBucket(QualityNavboostCrapsAgingDataAgingAgeBucket lastMonthBucket) {
    this.lastMonthBucket = lastMonthBucket;
    return this;
  }

  /**
   * Documents with byline date younger than week at the event time.
   * @return value or {@code null} for none
   */
  public QualityNavboostCrapsAgingDataAgingAgeBucket getLastWeekBucket() {
    return lastWeekBucket;
  }

  /**
   * Documents with byline date younger than week at the event time.
   * @param lastWeekBucket lastWeekBucket or {@code null} for none
   */
  public QualityNavboostCrapsAgingData setLastWeekBucket(QualityNavboostCrapsAgingDataAgingAgeBucket lastWeekBucket) {
    this.lastWeekBucket = lastWeekBucket;
    return this;
  }

  /**
   * Documents with byline date younger than year at the event time.
   * @return value or {@code null} for none
   */
  public QualityNavboostCrapsAgingDataAgingAgeBucket getLastYearBucket() {
    return lastYearBucket;
  }

  /**
   * Documents with byline date younger than year at the event time.
   * @param lastYearBucket lastYearBucket or {@code null} for none
   */
  public QualityNavboostCrapsAgingData setLastYearBucket(QualityNavboostCrapsAgingDataAgingAgeBucket lastYearBucket) {
    this.lastYearBucket = lastYearBucket;
    return this;
  }

  /**
   * Documents with byline date older than year at the event time.
   * @return value or {@code null} for none
   */
  public QualityNavboostCrapsAgingDataAgingAgeBucket getYearPlusBucket() {
    return yearPlusBucket;
  }

  /**
   * Documents with byline date older than year at the event time.
   * @param yearPlusBucket yearPlusBucket or {@code null} for none
   */
  public QualityNavboostCrapsAgingData setYearPlusBucket(QualityNavboostCrapsAgingDataAgingAgeBucket yearPlusBucket) {
    this.yearPlusBucket = yearPlusBucket;
    return this;
  }

  @Override
  public QualityNavboostCrapsAgingData set(String fieldName, Object value) {
    return (QualityNavboostCrapsAgingData) super.set(fieldName, value);
  }

  @Override
  public QualityNavboostCrapsAgingData clone() {
    return (QualityNavboostCrapsAgingData) super.clone();
  }

}
