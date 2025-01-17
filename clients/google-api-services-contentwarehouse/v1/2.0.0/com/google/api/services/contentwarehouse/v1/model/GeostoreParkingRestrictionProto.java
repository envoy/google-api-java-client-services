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
 * Expresses a parking restriction on a road; i.e. times at which parking on the road is prohibited.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreParkingRestrictionProto extends com.google.api.client.json.GenericJson {

  /**
   * Times at which parking is prohibited.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreTimeScheduleProto restrictedHours;

  /**
   * clang-format on The type of restriction that applies at this time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restrictionType;

  /**
   * The types of services that this parking restriction applies to. We expect most parking
   * restrictions to apply to all services, but some airports have specific rideshare parking or
   * taxi parking zones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceType;

  /**
   * The types of vehicles that this parking restriction applies to. For instance, some streets may
   * allow motorcycles to park but not automobiles or trucks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> vehicleType;

  /**
   * Times at which parking is prohibited.
   * @return value or {@code null} for none
   */
  public GeostoreTimeScheduleProto getRestrictedHours() {
    return restrictedHours;
  }

  /**
   * Times at which parking is prohibited.
   * @param restrictedHours restrictedHours or {@code null} for none
   */
  public GeostoreParkingRestrictionProto setRestrictedHours(GeostoreTimeScheduleProto restrictedHours) {
    this.restrictedHours = restrictedHours;
    return this;
  }

  /**
   * clang-format on The type of restriction that applies at this time.
   * @return value or {@code null} for none
   */
  public java.lang.String getRestrictionType() {
    return restrictionType;
  }

  /**
   * clang-format on The type of restriction that applies at this time.
   * @param restrictionType restrictionType or {@code null} for none
   */
  public GeostoreParkingRestrictionProto setRestrictionType(java.lang.String restrictionType) {
    this.restrictionType = restrictionType;
    return this;
  }

  /**
   * The types of services that this parking restriction applies to. We expect most parking
   * restrictions to apply to all services, but some airports have specific rideshare parking or
   * taxi parking zones.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceType() {
    return serviceType;
  }

  /**
   * The types of services that this parking restriction applies to. We expect most parking
   * restrictions to apply to all services, but some airports have specific rideshare parking or
   * taxi parking zones.
   * @param serviceType serviceType or {@code null} for none
   */
  public GeostoreParkingRestrictionProto setServiceType(java.util.List<java.lang.String> serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * The types of vehicles that this parking restriction applies to. For instance, some streets may
   * allow motorcycles to park but not automobiles or trucks.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVehicleType() {
    return vehicleType;
  }

  /**
   * The types of vehicles that this parking restriction applies to. For instance, some streets may
   * allow motorcycles to park but not automobiles or trucks.
   * @param vehicleType vehicleType or {@code null} for none
   */
  public GeostoreParkingRestrictionProto setVehicleType(java.util.List<java.lang.String> vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  @Override
  public GeostoreParkingRestrictionProto set(String fieldName, Object value) {
    return (GeostoreParkingRestrictionProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreParkingRestrictionProto clone() {
    return (GeostoreParkingRestrictionProto) super.clone();
  }

}
