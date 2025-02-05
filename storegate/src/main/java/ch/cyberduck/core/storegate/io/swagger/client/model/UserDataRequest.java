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
public class UserDataRequest {
  @JsonProperty("company")
  private String company = null;

  @JsonProperty("organizationNumber")
  private String organizationNumber = null;

  @JsonProperty("socialSecurityNumber")
  private String socialSecurityNumber = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("newsletter")
  private Boolean newsletter = null;

  public UserDataRequest company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company name
   * @return company
  **/
  @ApiModelProperty(value = "Company name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserDataRequest organizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
    return this;
  }

   /**
   * Organization number
   * @return organizationNumber
  **/
  @ApiModelProperty(value = "Organization number")
  public String getOrganizationNumber() {
    return organizationNumber;
  }

  public void setOrganizationNumber(String organizationNumber) {
    this.organizationNumber = organizationNumber;
  }

  public UserDataRequest socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * Social security number
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "Social security number")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public UserDataRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code (ISO 3166-1 alpha-2)
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code (ISO 3166-1 alpha-2)")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UserDataRequest vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * VAT number
   * @return vatNumber
  **/
  @ApiModelProperty(value = "VAT number")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public UserDataRequest newsletter(Boolean newsletter) {
    this.newsletter = newsletter;
    return this;
  }

   /**
   * Subscribe to newsletter
   * @return newsletter
  **/
  @ApiModelProperty(value = "Subscribe to newsletter")
  public Boolean isNewsletter() {
    return newsletter;
  }

  public void setNewsletter(Boolean newsletter) {
    this.newsletter = newsletter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataRequest userDataRequest = (UserDataRequest) o;
    return Objects.equals(this.company, userDataRequest.company) &&
        Objects.equals(this.organizationNumber, userDataRequest.organizationNumber) &&
        Objects.equals(this.socialSecurityNumber, userDataRequest.socialSecurityNumber) &&
        Objects.equals(this.countryCode, userDataRequest.countryCode) &&
        Objects.equals(this.vatNumber, userDataRequest.vatNumber) &&
        Objects.equals(this.newsletter, userDataRequest.newsletter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, organizationNumber, socialSecurityNumber, countryCode, vatNumber, newsletter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataRequest {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    organizationNumber: ").append(toIndentedString(organizationNumber)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    newsletter: ").append(toIndentedString(newsletter)).append("\n");
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

