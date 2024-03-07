/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef;
import io.cert.manager.models.V1ChallengeSpecSolverDns01AzureDNSManagedIdentity;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Use the Microsoft Azure DNS API to manage DNS01 challenge records.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecSolverDns01AzureDNS {
  public static final String SERIALIZED_NAME_CLIENT_I_D = "clientID";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private String clientID;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF = "clientSecretSecretRef";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF)
  private V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef clientSecretSecretRef;

  /**
   * name of the Azure environment (default AzurePublicCloud)
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    AZUREPUBLICCLOUD("AzurePublicCloud"),
    
    AZURECHINACLOUD("AzureChinaCloud"),
    
    AZUREGERMANCLOUD("AzureGermanCloud"),
    
    AZUREUSGOVERNMENTCLOUD("AzureUSGovernmentCloud");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  public static final String SERIALIZED_NAME_HOSTED_ZONE_NAME = "hostedZoneName";
  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_NAME)
  private String hostedZoneName;

  public static final String SERIALIZED_NAME_MANAGED_IDENTITY = "managedIdentity";
  @SerializedName(SERIALIZED_NAME_MANAGED_IDENTITY)
  private V1ChallengeSpecSolverDns01AzureDNSManagedIdentity managedIdentity;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_NAME = "resourceGroupName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_NAME)
  private String resourceGroupName;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_I_D = "subscriptionID";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_I_D)
  private String subscriptionID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";
  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private String tenantID;

  public V1ChallengeSpecSolverDns01AzureDNS() {
  }

  public V1ChallengeSpecSolverDns01AzureDNS clientID(String clientID) {
    
    this.clientID = clientID;
    return this;
  }

   /**
   * if both this and ClientSecret are left unset MSI will be used
   * @return clientID
  **/
  @jakarta.annotation.Nullable
  public String getClientID() {
    return clientID;
  }


  public void setClientID(String clientID) {
    this.clientID = clientID;
  }


  public V1ChallengeSpecSolverDns01AzureDNS clientSecretSecretRef(V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef clientSecretSecretRef) {
    
    this.clientSecretSecretRef = clientSecretSecretRef;
    return this;
  }

   /**
   * Get clientSecretSecretRef
   * @return clientSecretSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef getClientSecretSecretRef() {
    return clientSecretSecretRef;
  }


  public void setClientSecretSecretRef(V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef clientSecretSecretRef) {
    this.clientSecretSecretRef = clientSecretSecretRef;
  }


  public V1ChallengeSpecSolverDns01AzureDNS environment(EnvironmentEnum environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * name of the Azure environment (default AzurePublicCloud)
   * @return environment
  **/
  @jakarta.annotation.Nullable
  public EnvironmentEnum getEnvironment() {
    return environment;
  }


  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }


  public V1ChallengeSpecSolverDns01AzureDNS hostedZoneName(String hostedZoneName) {
    
    this.hostedZoneName = hostedZoneName;
    return this;
  }

   /**
   * name of the DNS zone that should be used
   * @return hostedZoneName
  **/
  @jakarta.annotation.Nullable
  public String getHostedZoneName() {
    return hostedZoneName;
  }


  public void setHostedZoneName(String hostedZoneName) {
    this.hostedZoneName = hostedZoneName;
  }


  public V1ChallengeSpecSolverDns01AzureDNS managedIdentity(V1ChallengeSpecSolverDns01AzureDNSManagedIdentity managedIdentity) {
    
    this.managedIdentity = managedIdentity;
    return this;
  }

   /**
   * Get managedIdentity
   * @return managedIdentity
  **/
  @jakarta.annotation.Nullable
  public V1ChallengeSpecSolverDns01AzureDNSManagedIdentity getManagedIdentity() {
    return managedIdentity;
  }


  public void setManagedIdentity(V1ChallengeSpecSolverDns01AzureDNSManagedIdentity managedIdentity) {
    this.managedIdentity = managedIdentity;
  }


  public V1ChallengeSpecSolverDns01AzureDNS resourceGroupName(String resourceGroupName) {
    
    this.resourceGroupName = resourceGroupName;
    return this;
  }

   /**
   * resource group the DNS zone is located in
   * @return resourceGroupName
  **/
  @jakarta.annotation.Nonnull
  public String getResourceGroupName() {
    return resourceGroupName;
  }


  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }


  public V1ChallengeSpecSolverDns01AzureDNS subscriptionID(String subscriptionID) {
    
    this.subscriptionID = subscriptionID;
    return this;
  }

   /**
   * ID of the Azure subscription
   * @return subscriptionID
  **/
  @jakarta.annotation.Nonnull
  public String getSubscriptionID() {
    return subscriptionID;
  }


  public void setSubscriptionID(String subscriptionID) {
    this.subscriptionID = subscriptionID;
  }


  public V1ChallengeSpecSolverDns01AzureDNS tenantID(String tenantID) {
    
    this.tenantID = tenantID;
    return this;
  }

   /**
   * when specifying ClientID and ClientSecret then this field is also needed
   * @return tenantID
  **/
  @jakarta.annotation.Nullable
  public String getTenantID() {
    return tenantID;
  }


  public void setTenantID(String tenantID) {
    this.tenantID = tenantID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecSolverDns01AzureDNS v1ChallengeSpecSolverDns01AzureDNS = (V1ChallengeSpecSolverDns01AzureDNS) o;
    return Objects.equals(this.clientID, v1ChallengeSpecSolverDns01AzureDNS.clientID) &&
        Objects.equals(this.clientSecretSecretRef, v1ChallengeSpecSolverDns01AzureDNS.clientSecretSecretRef) &&
        Objects.equals(this.environment, v1ChallengeSpecSolverDns01AzureDNS.environment) &&
        Objects.equals(this.hostedZoneName, v1ChallengeSpecSolverDns01AzureDNS.hostedZoneName) &&
        Objects.equals(this.managedIdentity, v1ChallengeSpecSolverDns01AzureDNS.managedIdentity) &&
        Objects.equals(this.resourceGroupName, v1ChallengeSpecSolverDns01AzureDNS.resourceGroupName) &&
        Objects.equals(this.subscriptionID, v1ChallengeSpecSolverDns01AzureDNS.subscriptionID) &&
        Objects.equals(this.tenantID, v1ChallengeSpecSolverDns01AzureDNS.tenantID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientID, clientSecretSecretRef, environment, hostedZoneName, managedIdentity, resourceGroupName, subscriptionID, tenantID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecSolverDns01AzureDNS {\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    clientSecretSecretRef: ").append(toIndentedString(clientSecretSecretRef)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    hostedZoneName: ").append(toIndentedString(hostedZoneName)).append("\n");
    sb.append("    managedIdentity: ").append(toIndentedString(managedIdentity)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("clientID");
    openapiFields.add("clientSecretSecretRef");
    openapiFields.add("environment");
    openapiFields.add("hostedZoneName");
    openapiFields.add("managedIdentity");
    openapiFields.add("resourceGroupName");
    openapiFields.add("subscriptionID");
    openapiFields.add("tenantID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("resourceGroupName");
    openapiRequiredFields.add("subscriptionID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecSolverDns01AzureDNS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecSolverDns01AzureDNS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecSolverDns01AzureDNS is not found in the empty JSON string", V1ChallengeSpecSolverDns01AzureDNS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecSolverDns01AzureDNS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecSolverDns01AzureDNS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ChallengeSpecSolverDns01AzureDNS.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("clientID") != null && !jsonObj.get("clientID").isJsonNull()) && !jsonObj.get("clientID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientID").toString()));
      }
      // validate the optional field `clientSecretSecretRef`
      if (jsonObj.get("clientSecretSecretRef") != null && !jsonObj.get("clientSecretSecretRef").isJsonNull()) {
        V1ChallengeSpecSolverDns01AzureDNSClientSecretSecretRef.validateJsonObject(jsonObj.getAsJsonObject("clientSecretSecretRef"));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("hostedZoneName") != null && !jsonObj.get("hostedZoneName").isJsonNull()) && !jsonObj.get("hostedZoneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostedZoneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostedZoneName").toString()));
      }
      // validate the optional field `managedIdentity`
      if (jsonObj.get("managedIdentity") != null && !jsonObj.get("managedIdentity").isJsonNull()) {
        V1ChallengeSpecSolverDns01AzureDNSManagedIdentity.validateJsonObject(jsonObj.getAsJsonObject("managedIdentity"));
      }
      if (!jsonObj.get("resourceGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceGroupName").toString()));
      }
      if (!jsonObj.get("subscriptionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionID").toString()));
      }
      if ((jsonObj.get("tenantID") != null && !jsonObj.get("tenantID").isJsonNull()) && !jsonObj.get("tenantID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecSolverDns01AzureDNS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecSolverDns01AzureDNS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecSolverDns01AzureDNS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecSolverDns01AzureDNS.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecSolverDns01AzureDNS>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecSolverDns01AzureDNS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecSolverDns01AzureDNS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecSolverDns01AzureDNS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecSolverDns01AzureDNS
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecSolverDns01AzureDNS
  */
  public static V1ChallengeSpecSolverDns01AzureDNS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecSolverDns01AzureDNS.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecSolverDns01AzureDNS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
