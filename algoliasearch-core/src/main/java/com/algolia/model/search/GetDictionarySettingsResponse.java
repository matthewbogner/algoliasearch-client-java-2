package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import java.util.Objects;

/** GetDictionarySettingsResponse */
public class GetDictionarySettingsResponse {

  @JsonProperty("disableStandardEntries")
  private StandardEntries disableStandardEntries;

  public GetDictionarySettingsResponse setDisableStandardEntries(StandardEntries disableStandardEntries) {
    this.disableStandardEntries = disableStandardEntries;
    return this;
  }

  /**
   * Get disableStandardEntries
   *
   * @return disableStandardEntries
   */
  @javax.annotation.Nonnull
  public StandardEntries getDisableStandardEntries() {
    return disableStandardEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDictionarySettingsResponse getDictionarySettingsResponse = (GetDictionarySettingsResponse) o;
    return Objects.equals(this.disableStandardEntries, getDictionarySettingsResponse.disableStandardEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableStandardEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDictionarySettingsResponse {\n");
    sb.append("    disableStandardEntries: ").append(toIndentedString(disableStandardEntries)).append("\n");
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
