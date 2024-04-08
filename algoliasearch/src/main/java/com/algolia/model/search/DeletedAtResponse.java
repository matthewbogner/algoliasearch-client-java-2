// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.Objects;

/** Response, taskID, and deletion timestamp. */
public class DeletedAtResponse {

  @JsonProperty("taskID")
  private Long taskID;

  @JsonProperty("deletedAt")
  private String deletedAt;

  public DeletedAtResponse setTaskID(Long taskID) {
    this.taskID = taskID;
    return this;
  }

  /**
   * Unique identifier of a task. A successful API response means that a task was added to a queue.
   * It might not run immediately. You can check the task's progress with the [`task`
   * operation](#tag/Indices/operation/getTask) and this `taskID`.
   */
  @javax.annotation.Nonnull
  public Long getTaskID() {
    return taskID;
  }

  public DeletedAtResponse setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /** Date and time when the object was deleted, in RFC 3339 format. */
  @javax.annotation.Nonnull
  public String getDeletedAt() {
    return deletedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedAtResponse deletedAtResponse = (DeletedAtResponse) o;
    return Objects.equals(this.taskID, deletedAtResponse.taskID) && Objects.equals(this.deletedAt, deletedAtResponse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskID, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedAtResponse {\n");
    sb.append("    taskID: ").append(toIndentedString(taskID)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
