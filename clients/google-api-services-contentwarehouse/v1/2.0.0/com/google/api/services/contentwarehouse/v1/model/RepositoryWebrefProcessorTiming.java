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
 * Processor timings as produced by NestedPerfCounter, see google3/repository/webref/base/nested-
 * perf-counter.h.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefProcessorTiming extends com.google.api.client.json.GenericJson {

  /**
   * Cpu instructions spent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cpuInstructions;

  /**
   * A string identifying the processor timing context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Document counters defined by processors. A processor can add and increment counters with
   * NestedPerfCounter::IncrementCounterBy. See go/webref-annotator-metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RepositoryWebrefProcessorCounter> processorCounters;

  static {
    // hack to force ProGuard to consider RepositoryWebrefProcessorCounter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RepositoryWebrefProcessorCounter.class);
  }

  /**
   * Nested measurements, see NestedPerfCounter::ScopedPerfCounter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RepositoryWebrefProcessorTiming> processorTimings;

  /**
   * Wall time (in nanoseconds).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long wallTimeNs;

  /**
   * Cpu instructions spent.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCpuInstructions() {
    return cpuInstructions;
  }

  /**
   * Cpu instructions spent.
   * @param cpuInstructions cpuInstructions or {@code null} for none
   */
  public RepositoryWebrefProcessorTiming setCpuInstructions(java.lang.Long cpuInstructions) {
    this.cpuInstructions = cpuInstructions;
    return this;
  }

  /**
   * A string identifying the processor timing context.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A string identifying the processor timing context.
   * @param name name or {@code null} for none
   */
  public RepositoryWebrefProcessorTiming setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Document counters defined by processors. A processor can add and increment counters with
   * NestedPerfCounter::IncrementCounterBy. See go/webref-annotator-metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<RepositoryWebrefProcessorCounter> getProcessorCounters() {
    return processorCounters;
  }

  /**
   * Document counters defined by processors. A processor can add and increment counters with
   * NestedPerfCounter::IncrementCounterBy. See go/webref-annotator-metrics.
   * @param processorCounters processorCounters or {@code null} for none
   */
  public RepositoryWebrefProcessorTiming setProcessorCounters(java.util.List<RepositoryWebrefProcessorCounter> processorCounters) {
    this.processorCounters = processorCounters;
    return this;
  }

  /**
   * Nested measurements, see NestedPerfCounter::ScopedPerfCounter.
   * @return value or {@code null} for none
   */
  public java.util.List<RepositoryWebrefProcessorTiming> getProcessorTimings() {
    return processorTimings;
  }

  /**
   * Nested measurements, see NestedPerfCounter::ScopedPerfCounter.
   * @param processorTimings processorTimings or {@code null} for none
   */
  public RepositoryWebrefProcessorTiming setProcessorTimings(java.util.List<RepositoryWebrefProcessorTiming> processorTimings) {
    this.processorTimings = processorTimings;
    return this;
  }

  /**
   * Wall time (in nanoseconds).
   * @return value or {@code null} for none
   */
  public java.lang.Long getWallTimeNs() {
    return wallTimeNs;
  }

  /**
   * Wall time (in nanoseconds).
   * @param wallTimeNs wallTimeNs or {@code null} for none
   */
  public RepositoryWebrefProcessorTiming setWallTimeNs(java.lang.Long wallTimeNs) {
    this.wallTimeNs = wallTimeNs;
    return this;
  }

  @Override
  public RepositoryWebrefProcessorTiming set(String fieldName, Object value) {
    return (RepositoryWebrefProcessorTiming) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefProcessorTiming clone() {
    return (RepositoryWebrefProcessorTiming) super.clone();
  }

}
