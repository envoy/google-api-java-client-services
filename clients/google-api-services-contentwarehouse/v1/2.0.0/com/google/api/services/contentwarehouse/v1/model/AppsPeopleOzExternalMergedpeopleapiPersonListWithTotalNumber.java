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
 * A person list with total number specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiPerson> people;

  static {
    // hack to force ProGuard to consider AppsPeopleOzExternalMergedpeopleapiPerson used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AppsPeopleOzExternalMergedpeopleapiPerson.class);
  }

  /**
   * The total number of people, which is aways no less than the size of the above list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalNumber;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiPerson> getPeople() {
    return people;
  }

  /**
   * @param people people or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber setPeople(java.util.List<AppsPeopleOzExternalMergedpeopleapiPerson> people) {
    this.people = people;
    return this;
  }

  /**
   * The total number of people, which is aways no less than the size of the above list.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalNumber() {
    return totalNumber;
  }

  /**
   * The total number of people, which is aways no less than the size of the above list.
   * @param totalNumber totalNumber or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber setTotalNumber(java.lang.Integer totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber clone() {
    return (AppsPeopleOzExternalMergedpeopleapiPersonListWithTotalNumber) super.clone();
  }

}
