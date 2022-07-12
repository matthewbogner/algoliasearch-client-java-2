// This file is generated, manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation.

package com.algolia.model.analytics;

import com.fasterxml.jackson.annotation.*;
import java.util.Objects;

/** TopSearchWithAnalytics */
public class TopSearchWithAnalytics {

  @JsonProperty("search")
  private String search;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("clickThroughRate")
  private Double clickThroughRate;

  @JsonProperty("averageClickPosition")
  private Integer averageClickPosition;

  @JsonProperty("conversionRate")
  private Double conversionRate;

  @JsonProperty("trackedSearchCount")
  private Integer trackedSearchCount;

  @JsonProperty("clickCount")
  private Integer clickCount;

  @JsonProperty("conversionCount")
  private Integer conversionCount;

  @JsonProperty("nbHits")
  private Integer nbHits;

  public TopSearchWithAnalytics setSearch(String search) {
    this.search = search;
    return this;
  }

  /**
   * The search query.
   *
   * @return search
   */
  @javax.annotation.Nonnull
  public String getSearch() {
    return search;
  }

  public TopSearchWithAnalytics setCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of occurrences.
   *
   * @return count
   */
  @javax.annotation.Nonnull
  public Integer getCount() {
    return count;
  }

  public TopSearchWithAnalytics setClickThroughRate(Double clickThroughRate) {
    this.clickThroughRate = clickThroughRate;
    return this;
  }

  /**
   * The click-through rate.
   *
   * @return clickThroughRate
   */
  @javax.annotation.Nonnull
  public Double getClickThroughRate() {
    return clickThroughRate;
  }

  public TopSearchWithAnalytics setAverageClickPosition(Integer averageClickPosition) {
    this.averageClickPosition = averageClickPosition;
    return this;
  }

  /**
   * The average position of all the click count event.
   *
   * @return averageClickPosition
   */
  @javax.annotation.Nonnull
  public Integer getAverageClickPosition() {
    return averageClickPosition;
  }

  public TopSearchWithAnalytics setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

  /**
   * The conversion rate.
   *
   * @return conversionRate
   */
  @javax.annotation.Nonnull
  public Double getConversionRate() {
    return conversionRate;
  }

  public TopSearchWithAnalytics setTrackedSearchCount(Integer trackedSearchCount) {
    this.trackedSearchCount = trackedSearchCount;
    return this;
  }

  /**
   * The number of tracked search click.
   *
   * @return trackedSearchCount
   */
  @javax.annotation.Nonnull
  public Integer getTrackedSearchCount() {
    return trackedSearchCount;
  }

  public TopSearchWithAnalytics setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  /**
   * The number of click event.
   *
   * @return clickCount
   */
  @javax.annotation.Nonnull
  public Integer getClickCount() {
    return clickCount;
  }

  public TopSearchWithAnalytics setConversionCount(Integer conversionCount) {
    this.conversionCount = conversionCount;
    return this;
  }

  /**
   * The number of converted clicks.
   *
   * @return conversionCount
   */
  @javax.annotation.Nonnull
  public Integer getConversionCount() {
    return conversionCount;
  }

  public TopSearchWithAnalytics setNbHits(Integer nbHits) {
    this.nbHits = nbHits;
    return this;
  }

  /**
   * Number of hits that the search query matched.
   *
   * @return nbHits
   */
  @javax.annotation.Nonnull
  public Integer getNbHits() {
    return nbHits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopSearchWithAnalytics topSearchWithAnalytics = (TopSearchWithAnalytics) o;
    return (
      Objects.equals(this.search, topSearchWithAnalytics.search) &&
      Objects.equals(this.count, topSearchWithAnalytics.count) &&
      Objects.equals(this.clickThroughRate, topSearchWithAnalytics.clickThroughRate) &&
      Objects.equals(this.averageClickPosition, topSearchWithAnalytics.averageClickPosition) &&
      Objects.equals(this.conversionRate, topSearchWithAnalytics.conversionRate) &&
      Objects.equals(this.trackedSearchCount, topSearchWithAnalytics.trackedSearchCount) &&
      Objects.equals(this.clickCount, topSearchWithAnalytics.clickCount) &&
      Objects.equals(this.conversionCount, topSearchWithAnalytics.conversionCount) &&
      Objects.equals(this.nbHits, topSearchWithAnalytics.nbHits)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      search,
      count,
      clickThroughRate,
      averageClickPosition,
      conversionRate,
      trackedSearchCount,
      clickCount,
      conversionCount,
      nbHits
    );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopSearchWithAnalytics {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    clickThroughRate: ").append(toIndentedString(clickThroughRate)).append("\n");
    sb.append("    averageClickPosition: ").append(toIndentedString(averageClickPosition)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    trackedSearchCount: ").append(toIndentedString(trackedSearchCount)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    conversionCount: ").append(toIndentedString(conversionCount)).append("\n");
    sb.append("    nbHits: ").append(toIndentedString(nbHits)).append("\n");
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
