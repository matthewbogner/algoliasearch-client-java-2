package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import java.util.Objects;

/** DeleteSourceResponse */
public class DeleteSourceResponse {

  @JsonProperty("deletedAt")
  private String deletedAt;

  public DeleteSourceResponse setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * Date of deletion (ISO-8601 format).
   *
   * @return deletedAt
   */
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
    DeleteSourceResponse deleteSourceResponse = (DeleteSourceResponse) o;
    return Objects.equals(this.deletedAt, deleteSourceResponse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSourceResponse {\n");
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
