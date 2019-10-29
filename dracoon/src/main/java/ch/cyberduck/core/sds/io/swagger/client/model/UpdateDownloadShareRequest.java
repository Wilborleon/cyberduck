/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.13.0  - built at: 2019-08-07 15:10:42<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.13.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model for updating a Download Share
 */
@ApiModel(description = "Request model for updating a Download Share")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:08:20.178+02:00")
public class UpdateDownloadShareRequest {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("expiration")
    private ObjectExpiration expiration = null;

    @JsonProperty("notes")
    private String notes = null;

    @JsonProperty("internalNotes")
    private String internalNotes = null;

    @JsonProperty("showCreatorName")
    private Boolean showCreatorName = null;

    @JsonProperty("showCreatorUsername")
    private Boolean showCreatorUsername = null;

    @JsonProperty("notifyCreator")
    private Boolean notifyCreator = null;

    @JsonProperty("maxDownloads")
    private Integer maxDownloads = null;

    @JsonProperty("textMessageRecipients")
    private List<String> textMessageRecipients = null;

    @JsonProperty("receiverLanguage")
    private String receiverLanguage = null;

    @JsonProperty("defaultCountry")
    private String defaultCountry = null;

    @JsonProperty("resetPassword")
    private Boolean resetPassword = null;

    @JsonProperty("resetMaxDownloads")
    private Boolean resetMaxDownloads = null;

    public UpdateDownloadShareRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Alias name
     *
     * @return name
     **/
    @ApiModelProperty(value = "Alias name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDownloadShareRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Access password, not allowed for encrypted shares
     *
     * @return password
     **/
    @ApiModelProperty(value = "Access password, not allowed for encrypted shares")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateDownloadShareRequest expiration(ObjectExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Expiration date / time
     *
     * @return expiration
     **/
    @ApiModelProperty(value = "Expiration date / time")
    public ObjectExpiration getExpiration() {
        return expiration;
    }

    public void setExpiration(ObjectExpiration expiration) {
        this.expiration = expiration;
    }

    public UpdateDownloadShareRequest notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * User notes (limited to 255 characters)
     *
     * @return notes
     **/
    @ApiModelProperty(value = "User notes (limited to 255 characters)")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public UpdateDownloadShareRequest internalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
        return this;
    }

    /**
     * Internal notes (limited to 255 characters)
     *
     * @return internalNotes
     **/
    @ApiModelProperty(value = "Internal notes (limited to 255 characters)")
    public String getInternalNotes() {
        return internalNotes;
    }

    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }

    public UpdateDownloadShareRequest showCreatorName(Boolean showCreatorName) {
        this.showCreatorName = showCreatorName;
        return this;
    }

    /**
     * Show creator first and last name.
     *
     * @return showCreatorName
     **/
    @ApiModelProperty(value = "Show creator first and last name.")
    public Boolean isShowCreatorName() {
        return showCreatorName;
    }

    public void setShowCreatorName(Boolean showCreatorName) {
        this.showCreatorName = showCreatorName;
    }

    public UpdateDownloadShareRequest showCreatorUsername(Boolean showCreatorUsername) {
        this.showCreatorUsername = showCreatorUsername;
        return this;
    }

    /**
     * Show creator email address.
     *
     * @return showCreatorUsername
     **/
    @ApiModelProperty(value = "Show creator email address.")
    public Boolean isShowCreatorUsername() {
        return showCreatorUsername;
    }

    public void setShowCreatorUsername(Boolean showCreatorUsername) {
        this.showCreatorUsername = showCreatorUsername;
    }

    public UpdateDownloadShareRequest notifyCreator(Boolean notifyCreator) {
        this.notifyCreator = notifyCreator;
        return this;
    }

    /**
     * Notify creator on every download.
     *
     * @return notifyCreator
     **/
    @ApiModelProperty(value = "Notify creator on every download.")
    public Boolean isNotifyCreator() {
        return notifyCreator;
    }

    public void setNotifyCreator(Boolean notifyCreator) {
        this.notifyCreator = notifyCreator;
    }

    public UpdateDownloadShareRequest maxDownloads(Integer maxDownloads) {
        this.maxDownloads = maxDownloads;
        return this;
    }

    /**
     * Max allowed downloads
     *
     * @return maxDownloads
     **/
    @ApiModelProperty(value = "Max allowed downloads")
    public Integer getMaxDownloads() {
        return maxDownloads;
    }

    public void setMaxDownloads(Integer maxDownloads) {
        this.maxDownloads = maxDownloads;
    }

    public UpdateDownloadShareRequest textMessageRecipients(List<String> textMessageRecipients) {
        this.textMessageRecipients = textMessageRecipients;
        return this;
    }

