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

/**
 * GetJobsResponse
 */
@ApiModel(description = "GetJobsResponse")

public class GetJobsResponse {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private Long jobId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_NEXT_RUN_TIME = "nextRunTime";
  @SerializedName(SERIALIZED_NAME_NEXT_RUN_TIME)
  private Date nextRunTime;

  public static final String SERIALIZED_NAME_INITIALIZING_ERROR = "initializingError";
  @SerializedName(SERIALIZED_NAME_INITIALIZING_ERROR)
  private String initializingError;

  public static final String SERIALIZED_NAME_CRON_EXPRESSION = "cronExpression";
  @SerializedName(SERIALIZED_NAME_CRON_EXPRESSION)
  private String cronExpression;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CURRENTLY_RUNNING = "currentlyRunning";
  @SerializedName(SERIALIZED_NAME_CURRENTLY_RUNNING)
  private Boolean currentlyRunning;

  public static final String SERIALIZED_NAME_LAST_RUN_HISTORY = "lastRunHistory";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_HISTORY)
  private Object lastRunHistory;


  public GetJobsResponse jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getJobId() {
    return jobId;
  }


  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  public GetJobsResponse displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Update loan Summary", value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GetJobsResponse nextRunTime(Date nextRunTime) {
    
    this.nextRunTime = nextRunTime;
    return this;
  }

   /**
   * Get nextRunTime
   * @return nextRunTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getNextRunTime() {
    return nextRunTime;
  }


  public void setNextRunTime(Date nextRunTime) {
    this.nextRunTime = nextRunTime;
  }


  public GetJobsResponse initializingError(String initializingError) {
    
    this.initializingError = initializingError;
    return this;
  }

   /**
   * Get initializingError
   * @return initializingError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInitializingError() {
    return initializingError;
  }


  public void setInitializingError(String initializingError) {
    this.initializingError = initializingError;
  }


  public GetJobsResponse cronExpression(String cronExpression) {
    
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0 0 22 1/1 * ? *", value = "")

  public String getCronExpression() {
    return cronExpression;
  }


  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  public GetJobsResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetJobsResponse currentlyRunning(Boolean currentlyRunning) {
    
    this.currentlyRunning = currentlyRunning;
    return this;
  }

   /**
   * Get currentlyRunning
   * @return currentlyRunning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getCurrentlyRunning() {
    return currentlyRunning;
  }


  public void setCurrentlyRunning(Boolean currentlyRunning) {
    this.currentlyRunning = currentlyRunning;
  }


  public GetJobsResponse lastRunHistory(Object lastRunHistory) {
    
    this.lastRunHistory = lastRunHistory;
    return this;
  }

   /**
   * Get lastRunHistory
   * @return lastRunHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLastRunHistory() {
    return lastRunHistory;
  }


  public void setLastRunHistory(Object lastRunHistory) {
    this.lastRunHistory = lastRunHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJobsResponse getJobsResponse = (GetJobsResponse) o;
    return Objects.equals(this.jobId, getJobsResponse.jobId) &&
        Objects.equals(this.displayName, getJobsResponse.displayName) &&
        Objects.equals(this.nextRunTime, getJobsResponse.nextRunTime) &&
        Objects.equals(this.initializingError, getJobsResponse.initializingError) &&
        Objects.equals(this.cronExpression, getJobsResponse.cronExpression) &&
        Objects.equals(this.active, getJobsResponse.active) &&
        Objects.equals(this.currentlyRunning, getJobsResponse.currentlyRunning) &&
        Objects.equals(this.lastRunHistory, getJobsResponse.lastRunHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, displayName, nextRunTime, initializingError, cronExpression, active, currentlyRunning, lastRunHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJobsResponse {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    nextRunTime: ").append(toIndentedString(nextRunTime)).append("\n");
    sb.append("    initializingError: ").append(toIndentedString(initializingError)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    currentlyRunning: ").append(toIndentedString(currentlyRunning)).append("\n");
    sb.append("    lastRunHistory: ").append(toIndentedString(lastRunHistory)).append("\n");
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
