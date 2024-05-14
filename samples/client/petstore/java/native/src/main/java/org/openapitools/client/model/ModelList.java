/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ModelList
 */
@JsonPropertyOrder({
  ModelList.JSON_PROPERTY_123LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ModelList {
  public static final String JSON_PROPERTY_123LIST = "123-list";
  private String _123list;

  public ModelList() { 
  }

  public ModelList _123list(String _123list) {
    this._123list = _123list;
    return this;
  }

   /**
   * Get _123list
   * @return _123list
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_123LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get123list() {
    return _123list;
  }


  @JsonProperty(JSON_PROPERTY_123LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set123list(String _123list) {
    this._123list = _123list;
  }


  /**
   * Return true if this List object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this._123list, _list._123list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelList {\n");
    sb.append("    _123list: ").append(toIndentedString(_123list)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `123-list` to the URL query string
    if (get123list() != null) {
      joiner.add(String.format("%s123-list%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get123list()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }

    public static class Builder {

    private ModelList instance;

    public Builder() {
      this(new ModelList());
    }

    protected Builder(ModelList instance) {
      this.instance = instance;
    }

    public ModelList.Builder _123list(String _123list) {
      this.instance._123list = _123list;
      return this;
    }


    /**
    * returns a built ModelList instance.
    *
    * The builder is not reusable.
    */
    public ModelList build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static ModelList.Builder builder() {
    return new ModelList.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ModelList.Builder toBuilder() {
    return new ModelList.Builder()
      ._123list(get123list());
  }

}

