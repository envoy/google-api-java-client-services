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
 * As video mutations are reconciled by Venom, we can tell if the ingredient did or did not reach
 * certain objectives. When processing has completed, all objectives will have a corresponding
 * transition. All transitions are reset for every mutation, but will take into account assets
 * outside of that mutation. For example, if Asset X fails, and was part of
 * "OBJECTIVE_PRIMARY_ASSETS_DONE", a rerun of Asset Y is destined to result in OUTCOME_FAILED,
 * regardless of the fate of Asset Y. Some phenonema have effects on most or all Objectives. For
 * example, a bad input file will result on OUTCOME_INFEASIBLE across the board (eventually, for now
 * it's just GO_LIVE and DO_ALL, work in progress), and a failure to produce Format 18 will cause
 * OUTCOME_FAILED across most Objectives.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoAssetsVenomTransition extends com.google.api.client.json.GenericJson {

  /**
   * The objective this transition is about. REQUIRED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objective;

  /**
   * Whether the objective is reached or not. REQUIRED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outcome;

  /**
   * An optional debug string indicating the reason for this transition. This is typically omitted
   * for OUTCOME_SUCCESS. e.g. "The video's content is invalid due to failed blobstore cloning."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The objective this transition is about. REQUIRED.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjective() {
    return objective;
  }

  /**
   * The objective this transition is about. REQUIRED.
   * @param objective objective or {@code null} for none
   */
  public VideoAssetsVenomTransition setObjective(java.lang.String objective) {
    this.objective = objective;
    return this;
  }

  /**
   * Whether the objective is reached or not. REQUIRED.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutcome() {
    return outcome;
  }

  /**
   * Whether the objective is reached or not. REQUIRED.
   * @param outcome outcome or {@code null} for none
   */
  public VideoAssetsVenomTransition setOutcome(java.lang.String outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * An optional debug string indicating the reason for this transition. This is typically omitted
   * for OUTCOME_SUCCESS. e.g. "The video's content is invalid due to failed blobstore cloning."
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * An optional debug string indicating the reason for this transition. This is typically omitted
   * for OUTCOME_SUCCESS. e.g. "The video's content is invalid due to failed blobstore cloning."
   * @param reason reason or {@code null} for none
   */
  public VideoAssetsVenomTransition setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public VideoAssetsVenomTransition set(String fieldName, Object value) {
    return (VideoAssetsVenomTransition) super.set(fieldName, value);
  }

  @Override
  public VideoAssetsVenomTransition clone() {
    return (VideoAssetsVenomTransition) super.clone();
  }

}
