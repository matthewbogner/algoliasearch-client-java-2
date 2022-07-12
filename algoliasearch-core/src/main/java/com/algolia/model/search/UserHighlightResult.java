// This file is generated, manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** UserHighlightResult */
public class UserHighlightResult {

  @JsonProperty("userID")
  private Map<String, HighlightResult> userID = new HashMap<>();

  @JsonProperty("clusterName")
  private Map<String, HighlightResult> clusterName = new HashMap<>();

  public UserHighlightResult setUserID(Map<String, HighlightResult> userID) {
    this.userID = userID;
    return this;
  }

  public UserHighlightResult putUserID(String key, HighlightResult userIDItem) {
    this.userID.put(key, userIDItem);
    return this;
  }

  /**
   * Show highlighted section and words matched on a query.
   *
   * @return userID
   */
  @javax.annotation.Nonnull
  public Map<String, HighlightResult> getUserID() {
    return userID;
  }

  public UserHighlightResult setClusterName(Map<String, HighlightResult> clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public UserHighlightResult putClusterName(String key, HighlightResult clusterNameItem) {
    this.clusterName.put(key, clusterNameItem);
    return this;
  }

  /**
   * Show highlighted section and words matched on a query.
   *
   * @return clusterName
   */
  @javax.annotation.Nonnull
  public Map<String, HighlightResult> getClusterName() {
    return clusterName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserHighlightResult userHighlightResult = (UserHighlightResult) o;
    return Objects.equals(this.userID, userHighlightResult.userID) && Objects.equals(this.clusterName, userHighlightResult.clusterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, clusterName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserHighlightResult {\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
