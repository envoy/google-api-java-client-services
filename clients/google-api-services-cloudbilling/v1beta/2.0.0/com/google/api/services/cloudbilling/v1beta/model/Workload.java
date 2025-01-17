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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Specifies usage on a single Google Cloud product over a time frame. Each Google Cloud product has
 * its own message, containing specific product configuration parameters of the product usage
 * amounts along each dimension in which the product is billed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Workload extends com.google.api.client.json.GenericJson {

  /**
   * Usage on Google Cloud Storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudStorageWorkload cloudStorageWorkload;

  /**
   * Usage of a Google Compute Engine Virtual Machine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeVmWorkload computeVmWorkload;

  /**
   * Required. A name for this workload. All workloads in a `CostScenario` must have a unique
   * `name`. Each `name` must be a maximum of 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Usage on Google Cloud Storage.
   * @return value or {@code null} for none
   */
  public CloudStorageWorkload getCloudStorageWorkload() {
    return cloudStorageWorkload;
  }

  /**
   * Usage on Google Cloud Storage.
   * @param cloudStorageWorkload cloudStorageWorkload or {@code null} for none
   */
  public Workload setCloudStorageWorkload(CloudStorageWorkload cloudStorageWorkload) {
    this.cloudStorageWorkload = cloudStorageWorkload;
    return this;
  }

  /**
   * Usage of a Google Compute Engine Virtual Machine.
   * @return value or {@code null} for none
   */
  public ComputeVmWorkload getComputeVmWorkload() {
    return computeVmWorkload;
  }

  /**
   * Usage of a Google Compute Engine Virtual Machine.
   * @param computeVmWorkload computeVmWorkload or {@code null} for none
   */
  public Workload setComputeVmWorkload(ComputeVmWorkload computeVmWorkload) {
    this.computeVmWorkload = computeVmWorkload;
    return this;
  }

  /**
   * Required. A name for this workload. All workloads in a `CostScenario` must have a unique
   * `name`. Each `name` must be a maximum of 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. A name for this workload. All workloads in a `CostScenario` must have a unique
   * `name`. Each `name` must be a maximum of 32 characters.
   * @param name name or {@code null} for none
   */
  public Workload setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Workload set(String fieldName, Object value) {
    return (Workload) super.set(fieldName, value);
  }

  @Override
  public Workload clone() {
    return (Workload) super.clone();
  }

}
