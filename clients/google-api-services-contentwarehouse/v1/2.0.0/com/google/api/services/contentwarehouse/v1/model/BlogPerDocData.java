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
 * Additional data for Blog/Posts
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BlogPerDocData extends com.google.api.client.json.GenericJson {

  /**
   * used for blogurl crowding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger blogurlFp;

  /**
   * This score captures how spammy the client is that the micropost was created with. The higher
   * the score the worse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer clientSpamminess;

  /**
   * For the threaded conversation view. Only populated in docs with provider type
   * SYNTHETIC_CONVERSATION_DOC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BlogsearchConversationTree convTree;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer copycatScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer docQualityScore;

  /**
   * A syntactic reshare is a document that is * created from an original and shared with friends
   * and * we detect this resharing property by syntactically parsing the doc. . For example, a
   * retweet is an example of a syntactic_reshare because we can detect that it's a reshare by
   * grepping for "RT @".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSyntacticReshare;

  /**
   * Experimental data for quality experiments. This will NOT be populated in prod, but we will use
   * this for experiments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet microblogQualityExptData;

  /**
   * For replies/reshares. num_mentions = number of times the pattern @foo appears in the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numMentions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BlogPerDocDataOutlinks> outlinks;

  /**
   * The fingerprint for the body text of the microblog post. It is copied from
   * MicroBlogPost.post_content_fingerprint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer postContentFingerprint;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer qualityScore;

  /**
   * Blog scoring signals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer spamScore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean universalWhitelisted;

  /**
   * User and doc quality scores for updates (aka microposts).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer userQualityScore;

  /**
   * used for blogurl crowding.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getBlogurlFp() {
    return blogurlFp;
  }

  /**
   * used for blogurl crowding.
   * @param blogurlFp blogurlFp or {@code null} for none
   */
  public BlogPerDocData setBlogurlFp(java.math.BigInteger blogurlFp) {
    this.blogurlFp = blogurlFp;
    return this;
  }

  /**
   * This score captures how spammy the client is that the micropost was created with. The higher
   * the score the worse.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getClientSpamminess() {
    return clientSpamminess;
  }

  /**
   * This score captures how spammy the client is that the micropost was created with. The higher
   * the score the worse.
   * @param clientSpamminess clientSpamminess or {@code null} for none
   */
  public BlogPerDocData setClientSpamminess(java.lang.Integer clientSpamminess) {
    this.clientSpamminess = clientSpamminess;
    return this;
  }

  /**
   * For the threaded conversation view. Only populated in docs with provider type
   * SYNTHETIC_CONVERSATION_DOC.
   * @return value or {@code null} for none
   */
  public BlogsearchConversationTree getConvTree() {
    return convTree;
  }

  /**
   * For the threaded conversation view. Only populated in docs with provider type
   * SYNTHETIC_CONVERSATION_DOC.
   * @param convTree convTree or {@code null} for none
   */
  public BlogPerDocData setConvTree(BlogsearchConversationTree convTree) {
    this.convTree = convTree;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCopycatScore() {
    return copycatScore;
  }

  /**
   * @param copycatScore copycatScore or {@code null} for none
   */
  public BlogPerDocData setCopycatScore(java.lang.Integer copycatScore) {
    this.copycatScore = copycatScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDocQualityScore() {
    return docQualityScore;
  }

  /**
   * @param docQualityScore docQualityScore or {@code null} for none
   */
  public BlogPerDocData setDocQualityScore(java.lang.Integer docQualityScore) {
    this.docQualityScore = docQualityScore;
    return this;
  }

  /**
   * A syntactic reshare is a document that is * created from an original and shared with friends
   * and * we detect this resharing property by syntactically parsing the doc. . For example, a
   * retweet is an example of a syntactic_reshare because we can detect that it's a reshare by
   * grepping for "RT @".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSyntacticReshare() {
    return isSyntacticReshare;
  }

  /**
   * A syntactic reshare is a document that is * created from an original and shared with friends
   * and * we detect this resharing property by syntactically parsing the doc. . For example, a
   * retweet is an example of a syntactic_reshare because we can detect that it's a reshare by
   * grepping for "RT @".
   * @param isSyntacticReshare isSyntacticReshare or {@code null} for none
   */
  public BlogPerDocData setIsSyntacticReshare(java.lang.Boolean isSyntacticReshare) {
    this.isSyntacticReshare = isSyntacticReshare;
    return this;
  }

  /**
   * Experimental data for quality experiments. This will NOT be populated in prod, but we will use
   * this for experiments.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getMicroblogQualityExptData() {
    return microblogQualityExptData;
  }

  /**
   * Experimental data for quality experiments. This will NOT be populated in prod, but we will use
   * this for experiments.
   * @param microblogQualityExptData microblogQualityExptData or {@code null} for none
   */
  public BlogPerDocData setMicroblogQualityExptData(Proto2BridgeMessageSet microblogQualityExptData) {
    this.microblogQualityExptData = microblogQualityExptData;
    return this;
  }

  /**
   * For replies/reshares. num_mentions = number of times the pattern @foo appears in the document.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumMentions() {
    return numMentions;
  }

  /**
   * For replies/reshares. num_mentions = number of times the pattern @foo appears in the document.
   * @param numMentions numMentions or {@code null} for none
   */
  public BlogPerDocData setNumMentions(java.lang.Integer numMentions) {
    this.numMentions = numMentions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<BlogPerDocDataOutlinks> getOutlinks() {
    return outlinks;
  }

  /**
   * @param outlinks outlinks or {@code null} for none
   */
  public BlogPerDocData setOutlinks(java.util.List<BlogPerDocDataOutlinks> outlinks) {
    this.outlinks = outlinks;
    return this;
  }

  /**
   * The fingerprint for the body text of the microblog post. It is copied from
   * MicroBlogPost.post_content_fingerprint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPostContentFingerprint() {
    return postContentFingerprint;
  }

  /**
   * The fingerprint for the body text of the microblog post. It is copied from
   * MicroBlogPost.post_content_fingerprint.
   * @param postContentFingerprint postContentFingerprint or {@code null} for none
   */
  public BlogPerDocData setPostContentFingerprint(java.lang.Integer postContentFingerprint) {
    this.postContentFingerprint = postContentFingerprint;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQualityScore() {
    return qualityScore;
  }

  /**
   * @param qualityScore qualityScore or {@code null} for none
   */
  public BlogPerDocData setQualityScore(java.lang.Integer qualityScore) {
    this.qualityScore = qualityScore;
    return this;
  }

  /**
   * Blog scoring signals.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSpamScore() {
    return spamScore;
  }

  /**
   * Blog scoring signals.
   * @param spamScore spamScore or {@code null} for none
   */
  public BlogPerDocData setSpamScore(java.lang.Integer spamScore) {
    this.spamScore = spamScore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUniversalWhitelisted() {
    return universalWhitelisted;
  }

  /**
   * @param universalWhitelisted universalWhitelisted or {@code null} for none
   */
  public BlogPerDocData setUniversalWhitelisted(java.lang.Boolean universalWhitelisted) {
    this.universalWhitelisted = universalWhitelisted;
    return this;
  }

  /**
   * User and doc quality scores for updates (aka microposts).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUserQualityScore() {
    return userQualityScore;
  }

  /**
   * User and doc quality scores for updates (aka microposts).
   * @param userQualityScore userQualityScore or {@code null} for none
   */
  public BlogPerDocData setUserQualityScore(java.lang.Integer userQualityScore) {
    this.userQualityScore = userQualityScore;
    return this;
  }

  @Override
  public BlogPerDocData set(String fieldName, Object value) {
    return (BlogPerDocData) super.set(fieldName, value);
  }

  @Override
  public BlogPerDocData clone() {
    return (BlogPerDocData) super.clone();
  }

}
