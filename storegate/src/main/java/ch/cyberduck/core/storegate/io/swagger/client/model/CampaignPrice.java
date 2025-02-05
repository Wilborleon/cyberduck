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
public class CampaignPrice {
  @JsonProperty("startFee")
  private Double startFee = null;

  @JsonProperty("monthlyFee")
  private Double monthlyFee = null;

  @JsonProperty("length")
  private Integer length = null;

  public CampaignPrice startFee(Double startFee) {
    this.startFee = startFee;
    return this;
  }

   /**
   * The campaign start fee
   * @return startFee
  **/
  @ApiModelProperty(value = "The campaign start fee")
  public Double getStartFee() {
    return startFee;
  }

  public void setStartFee(Double startFee) {
    this.startFee = startFee;
  }

  public CampaignPrice monthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * The campaign monthly fee
   * @return monthlyFee
  **/
  @ApiModelProperty(value = "The campaign monthly fee")
  public Double getMonthlyFee() {
    return monthlyFee;
  }

  public void setMonthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
  }

  public CampaignPrice length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Length of the campaign
   * @return length
  **/
  @ApiModelProperty(value = "Length of the campaign")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPrice campaignPrice = (CampaignPrice) o;
    return Objects.equals(this.startFee, campaignPrice.startFee) &&
        Objects.equals(this.monthlyFee, campaignPrice.monthlyFee) &&
        Objects.equals(this.length, campaignPrice.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startFee, monthlyFee, length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPrice {\n");
    
    sb.append("    startFee: ").append(toIndentedString(startFee)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

