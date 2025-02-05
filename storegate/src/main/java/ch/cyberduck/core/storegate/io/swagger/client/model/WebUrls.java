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
 * An list of urls to use
 */
@ApiModel(description = "An list of urls to use")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:06:08.665+02:00")
public class WebUrls {
  @JsonProperty("filesUrl")
  private String filesUrl = null;

  @JsonProperty("backupUrl")
  private String backupUrl = null;

  @JsonProperty("commonUrl")
  private String commonUrl = null;

  @JsonProperty("accountUrl")
  private String accountUrl = null;

  @JsonProperty("settingsUrl")
  private String settingsUrl = null;

  @JsonProperty("backupManagementUrl")
  private String backupManagementUrl = null;

  @JsonProperty("syncManagementUrl")
  private String syncManagementUrl = null;

  @JsonProperty("supportUrl")
  private String supportUrl = null;

  @JsonProperty("wopiUrl")
  private String wopiUrl = null;

  @JsonProperty("partnerUrl")
  private String partnerUrl = null;

  @JsonProperty("retailerUrl")
  private String retailerUrl = null;

  public WebUrls filesUrl(String filesUrl) {
    this.filesUrl = filesUrl;
    return this;
  }

   /**
   * A url to the files page
   * @return filesUrl
  **/
  @ApiModelProperty(value = "A url to the files page")
  public String getFilesUrl() {
    return filesUrl;
  }

  public void setFilesUrl(String filesUrl) {
    this.filesUrl = filesUrl;
  }

  public WebUrls backupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
    return this;
  }

   /**
   * A url to the backup page
   * @return backupUrl
  **/
  @ApiModelProperty(value = "A url to the backup page")
  public String getBackupUrl() {
    return backupUrl;
  }

  public void setBackupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
  }

  public WebUrls commonUrl(String commonUrl) {
    this.commonUrl = commonUrl;
    return this;
  }

   /**
   * A url to the Common page
   * @return commonUrl
  **/
  @ApiModelProperty(value = "A url to the Common page")
  public String getCommonUrl() {
    return commonUrl;
  }

  public void setCommonUrl(String commonUrl) {
    this.commonUrl = commonUrl;
  }

  public WebUrls accountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
    return this;
  }

   /**
   * A url to the accounts page
   * @return accountUrl
  **/
  @ApiModelProperty(value = "A url to the accounts page")
  public String getAccountUrl() {
    return accountUrl;
  }

  public void setAccountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
  }

  public WebUrls settingsUrl(String settingsUrl) {
    this.settingsUrl = settingsUrl;
    return this;
  }

   /**
   * A url to the settings page
   * @return settingsUrl
  **/
  @ApiModelProperty(value = "A url to the settings page")
  public String getSettingsUrl() {
    return settingsUrl;
  }

  public void setSettingsUrl(String settingsUrl) {
    this.settingsUrl = settingsUrl;
  }

  public WebUrls backupManagementUrl(String backupManagementUrl) {
    this.backupManagementUrl = backupManagementUrl;
    return this;
  }

   /**
   * A url to the backup management page
   * @return backupManagementUrl
  **/
  @ApiModelProperty(value = "A url to the backup management page")
  public String getBackupManagementUrl() {
    return backupManagementUrl;
  }

  public void setBackupManagementUrl(String backupManagementUrl) {
    this.backupManagementUrl = backupManagementUrl;
  }

  public WebUrls syncManagementUrl(String syncManagementUrl) {
    this.syncManagementUrl = syncManagementUrl;
    return this;
  }

   /**
   * A url to the sync managemant page
   * @return syncManagementUrl
  **/
  @ApiModelProperty(value = "A url to the sync managemant page")
  public String getSyncManagementUrl() {
    return syncManagementUrl;
  }

  public void setSyncManagementUrl(String syncManagementUrl) {
    this.syncManagementUrl = syncManagementUrl;
  }

  public WebUrls supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * A url to the support page
   * @return supportUrl
  **/
  @ApiModelProperty(value = "A url to the support page")
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }

  public WebUrls wopiUrl(String wopiUrl) {
    this.wopiUrl = wopiUrl;
    return this;
  }

   /**
   * A url for use with WOPI
   * @return wopiUrl
  **/
  @ApiModelProperty(value = "A url for use with WOPI")
  public String getWopiUrl() {
    return wopiUrl;
  }

  public void setWopiUrl(String wopiUrl) {
    this.wopiUrl = wopiUrl;
  }

  public WebUrls partnerUrl(String partnerUrl) {
    this.partnerUrl = partnerUrl;
    return this;
  }

   /**
   * A url to the partner information
   * @return partnerUrl
  **/
  @ApiModelProperty(value = "A url to the partner information")
  public String getPartnerUrl() {
    return partnerUrl;
  }

  public void setPartnerUrl(String partnerUrl) {
    this.partnerUrl = partnerUrl;
  }

  public WebUrls retailerUrl(String retailerUrl) {
    this.retailerUrl = retailerUrl;
    return this;
  }

   /**
   * A url to the retailer information
   * @return retailerUrl
  **/
  @ApiModelProperty(value = "A url to the retailer information")
  public String getRetailerUrl() {
    return retailerUrl;
  }

  public void setRetailerUrl(String retailerUrl) {
    this.retailerUrl = retailerUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebUrls webUrls = (WebUrls) o;
    return Objects.equals(this.filesUrl, webUrls.filesUrl) &&
        Objects.equals(this.backupUrl, webUrls.backupUrl) &&
        Objects.equals(this.commonUrl, webUrls.commonUrl) &&
        Objects.equals(this.accountUrl, webUrls.accountUrl) &&
        Objects.equals(this.settingsUrl, webUrls.settingsUrl) &&
        Objects.equals(this.backupManagementUrl, webUrls.backupManagementUrl) &&
        Objects.equals(this.syncManagementUrl, webUrls.syncManagementUrl) &&
        Objects.equals(this.supportUrl, webUrls.supportUrl) &&
        Objects.equals(this.wopiUrl, webUrls.wopiUrl) &&
        Objects.equals(this.partnerUrl, webUrls.partnerUrl) &&
        Objects.equals(this.retailerUrl, webUrls.retailerUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesUrl, backupUrl, commonUrl, accountUrl, settingsUrl, backupManagementUrl, syncManagementUrl, supportUrl, wopiUrl, partnerUrl, retailerUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebUrls {\n");
    
    sb.append("    filesUrl: ").append(toIndentedString(filesUrl)).append("\n");
    sb.append("    backupUrl: ").append(toIndentedString(backupUrl)).append("\n");
    sb.append("    commonUrl: ").append(toIndentedString(commonUrl)).append("\n");
    sb.append("    accountUrl: ").append(toIndentedString(accountUrl)).append("\n");
    sb.append("    settingsUrl: ").append(toIndentedString(settingsUrl)).append("\n");
    sb.append("    backupManagementUrl: ").append(toIndentedString(backupManagementUrl)).append("\n");
    sb.append("    syncManagementUrl: ").append(toIndentedString(syncManagementUrl)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    wopiUrl: ").append(toIndentedString(wopiUrl)).append("\n");
    sb.append("    partnerUrl: ").append(toIndentedString(partnerUrl)).append("\n");
    sb.append("    retailerUrl: ").append(toIndentedString(retailerUrl)).append("\n");
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

