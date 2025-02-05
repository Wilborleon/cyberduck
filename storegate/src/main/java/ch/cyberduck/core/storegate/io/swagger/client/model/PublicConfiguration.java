/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:06:08.665+02:00")
public class PublicConfiguration {
  @JsonProperty("theme")
  private String theme = null;

  @JsonProperty("locale")
  private String locale = null;

  public PublicConfiguration theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * What theme to use
   * @return theme
  **/
  @ApiModelProperty(value = "What theme to use")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public PublicConfiguration locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * What locale to use
   * @return locale
  **/
  @ApiModelProperty(value = "What locale to use")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicConfiguration publicConfiguration = (PublicConfiguration) o;
    return Objects.equals(this.theme, publicConfiguration.theme) &&
        Objects.equals(this.locale, publicConfiguration.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicConfiguration {\n");
    
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

