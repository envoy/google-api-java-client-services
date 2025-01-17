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
 * A globally unique identifier associated with each feature. We use 128-bit identifiers so that we
 * have lots of bits available to distinguish between features. The feature id currently consists of
 * a 64-bit "cell id" that **sometimes** corresponds to the approximate centroid of the feature,
 * plus a 64-bit fingerprint of other identifying information. See more on each respective field in
 * its comments. Feature ids are first assigned when the data is created in MapFacts. After initial
 * creation of the feature, they are immutable. This means that the only properties that you should
 * rely on are that they are unique, and that cell_ids often - but not always - preserve spatial
 * locality. The degree of locality varies as the feature undergoes geometry changes, and should not
 * in general be considered a firm guarantee of the location of any particular feature. In fact,
 * some locationless features have randomized cell IDs! Consumers of FeatureProtos from Mapfacts are
 * guaranteed that fprints in the id field of features will be globally unique. Using the fprint
 * allows consumers who don't need the spatial benefit of cell ids to uniquely identify features in
 * a 64-bit address space. This property is not guaranteed for other sources of FeatureProtos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreFeatureIdProto extends com.google.api.client.json.GenericJson {

  /**
   * The S2CellId corresponding to the approximate location of this feature as of when it was first
   * created. This can be of variable accuracy, ranging from the exact centroid of the feature at
   * creation, a very large S2 Cell, or even being completely randomized for locationless features.
   * Cell ids have the nice property that they follow a space-filling curve over the surface of the
   * earth. (See s2cellid.h for details.) WARNING: Clients should only use cell IDs to perform
   * spatial locality optimizations. There is no strict guarantee that the cell ID of a feature is
   * related to the current geometry of the feature in any way.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger cellId;

  /**
   * A 64-bit fingerprint used to identify features. Most clients should rely on MapFacts or OneRing
   * to choose fingerprints. If creating new fprints, the strategy should be chosen so that the
   * chance of collision is remote or non-existent, and the distribution should be reasonably
   * uniform. For example, if the source data assigns unique ids to features, then a fingerprint of
   * the provider name, version, and source id is sufficient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger fprint;

  /**
   * A place for clients to attach arbitrary data to a feature ID. Never set in MapFacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet temporaryData;

  /**
   * The S2CellId corresponding to the approximate location of this feature as of when it was first
   * created. This can be of variable accuracy, ranging from the exact centroid of the feature at
   * creation, a very large S2 Cell, or even being completely randomized for locationless features.
   * Cell ids have the nice property that they follow a space-filling curve over the surface of the
   * earth. (See s2cellid.h for details.) WARNING: Clients should only use cell IDs to perform
   * spatial locality optimizations. There is no strict guarantee that the cell ID of a feature is
   * related to the current geometry of the feature in any way.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getCellId() {
    return cellId;
  }

  /**
   * The S2CellId corresponding to the approximate location of this feature as of when it was first
   * created. This can be of variable accuracy, ranging from the exact centroid of the feature at
   * creation, a very large S2 Cell, or even being completely randomized for locationless features.
   * Cell ids have the nice property that they follow a space-filling curve over the surface of the
   * earth. (See s2cellid.h for details.) WARNING: Clients should only use cell IDs to perform
   * spatial locality optimizations. There is no strict guarantee that the cell ID of a feature is
   * related to the current geometry of the feature in any way.
   * @param cellId cellId or {@code null} for none
   */
  public GeostoreFeatureIdProto setCellId(java.math.BigInteger cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * A 64-bit fingerprint used to identify features. Most clients should rely on MapFacts or OneRing
   * to choose fingerprints. If creating new fprints, the strategy should be chosen so that the
   * chance of collision is remote or non-existent, and the distribution should be reasonably
   * uniform. For example, if the source data assigns unique ids to features, then a fingerprint of
   * the provider name, version, and source id is sufficient.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getFprint() {
    return fprint;
  }

  /**
   * A 64-bit fingerprint used to identify features. Most clients should rely on MapFacts or OneRing
   * to choose fingerprints. If creating new fprints, the strategy should be chosen so that the
   * chance of collision is remote or non-existent, and the distribution should be reasonably
   * uniform. For example, if the source data assigns unique ids to features, then a fingerprint of
   * the provider name, version, and source id is sufficient.
   * @param fprint fprint or {@code null} for none
   */
  public GeostoreFeatureIdProto setFprint(java.math.BigInteger fprint) {
    this.fprint = fprint;
    return this;
  }

  /**
   * A place for clients to attach arbitrary data to a feature ID. Never set in MapFacts.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getTemporaryData() {
    return temporaryData;
  }

  /**
   * A place for clients to attach arbitrary data to a feature ID. Never set in MapFacts.
   * @param temporaryData temporaryData or {@code null} for none
   */
  public GeostoreFeatureIdProto setTemporaryData(Proto2BridgeMessageSet temporaryData) {
    this.temporaryData = temporaryData;
    return this;
  }

  @Override
  public GeostoreFeatureIdProto set(String fieldName, Object value) {
    return (GeostoreFeatureIdProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreFeatureIdProto clone() {
    return (GeostoreFeatureIdProto) super.clone();
  }

}
