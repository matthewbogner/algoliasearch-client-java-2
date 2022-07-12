// This file is generated, manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import java.util.Objects;

/** The response with a taskID, an objectID and an updatedAt timestamp. */
public class UpdatedAtWithObjectIdResponse {

  @JsonProperty("taskID")
  private Long taskID;

  @JsonProperty("updatedAt")
  private String updatedAt;

  @JsonProperty("objectID")
  private String objectID;

  public UpdatedAtWithObjectIdResponse setTaskID(Long taskID) {
    this.taskID = taskID;
    return this;
  }

  /**
   * taskID of the task to wait for.
   *
   * @return taskID
   */
  @javax.annotation.Nullable
  public Long getTaskID() {
    return taskID;
  }

  public UpdatedAtWithObjectIdResponse setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date of last update (ISO-8601 format).
   *
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public UpdatedAtWithObjectIdResponse setObjectID(String objectID) {
    this.objectID = objectID;
    return this;
  }

  /**
   * Unique identifier of the object.
   *
   * @return objectID
   */
  @javax.annotation.Nullable
  public String getObjectID() {
    return objectID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedAtWithObjectIdResponse updatedAtWithObjectIdResponse = (UpdatedAtWithObjectIdResponse) o;
    return (
      Objects.equals(this.taskID, updatedAtWithObjectIdResponse.taskID) &&
      Objects.equals(this.updatedAt, updatedAtWithObjectIdResponse.updatedAt) &&
      Objects.equals(this.objectID, updatedAtWithObjectIdResponse.objectID)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskID, updatedAt, objectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedAtWithObjectIdResponse {\n");
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    objectID: ").append(toIndentedString(objectID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
