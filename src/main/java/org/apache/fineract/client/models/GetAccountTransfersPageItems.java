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
import java.util.Date;
import org.apache.fineract.client.models.GetAccountTransfersFromAccountType;
import org.apache.fineract.client.models.GetAccountTransfersFromClientOptions;
import org.apache.fineract.client.models.GetAccountTransfersPageItemsCurrency;
import org.apache.fineract.client.models.GetAccountTransfersPageItemsFromAccount;
import org.apache.fineract.client.models.GetAccountTransfersPageItemsFromOffice;
import org.apache.fineract.client.models.GetAccountTransfersPageItemsToAccountType;

/**
 * GetAccountTransfersPageItems
 */

public class GetAccountTransfersPageItems {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REVERSED = "reversed";
  @SerializedName(SERIALIZED_NAME_REVERSED)
  private Boolean reversed;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetAccountTransfersPageItemsCurrency currency;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transferAmount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Float transferAmount;

  public static final String SERIALIZED_NAME_TRANSFER_DATE = "transferDate";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DATE)
  private Date transferDate;

  public static final String SERIALIZED_NAME_TRANSFER_DESCRIPTION = "transferDescription";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DESCRIPTION)
  private String transferDescription;

  public static final String SERIALIZED_NAME_FROM_OFFICE = "fromOffice";
  @SerializedName(SERIALIZED_NAME_FROM_OFFICE)
  private GetAccountTransfersPageItemsFromOffice fromOffice;

  public static final String SERIALIZED_NAME_FROM_CLIENT = "fromClient";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT)
  private GetAccountTransfersFromClientOptions fromClient;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT_TYPE = "fromAccountType";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_TYPE)
  private GetAccountTransfersFromAccountType fromAccountType;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "fromAccount";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private GetAccountTransfersPageItemsFromAccount fromAccount;

  public static final String SERIALIZED_NAME_TO_OFFICE = "toOffice";
  @SerializedName(SERIALIZED_NAME_TO_OFFICE)
  private GetAccountTransfersPageItemsFromOffice toOffice;

  public static final String SERIALIZED_NAME_TO_CLIENT = "toClient";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT)
  private GetAccountTransfersFromClientOptions toClient;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_TYPE = "toAccountType";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_TYPE)
  private GetAccountTransfersPageItemsToAccountType toAccountType;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "toAccount";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private GetAccountTransfersPageItemsFromAccount toAccount;


  public GetAccountTransfersPageItems id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetAccountTransfersPageItems reversed(Boolean reversed) {
    
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getReversed() {
    return reversed;
  }


  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }


  public GetAccountTransfersPageItems currency(GetAccountTransfersPageItemsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetAccountTransfersPageItemsCurrency currency) {
    this.currency = currency;
  }


  public GetAccountTransfersPageItems transferAmount(Float transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "")

  public Float getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
  }


  public GetAccountTransfersPageItems transferDate(Date transferDate) {
    
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Get transferDate
   * @return transferDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getTransferDate() {
    return transferDate;
  }


  public void setTransferDate(Date transferDate) {
    this.transferDate = transferDate;
  }


  public GetAccountTransfersPageItems transferDescription(String transferDescription) {
    
    this.transferDescription = transferDescription;
    return this;
  }

   /**
   * Get transferDescription
   * @return transferDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pay off loan from savings.", value = "")

  public String getTransferDescription() {
    return transferDescription;
  }


  public void setTransferDescription(String transferDescription) {
    this.transferDescription = transferDescription;
  }


  public GetAccountTransfersPageItems fromOffice(GetAccountTransfersPageItemsFromOffice fromOffice) {
    
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsFromOffice getFromOffice() {
    return fromOffice;
  }


  public void setFromOffice(GetAccountTransfersPageItemsFromOffice fromOffice) {
    this.fromOffice = fromOffice;
  }


  public GetAccountTransfersPageItems fromClient(GetAccountTransfersFromClientOptions fromClient) {
    
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersFromClientOptions getFromClient() {
    return fromClient;
  }


  public void setFromClient(GetAccountTransfersFromClientOptions fromClient) {
    this.fromClient = fromClient;
  }


  public GetAccountTransfersPageItems fromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersFromAccountType getFromAccountType() {
    return fromAccountType;
  }


  public void setFromAccountType(GetAccountTransfersFromAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public GetAccountTransfersPageItems fromAccount(GetAccountTransfersPageItemsFromAccount fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsFromAccount getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(GetAccountTransfersPageItemsFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetAccountTransfersPageItems toOffice(GetAccountTransfersPageItemsFromOffice toOffice) {
    
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsFromOffice getToOffice() {
    return toOffice;
  }


  public void setToOffice(GetAccountTransfersPageItemsFromOffice toOffice) {
    this.toOffice = toOffice;
  }


  public GetAccountTransfersPageItems toClient(GetAccountTransfersFromClientOptions toClient) {
    
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersFromClientOptions getToClient() {
    return toClient;
  }


  public void setToClient(GetAccountTransfersFromClientOptions toClient) {
    this.toClient = toClient;
  }


  public GetAccountTransfersPageItems toAccountType(GetAccountTransfersPageItemsToAccountType toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsToAccountType getToAccountType() {
    return toAccountType;
  }


  public void setToAccountType(GetAccountTransfersPageItemsToAccountType toAccountType) {
    this.toAccountType = toAccountType;
  }


  public GetAccountTransfersPageItems toAccount(GetAccountTransfersPageItemsFromAccount toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountTransfersPageItemsFromAccount getToAccount() {
    return toAccount;
  }


  public void setToAccount(GetAccountTransfersPageItemsFromAccount toAccount) {
    this.toAccount = toAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersPageItems getAccountTransfersPageItems = (GetAccountTransfersPageItems) o;
    return Objects.equals(this.id, getAccountTransfersPageItems.id) &&
        Objects.equals(this.reversed, getAccountTransfersPageItems.reversed) &&
        Objects.equals(this.currency, getAccountTransfersPageItems.currency) &&
        Objects.equals(this.transferAmount, getAccountTransfersPageItems.transferAmount) &&
        Objects.equals(this.transferDate, getAccountTransfersPageItems.transferDate) &&
        Objects.equals(this.transferDescription, getAccountTransfersPageItems.transferDescription) &&
        Objects.equals(this.fromOffice, getAccountTransfersPageItems.fromOffice) &&
        Objects.equals(this.fromClient, getAccountTransfersPageItems.fromClient) &&
        Objects.equals(this.fromAccountType, getAccountTransfersPageItems.fromAccountType) &&
        Objects.equals(this.fromAccount, getAccountTransfersPageItems.fromAccount) &&
        Objects.equals(this.toOffice, getAccountTransfersPageItems.toOffice) &&
        Objects.equals(this.toClient, getAccountTransfersPageItems.toClient) &&
        Objects.equals(this.toAccountType, getAccountTransfersPageItems.toAccountType) &&
        Objects.equals(this.toAccount, getAccountTransfersPageItems.toAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reversed, currency, transferAmount, transferDate, transferDescription, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersPageItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    transferDescription: ").append(toIndentedString(transferDescription)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
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
