/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetRolesRoleIdPermissionsResponsePermissionData
 */

public class GetRolesRoleIdPermissionsResponsePermissionData {
  public static final String SERIALIZED_NAME_GROUPING = "grouping";
  @SerializedName(SERIALIZED_NAME_GROUPING)
  private String grouping;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entityName";
  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;


  public GetRolesRoleIdPermissionsResponsePermissionData grouping(String grouping) {
    
    this.grouping = grouping;
    return this;
  }

   /**
   * Get grouping
   * @return grouping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorisation", value = "")

  public String getGrouping() {
    return grouping;
  }


  public void setGrouping(String grouping) {
    this.grouping = grouping;
  }


  public GetRolesRoleIdPermissionsResponsePermissionData code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READ_PERMISSION", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetRolesRoleIdPermissionsResponsePermissionData entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERMISSION", value = "")

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public GetRolesRoleIdPermissionsResponsePermissionData actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "READ", value = "")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public GetRolesRoleIdPermissionsResponsePermissionData selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getSelected() {
    return selected;
  }


  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRolesRoleIdPermissionsResponsePermissionData getRolesRoleIdPermissionsResponsePermissionData = (GetRolesRoleIdPermissionsResponsePermissionData) o;
    return Objects.equals(this.grouping, getRolesRoleIdPermissionsResponsePermissionData.grouping) &&
        Objects.equals(this.code, getRolesRoleIdPermissionsResponsePermissionData.code) &&
        Objects.equals(this.entityName, getRolesRoleIdPermissionsResponsePermissionData.entityName) &&
        Objects.equals(this.actionName, getRolesRoleIdPermissionsResponsePermissionData.actionName) &&
        Objects.equals(this.selected, getRolesRoleIdPermissionsResponsePermissionData.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouping, code, entityName, actionName, selected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRolesRoleIdPermissionsResponsePermissionData {\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
