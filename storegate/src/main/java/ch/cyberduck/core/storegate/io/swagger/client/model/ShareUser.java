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
public class ShareUser {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  public ShareUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The account username.
   * @return username
  **/
  @ApiModelProperty(value = "The account username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ShareUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The users name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The users name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ShareUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The users surname.
   * @return lastName
  **/
  @ApiModelProperty(value = "The users surname.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ShareUser company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The users company.
   * @return company
  **/
  @ApiModelProperty(value = "The users company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareUser shareUser = (ShareUser) o;
    return Objects.equals(this.username, shareUser.username) &&
        Objects.equals(this.firstName, shareUser.firstName) &&
        Objects.equals(this.lastName, shareUser.lastName) &&
        Objects.equals(this.company, shareUser.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareUser {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

