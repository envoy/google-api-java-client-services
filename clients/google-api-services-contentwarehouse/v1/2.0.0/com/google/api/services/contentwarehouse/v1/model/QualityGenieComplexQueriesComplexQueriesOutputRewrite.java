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
 * Model definition for QualityGenieComplexQueriesComplexQueriesOutputRewrite.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityGenieComplexQueriesComplexQueriesOutputRewrite extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QualityGenieComplexQueriesComplexQueriesOutputRewriteEntity> entities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rewriteType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textualRewrite;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<QualityGenieComplexQueriesComplexQueriesOutputRewriteEntity> getEntities() {
    return entities;
  }

  /**
   * @param entities entities or {@code null} for none
   */
  public QualityGenieComplexQueriesComplexQueriesOutputRewrite setEntities(java.util.List<QualityGenieComplexQueriesComplexQueriesOutputRewriteEntity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRewriteType() {
    return rewriteType;
  }

  /**
   * @param rewriteType rewriteType or {@code null} for none
   */
  public QualityGenieComplexQueriesComplexQueriesOutputRewrite setRewriteType(java.lang.String rewriteType) {
    this.rewriteType = rewriteType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTextualRewrite() {
    return textualRewrite;
  }

  /**
   * @param textualRewrite textualRewrite or {@code null} for none
   */
  public QualityGenieComplexQueriesComplexQueriesOutputRewrite setTextualRewrite(java.lang.String textualRewrite) {
    this.textualRewrite = textualRewrite;
    return this;
  }

  @Override
  public QualityGenieComplexQueriesComplexQueriesOutputRewrite set(String fieldName, Object value) {
    return (QualityGenieComplexQueriesComplexQueriesOutputRewrite) super.set(fieldName, value);
  }

  @Override
  public QualityGenieComplexQueriesComplexQueriesOutputRewrite clone() {
    return (QualityGenieComplexQueriesComplexQueriesOutputRewrite) super.clone();
  }

}
