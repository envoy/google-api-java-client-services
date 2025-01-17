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
 * UserProto identifies a (human) user of Geo Data. Its primary use is in describing the source of
 * pieces of data (e.g. edits). It could be a simple identifier, but isn't so that we can store it
 * in the clear while still preventing correlation between a user's contribution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreUserProto extends com.google.api.client.json.GenericJson {

  /**
   * The user Gaia ID in encrypted form. Wipeout ids take value of "" in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptedGaiaId;

  /**
   * Required. The name of the key used to encrypt the Gaia ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionKeyName;

  /**
   * Required (valid default provided). The config ID of the owner of the above encryption_key_name.
   * This field must be set if the encryption key name is *not* "mapfacts_gaia_id_encryption_key".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer keystoreConfigId;

  /**
   * If possible, writers should set this to a full user email, including the domain. Readers should
   * not assume that this is a well-formed email address. This field may only be set by Atlas,
   * Pushpin and OneRing because they are internal tools which have a PWG exception to store textual
   * usernames in the clear.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * The user Gaia ID in encrypted form. Wipeout ids take value of "" in bytes.
   * @see #decodeEncryptedGaiaId()
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptedGaiaId() {
    return encryptedGaiaId;
  }

  /**
   * The user Gaia ID in encrypted form. Wipeout ids take value of "" in bytes.
   * @see #getEncryptedGaiaId()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEncryptedGaiaId() {
    return com.google.api.client.util.Base64.decodeBase64(encryptedGaiaId);
  }

  /**
   * The user Gaia ID in encrypted form. Wipeout ids take value of "" in bytes.
   * @see #encodeEncryptedGaiaId()
   * @param encryptedGaiaId encryptedGaiaId or {@code null} for none
   */
  public GeostoreUserProto setEncryptedGaiaId(java.lang.String encryptedGaiaId) {
    this.encryptedGaiaId = encryptedGaiaId;
    return this;
  }

  /**
   * The user Gaia ID in encrypted form. Wipeout ids take value of "" in bytes.
   * @see #setEncryptedGaiaId()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GeostoreUserProto encodeEncryptedGaiaId(byte[] encryptedGaiaId) {
    this.encryptedGaiaId = com.google.api.client.util.Base64.encodeBase64URLSafeString(encryptedGaiaId);
    return this;
  }

  /**
   * Required. The name of the key used to encrypt the Gaia ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionKeyName() {
    return encryptionKeyName;
  }

  /**
   * Required. The name of the key used to encrypt the Gaia ID.
   * @param encryptionKeyName encryptionKeyName or {@code null} for none
   */
  public GeostoreUserProto setEncryptionKeyName(java.lang.String encryptionKeyName) {
    this.encryptionKeyName = encryptionKeyName;
    return this;
  }

  /**
   * Required (valid default provided). The config ID of the owner of the above encryption_key_name.
   * This field must be set if the encryption key name is *not* "mapfacts_gaia_id_encryption_key".
   * @return value or {@code null} for none
   */
  public java.lang.Integer getKeystoreConfigId() {
    return keystoreConfigId;
  }

  /**
   * Required (valid default provided). The config ID of the owner of the above encryption_key_name.
   * This field must be set if the encryption key name is *not* "mapfacts_gaia_id_encryption_key".
   * @param keystoreConfigId keystoreConfigId or {@code null} for none
   */
  public GeostoreUserProto setKeystoreConfigId(java.lang.Integer keystoreConfigId) {
    this.keystoreConfigId = keystoreConfigId;
    return this;
  }

  /**
   * If possible, writers should set this to a full user email, including the domain. Readers should
   * not assume that this is a well-formed email address. This field may only be set by Atlas,
   * Pushpin and OneRing because they are internal tools which have a PWG exception to store textual
   * usernames in the clear.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * If possible, writers should set this to a full user email, including the domain. Readers should
   * not assume that this is a well-formed email address. This field may only be set by Atlas,
   * Pushpin and OneRing because they are internal tools which have a PWG exception to store textual
   * usernames in the clear.
   * @param username username or {@code null} for none
   */
  public GeostoreUserProto setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public GeostoreUserProto set(String fieldName, Object value) {
    return (GeostoreUserProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreUserProto clone() {
    return (GeostoreUserProto) super.clone();
  }

}
