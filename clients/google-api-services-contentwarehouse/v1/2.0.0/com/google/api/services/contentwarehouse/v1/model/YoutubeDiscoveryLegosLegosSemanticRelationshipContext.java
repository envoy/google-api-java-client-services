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
 * Extra context about how the entity relates to the document. Typically vertical-specific.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YoutubeDiscoveryLegosLegosSemanticRelationshipContext extends com.google.api.client.json.GenericJson {

  /**
   * The subject of the semantic relationship. This is set when the relationship is derived from
   * some other entity. The exact meaning of this field depends on the ContextType.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private YoutubeDiscoveryLegosLegosEntity subject;

  /**
   * The type of semantic relationship between the document and the entity. This allows one to
   * retrieve vertical-specific fine-grained information about the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The subject of the semantic relationship. This is set when the relationship is derived from
   * some other entity. The exact meaning of this field depends on the ContextType.
   * @return value or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosEntity getSubject() {
    return subject;
  }

  /**
   * The subject of the semantic relationship. This is set when the relationship is derived from
   * some other entity. The exact meaning of this field depends on the ContextType.
   * @param subject subject or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosSemanticRelationshipContext setSubject(YoutubeDiscoveryLegosLegosEntity subject) {
    this.subject = subject;
    return this;
  }

  /**
   * The type of semantic relationship between the document and the entity. This allows one to
   * retrieve vertical-specific fine-grained information about the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of semantic relationship between the document and the entity. This allows one to
   * retrieve vertical-specific fine-grained information about the document.
   * @param type type or {@code null} for none
   */
  public YoutubeDiscoveryLegosLegosSemanticRelationshipContext setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public YoutubeDiscoveryLegosLegosSemanticRelationshipContext set(String fieldName, Object value) {
    return (YoutubeDiscoveryLegosLegosSemanticRelationshipContext) super.set(fieldName, value);
  }

  @Override
  public YoutubeDiscoveryLegosLegosSemanticRelationshipContext clone() {
    return (YoutubeDiscoveryLegosLegosSemanticRelationshipContext) super.clone();
  }

}
