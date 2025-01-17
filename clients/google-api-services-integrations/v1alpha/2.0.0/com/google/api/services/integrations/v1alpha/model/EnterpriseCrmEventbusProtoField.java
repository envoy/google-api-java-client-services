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

package com.google.api.services.integrations.v1alpha.model;

/**
 * Information about the value and type of the field. Next Id: 8
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoField extends com.google.api.client.json.GenericJson {

  /**
   * By default, if the cardinality is unspecified the field is considered required while mapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cardinality;

  /**
   * This holds the default values for the fields. This value is supplied by user so may or may not
   * contain PII or SPII data. This field will be scrubbed using DatapolScrubber#maybeScrub() with
   * go/proto-sanitizer#level3
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoParameterValueType defaultValue;

  /**
   * Specifies the data type of the field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldType;

  /**
   * Optional. The fully qualified proto name (e.g. enterprise.crm.storage.Account). Required for
   * output field of type PROTO_VALUE or PROTO_ARRAY. For e.g., if input field_type is BYTES and
   * output field_type is PROTO_VALUE, then fully qualified proto type url should be provided to
   * parse the input bytes. If field_type is *_ARRAY, then all the converted protos are of the same
   * type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protoDefPath;

  /**
   * This holds the reference key of the workflow or task parameter. 1. Any workflow parameter, for
   * e.g. $workflowParam1$. 2. Any task input or output parameter, for e.g. $task1_param1$. 3. Any
   * workflow or task parameters with subfield references, for e.g., $task1_param1.employee.id$
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceKey;

  /**
   * This is the transform expression to fetch the input field value. for e.g.
   * $param1$.CONCAT('test'). See go/transform-functions-design for more details. Keep points - 1.
   * Only input field can have a transform expression. 2. If a transform expression is provided,
   * reference_key will be ignored. 3. If no value is returned after evaluation of transform
   * expression, default_value can be mapped if provided. 4. The field_type should be the type of
   * the final object returned after the transform expression is evaluated. Scrubs the transform
   * expression before logging as value provided by user so may or may not contain PII or SPII data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmEventbusProtoTransformExpression transformExpression;

  /**
   * By default, if the cardinality is unspecified the field is considered required while mapping.
   * @return value or {@code null} for none
   */
  public java.lang.String getCardinality() {
    return cardinality;
  }

  /**
   * By default, if the cardinality is unspecified the field is considered required while mapping.
   * @param cardinality cardinality or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setCardinality(java.lang.String cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * This holds the default values for the fields. This value is supplied by user so may or may not
   * contain PII or SPII data. This field will be scrubbed using DatapolScrubber#maybeScrub() with
   * go/proto-sanitizer#level3
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoParameterValueType getDefaultValue() {
    return defaultValue;
  }

  /**
   * This holds the default values for the fields. This value is supplied by user so may or may not
   * contain PII or SPII data. This field will be scrubbed using DatapolScrubber#maybeScrub() with
   * go/proto-sanitizer#level3
   * @param defaultValue defaultValue or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setDefaultValue(EnterpriseCrmEventbusProtoParameterValueType defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Specifies the data type of the field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldType() {
    return fieldType;
  }

  /**
   * Specifies the data type of the field.
   * @param fieldType fieldType or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setFieldType(java.lang.String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Optional. The fully qualified proto name (e.g. enterprise.crm.storage.Account). Required for
   * output field of type PROTO_VALUE or PROTO_ARRAY. For e.g., if input field_type is BYTES and
   * output field_type is PROTO_VALUE, then fully qualified proto type url should be provided to
   * parse the input bytes. If field_type is *_ARRAY, then all the converted protos are of the same
   * type.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtoDefPath() {
    return protoDefPath;
  }

  /**
   * Optional. The fully qualified proto name (e.g. enterprise.crm.storage.Account). Required for
   * output field of type PROTO_VALUE or PROTO_ARRAY. For e.g., if input field_type is BYTES and
   * output field_type is PROTO_VALUE, then fully qualified proto type url should be provided to
   * parse the input bytes. If field_type is *_ARRAY, then all the converted protos are of the same
   * type.
   * @param protoDefPath protoDefPath or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setProtoDefPath(java.lang.String protoDefPath) {
    this.protoDefPath = protoDefPath;
    return this;
  }

  /**
   * This holds the reference key of the workflow or task parameter. 1. Any workflow parameter, for
   * e.g. $workflowParam1$. 2. Any task input or output parameter, for e.g. $task1_param1$. 3. Any
   * workflow or task parameters with subfield references, for e.g., $task1_param1.employee.id$
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceKey() {
    return referenceKey;
  }

  /**
   * This holds the reference key of the workflow or task parameter. 1. Any workflow parameter, for
   * e.g. $workflowParam1$. 2. Any task input or output parameter, for e.g. $task1_param1$. 3. Any
   * workflow or task parameters with subfield references, for e.g., $task1_param1.employee.id$
   * @param referenceKey referenceKey or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setReferenceKey(java.lang.String referenceKey) {
    this.referenceKey = referenceKey;
    return this;
  }

  /**
   * This is the transform expression to fetch the input field value. for e.g.
   * $param1$.CONCAT('test'). See go/transform-functions-design for more details. Keep points - 1.
   * Only input field can have a transform expression. 2. If a transform expression is provided,
   * reference_key will be ignored. 3. If no value is returned after evaluation of transform
   * expression, default_value can be mapped if provided. 4. The field_type should be the type of
   * the final object returned after the transform expression is evaluated. Scrubs the transform
   * expression before logging as value provided by user so may or may not contain PII or SPII data.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoTransformExpression getTransformExpression() {
    return transformExpression;
  }

  /**
   * This is the transform expression to fetch the input field value. for e.g.
   * $param1$.CONCAT('test'). See go/transform-functions-design for more details. Keep points - 1.
   * Only input field can have a transform expression. 2. If a transform expression is provided,
   * reference_key will be ignored. 3. If no value is returned after evaluation of transform
   * expression, default_value can be mapped if provided. 4. The field_type should be the type of
   * the final object returned after the transform expression is evaluated. Scrubs the transform
   * expression before logging as value provided by user so may or may not contain PII or SPII data.
   * @param transformExpression transformExpression or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoField setTransformExpression(EnterpriseCrmEventbusProtoTransformExpression transformExpression) {
    this.transformExpression = transformExpression;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoField set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoField) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoField clone() {
    return (EnterpriseCrmEventbusProtoField) super.clone();
  }

}
