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

/*
 * Copyright (c) 2002-2019 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import org.joda.time.DateTime;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A resource item.
 */
@ApiModel(description = "A resource item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T17:29:58.296+02:00")
public class File {
  @JsonProperty("versions")
  private Integer versions = null;

  @JsonProperty("flags")
  private Integer flags = null;

  /**
   * Included if the item supports permission
   */
  public enum PermissionEnum {
    NUMBER_0(0),

    NUMBER_1(1),

    NUMBER_2(2),

    NUMBER_4(4),

    NUMBER_99(99),

    NUMBER_MINUS_1(-1);

    private Integer value;

    PermissionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("permission")
  private PermissionEnum permission = null;

  @JsonProperty("md5")
  private String md5 = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("modified")
  private DateTime modified = null;

  @JsonProperty("uploaded")
  private DateTime uploaded = null;

    /**
     * Indicates the item type.
     */
    public enum FlagsEnum {
        None(0),

        Folder(1),

        Shared(2),

        Locked(4),

        Image(8),

        Streamable(16),

        Video(32),

        Doc(64),

        StreamableDoc(128);

        private Integer value;

        FlagsEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FlagsEnum fromValue(String text) {
            for(FlagsEnum b : FlagsEnum.values()) {
                if(String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

  @JsonProperty("ownerId")
  private String ownerId = null;

  public File versions(Integer versions) {
    this.versions = versions;
    return this;
  }

   /**
   * Indicated how many versions exists of this item.
   * @return versions
  **/
  @ApiModelProperty(value = "Indicated how many versions exists of this item.")
  public Integer getVersions() {
    return versions;
  }

  public void setVersions(Integer versions) {
    this.versions = versions;
  }

  public File permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Included if the item supports permission
   * @return permission
  **/
  @ApiModelProperty(value = "Included if the item supports permission")
  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public File md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   *
   * @return md5
  **/
  @ApiModelProperty(value = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public File path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path to the item
   * @return path
  **/
  @ApiModelProperty(value = "The path to the item")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public File id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The item id.
   * @return id
  **/
  @ApiModelProperty(value = "The item id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public File name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item name.
   * @return name
  **/
  @ApiModelProperty(value = "The item name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public File size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The item size.
   * @return size
  **/
  @ApiModelProperty(value = "The item size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public File created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the item was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public File modified(DateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public DateTime getModified() {
    return modified;
  }

  public void setModified(DateTime modified) {
    this.modified = modified;
  }

  public File uploaded(DateTime uploaded) {
    this.uploaded = uploaded;
    return this;
  }

   /**
   * The date and time the item was uploaded.
   * @return uploaded
  **/
  @ApiModelProperty(value = "The date and time the item was uploaded.")
  public DateTime getUploaded() {
    return uploaded;
  }

  public void setUploaded(DateTime uploaded) {
    this.uploaded = uploaded;
  }

  public File flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Indicates the item type.
   * @return flags
  **/
  @ApiModelProperty(value = "Indicates the item type.")
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  public File ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The owner.
   * @return ownerId
  **/
  @ApiModelProperty(value = "The owner.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    File resource = (File) o;
    return Objects.equals(this.versions, resource.versions) &&
        Objects.equals(this.permission, resource.permission) &&
        Objects.equals(this.md5, resource.md5) &&
        Objects.equals(this.path, resource.path) &&
        Objects.equals(this.id, resource.id) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.size, resource.size) &&
        Objects.equals(this.created, resource.created) &&
        Objects.equals(this.modified, resource.modified) &&
        Objects.equals(this.uploaded, resource.uploaded) &&
        Objects.equals(this.flags, resource.flags) &&
        Objects.equals(this.ownerId, resource.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, permission, md5, path, id, name, size, created, modified, uploaded, flags, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");

    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

}

