package com.algolia.model.recommend;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets alternativesAsExact */
public enum AlternativesAsExact {
  IGNORE_PLURALS("ignorePlurals"),

  SINGLE_WORD_SYNONYM("singleWordSynonym"),

  MULTI_WORDS_SYNONYM("multiWordsSynonym");

  private final String value;

  AlternativesAsExact(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AlternativesAsExact fromValue(String value) {
    for (AlternativesAsExact b : AlternativesAsExact.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