    public UpdateDownloadShareRequest addTextMessageRecipientsItem(String textMessageRecipientsItem) {
        if(this.textMessageRecipients == null) {
            this.textMessageRecipients = new ArrayList<>();
        }
        this.textMessageRecipients.add(textMessageRecipientsItem);
        return this;
    }

    /**
     * List of recipient FQTNs E.123 / E.164 Format
     *
     * @return textMessageRecipients
     **/
    @ApiModelProperty(value = "List of recipient FQTNs E.123 / E.164 Format")
    public List<String> getTextMessageRecipients() {
        return textMessageRecipients;
    }

    public void setTextMessageRecipients(List<String> textMessageRecipients) {
        this.textMessageRecipients = textMessageRecipients;
    }

    public UpdateDownloadShareRequest receiverLanguage(String receiverLanguage) {
        this.receiverLanguage = receiverLanguage;
        return this;
    }

    /**
     * Language tag for messages to receiver
     *
     * @return receiverLanguage
     **/
    @ApiModelProperty(example = "de-DE", value = "Language tag for messages to receiver")
    public String getReceiverLanguage() {
        return receiverLanguage;
    }

    public void setReceiverLanguage(String receiverLanguage) {
        this.receiverLanguage = receiverLanguage;
    }

    public UpdateDownloadShareRequest defaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
        return this;
    }

    /**
     * Country shorthand symbol (cf. ISO 3166-2)
     *
     * @return defaultCountry
     **/
    @ApiModelProperty(value = "Country shorthand symbol (cf. ISO 3166-2)")
    public String getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    public UpdateDownloadShareRequest resetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
        return this;
    }

    /**
     * Set &#39;true&#39; to reset &#39;password&#39; for Download Share.
     *
     * @return resetPassword
     **/
    @ApiModelProperty(value = "Set 'true' to reset 'password' for Download Share.")
    public Boolean isResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
    }

    public UpdateDownloadShareRequest resetMaxDownloads(Boolean resetMaxDownloads) {
        this.resetMaxDownloads = resetMaxDownloads;
        return this;
    }

    /**
     * Set &#39;true&#39; to reset &#39;maxDownloads&#39; for Download Share.
     *
     * @return resetMaxDownloads
     **/
    @ApiModelProperty(value = "Set 'true' to reset 'maxDownloads' for Download Share.")
    public Boolean isResetMaxDownloads() {
        return resetMaxDownloads;
    }

    public void setResetMaxDownloads(Boolean resetMaxDownloads) {
        this.resetMaxDownloads = resetMaxDownloads;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDownloadShareRequest updateDownloadShareRequest = (UpdateDownloadShareRequest) o;
        return Objects.equals(this.name, updateDownloadShareRequest.name) &&
            Objects.equals(this.password, updateDownloadShareRequest.password) &&
            Objects.equals(this.expiration, updateDownloadShareRequest.expiration) &&
            Objects.equals(this.notes, updateDownloadShareRequest.notes) &&
            Objects.equals(this.internalNotes, updateDownloadShareRequest.internalNotes) &&
            Objects.equals(this.showCreatorName, updateDownloadShareRequest.showCreatorName) &&
            Objects.equals(this.showCreatorUsername, updateDownloadShareRequest.showCreatorUsername) &&
            Objects.equals(this.notifyCreator, updateDownloadShareRequest.notifyCreator) &&
            Objects.equals(this.maxDownloads, updateDownloadShareRequest.maxDownloads) &&
            Objects.equals(this.textMessageRecipients, updateDownloadShareRequest.textMessageRecipients) &&
            Objects.equals(this.receiverLanguage, updateDownloadShareRequest.receiverLanguage) &&
            Objects.equals(this.defaultCountry, updateDownloadShareRequest.defaultCountry) &&
            Objects.equals(this.resetPassword, updateDownloadShareRequest.resetPassword) &&
            Objects.equals(this.resetMaxDownloads, updateDownloadShareRequest.resetMaxDownloads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, expiration, notes, internalNotes, showCreatorName, showCreatorUsername, notifyCreator, maxDownloads, textMessageRecipients, receiverLanguage, defaultCountry, resetPassword, resetMaxDownloads);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDownloadShareRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    internalNotes: ").append(toIndentedString(internalNotes)).append("\n");
        sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
        sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
        sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
        sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
        sb.append("    textMessageRecipients: ").append(toIndentedString(textMessageRecipients)).append("\n");
        sb.append("    receiverLanguage: ").append(toIndentedString(receiverLanguage)).append("\n");
        sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
        sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
        sb.append("    resetMaxDownloads: ").append(toIndentedString(resetMaxDownloads)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if(o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

