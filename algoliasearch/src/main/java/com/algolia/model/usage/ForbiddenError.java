// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost
// - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

package com.algolia.model.usage;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ForbiddenError */
public class ForbiddenError {

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("errors")
  private List<ErrorItem> errors;

  public ForbiddenError setCode(String code) {
    this.code = code;
    return this;
  }

  /** Get code */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public ForbiddenError setMessage(String message) {
    this.message = message;
    return this;
  }

  /** Get message */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public ForbiddenError setErrors(List<ErrorItem> errors) {
    this.errors = errors;
    return this;
  }

  public ForbiddenError addErrors(ErrorItem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /** Get errors */
  @javax.annotation.Nullable
  public List<ErrorItem> getErrors() {
    return errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForbiddenError forbiddenError = (ForbiddenError) o;
    return (
      Objects.equals(this.code, forbiddenError.code) &&
      Objects.equals(this.message, forbiddenError.message) &&
      Objects.equals(this.errors, forbiddenError.errors)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbiddenError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
