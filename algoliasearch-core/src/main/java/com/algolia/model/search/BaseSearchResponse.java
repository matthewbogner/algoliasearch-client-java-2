// This file is generated, manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation.

package com.algolia.model.search;

import com.fasterxml.jackson.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** BaseSearchResponse */
public class BaseSearchResponse {

  @JsonProperty("abTestID")
  private Integer abTestID;

  @JsonProperty("abTestVariantID")
  private Integer abTestVariantID;

  @JsonProperty("aroundLatLng")
  private String aroundLatLng;

  @JsonProperty("automaticRadius")
  private String automaticRadius;

  @JsonProperty("exhaustiveFacetsCount")
  private Boolean exhaustiveFacetsCount;

  @JsonProperty("exhaustiveNbHits")
  private Boolean exhaustiveNbHits;

  @JsonProperty("exhaustiveTypo")
  private Boolean exhaustiveTypo;

  @JsonProperty("facets")
  private Map<String, Map<String, String>> facets;

  @JsonProperty("facets_stats")
  private Map<String, FacetsStats> facetsStats;

  @JsonProperty("hitsPerPage")
  private Integer hitsPerPage;

  @JsonProperty("index")
  private String index;

  @JsonProperty("indexUsed")
  private String indexUsed;

  @JsonProperty("message")
  private String message;

  @JsonProperty("nbHits")
  private Integer nbHits;

  @JsonProperty("nbPages")
  private Integer nbPages;

  @JsonProperty("nbSortedHits")
  private Integer nbSortedHits;

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("params")
  private String params;

  @JsonProperty("parsedQuery")
  private String parsedQuery;

  @JsonProperty("processingTimeMS")
  private Integer processingTimeMS;

  @JsonProperty("query")
  private String query;

  @JsonProperty("queryAfterRemoval")
  private String queryAfterRemoval;

  @JsonProperty("serverUsed")
  private String serverUsed;

  @JsonProperty("userData")
  private Object userData;

  @JsonProperty("renderingContent")
  private RenderingContent renderingContent;

  public BaseSearchResponse setAbTestID(Integer abTestID) {
    this.abTestID = abTestID;
    return this;
  }

  /**
   * If a search encounters an index that is being A/B tested, abTestID reports the ongoing A/B test
   * ID.
   *
   * @return abTestID
   */
  @javax.annotation.Nullable
  public Integer getAbTestID() {
    return abTestID;
  }

  public BaseSearchResponse setAbTestVariantID(Integer abTestVariantID) {
    this.abTestVariantID = abTestVariantID;
    return this;
  }

  /**
   * If a search encounters an index that is being A/B tested, abTestVariantID reports the variant
   * ID of the index used.
   *
   * @return abTestVariantID
   */
  @javax.annotation.Nullable
  public Integer getAbTestVariantID() {
    return abTestVariantID;
  }

  public BaseSearchResponse setAroundLatLng(String aroundLatLng) {
    this.aroundLatLng = aroundLatLng;
    return this;
  }

  /**
   * The computed geo location.
   *
   * @return aroundLatLng
   */
  @javax.annotation.Nullable
  public String getAroundLatLng() {
    return aroundLatLng;
  }

  public BaseSearchResponse setAutomaticRadius(String automaticRadius) {
    this.automaticRadius = automaticRadius;
    return this;
  }

  /**
   * The automatically computed radius. For legacy reasons, this parameter is a string and not an
   * integer.
   *
   * @return automaticRadius
   */
  @javax.annotation.Nullable
  public String getAutomaticRadius() {
    return automaticRadius;
  }

  public BaseSearchResponse setExhaustiveFacetsCount(Boolean exhaustiveFacetsCount) {
    this.exhaustiveFacetsCount = exhaustiveFacetsCount;
    return this;
  }

  /**
   * Whether the facet count is exhaustive or approximate.
   *
   * @return exhaustiveFacetsCount
   */
  @javax.annotation.Nullable
  public Boolean getExhaustiveFacetsCount() {
    return exhaustiveFacetsCount;
  }

  public BaseSearchResponse setExhaustiveNbHits(Boolean exhaustiveNbHits) {
    this.exhaustiveNbHits = exhaustiveNbHits;
    return this;
  }

  /**
   * Indicate if the nbHits count was exhaustive or approximate.
   *
   * @return exhaustiveNbHits
   */
  @javax.annotation.Nonnull
  public Boolean getExhaustiveNbHits() {
    return exhaustiveNbHits;
  }

  public BaseSearchResponse setExhaustiveTypo(Boolean exhaustiveTypo) {
    this.exhaustiveTypo = exhaustiveTypo;
    return this;
  }

  /**
   * Indicate if the typo-tolerance search was exhaustive or approximate (only included when
   * typo-tolerance is enabled).
   *
   * @return exhaustiveTypo
   */
  @javax.annotation.Nonnull
  public Boolean getExhaustiveTypo() {
    return exhaustiveTypo;
  }

  public BaseSearchResponse setFacets(Map<String, Map<String, String>> facets) {
    this.facets = facets;
    return this;
  }

  public BaseSearchResponse putFacets(String key, Map<String, String> facetsItem) {
    if (this.facets == null) {
      this.facets = new HashMap<>();
    }
    this.facets.put(key, facetsItem);
    return this;
  }

  /**
   * A mapping of each facet name to the corresponding facet counts.
   *
   * @return facets
   */
  @javax.annotation.Nullable
  public Map<String, Map<String, String>> getFacets() {
    return facets;
  }

  public BaseSearchResponse setFacetsStats(Map<String, FacetsStats> facetsStats) {
    this.facetsStats = facetsStats;
    return this;
  }

  public BaseSearchResponse putFacetsStats(String key, FacetsStats facetsStatsItem) {
    if (this.facetsStats == null) {
      this.facetsStats = new HashMap<>();
    }
    this.facetsStats.put(key, facetsStatsItem);
    return this;
  }

  /**
   * Statistics for numerical facets.
   *
   * @return facetsStats
   */
  @javax.annotation.Nullable
  public Map<String, FacetsStats> getFacetsStats() {
    return facetsStats;
  }

  public BaseSearchResponse setHitsPerPage(Integer hitsPerPage) {
    this.hitsPerPage = hitsPerPage;
    return this;
  }

  /**
   * Set the number of hits per page.
   *
   * @return hitsPerPage
   */
  @javax.annotation.Nonnull
  public Integer getHitsPerPage() {
    return hitsPerPage;
  }

  public BaseSearchResponse setIndex(String index) {
    this.index = index;
    return this;
  }

  /**
   * Index name used for the query.
   *
   * @return index
   */
  @javax.annotation.Nullable
  public String getIndex() {
    return index;
  }

  public BaseSearchResponse setIndexUsed(String indexUsed) {
    this.indexUsed = indexUsed;
    return this;
  }

  /**
   * Index name used for the query. In the case of an A/B test, the targeted index isn't always the
   * index used by the query.
   *
   * @return indexUsed
   */
  @javax.annotation.Nullable
  public String getIndexUsed() {
    return indexUsed;
  }

  public BaseSearchResponse setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * Used to return warnings about the query.
   *
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public BaseSearchResponse setNbHits(Integer nbHits) {
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

  public BaseSearchResponse setNbPages(Integer nbPages) {
    this.nbPages = nbPages;
    return this;
  }

  /**
   * Number of pages available for the current query.
   *
   * @return nbPages
   */
  @javax.annotation.Nonnull
  public Integer getNbPages() {
    return nbPages;
  }

  public BaseSearchResponse setNbSortedHits(Integer nbSortedHits) {
    this.nbSortedHits = nbSortedHits;
    return this;
  }

  /**
   * The number of hits selected and sorted by the relevant sort algorithm.
   *
   * @return nbSortedHits
   */
  @javax.annotation.Nullable
  public Integer getNbSortedHits() {
    return nbSortedHits;
  }

  public BaseSearchResponse setPage(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Specify the page to retrieve.
   *
   * @return page
   */
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }

  public BaseSearchResponse setParams(String params) {
    this.params = params;
    return this;
  }

  /**
   * A url-encoded string of all search parameters.
   *
   * @return params
   */
  @javax.annotation.Nonnull
  public String getParams() {
    return params;
  }

  public BaseSearchResponse setParsedQuery(String parsedQuery) {
    this.parsedQuery = parsedQuery;
    return this;
  }

  /**
   * The query string that will be searched, after normalization.
   *
   * @return parsedQuery
   */
  @javax.annotation.Nullable
  public String getParsedQuery() {
    return parsedQuery;
  }

  public BaseSearchResponse setProcessingTimeMS(Integer processingTimeMS) {
    this.processingTimeMS = processingTimeMS;
    return this;
  }

  /**
   * Time the server took to process the request, in milliseconds.
   *
   * @return processingTimeMS
   */
  @javax.annotation.Nonnull
  public Integer getProcessingTimeMS() {
    return processingTimeMS;
  }

  public BaseSearchResponse setQuery(String query) {
    this.query = query;
    return this;
  }

  /**
   * The text to search in the index.
   *
   * @return query
   */
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public BaseSearchResponse setQueryAfterRemoval(String queryAfterRemoval) {
    this.queryAfterRemoval = queryAfterRemoval;
    return this;
  }

  /**
   * A markup text indicating which parts of the original query have been removed in order to
   * retrieve a non-empty result set.
   *
   * @return queryAfterRemoval
   */
  @javax.annotation.Nullable
  public String getQueryAfterRemoval() {
    return queryAfterRemoval;
  }

  public BaseSearchResponse setServerUsed(String serverUsed) {
    this.serverUsed = serverUsed;
    return this;
  }

  /**
   * Actual host name of the server that processed the request.
   *
   * @return serverUsed
   */
  @javax.annotation.Nullable
  public String getServerUsed() {
    return serverUsed;
  }

  public BaseSearchResponse setUserData(Object userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Lets you store custom data in your indices.
   *
   * @return userData
   */
  @javax.annotation.Nullable
  public Object getUserData() {
    return userData;
  }

  public BaseSearchResponse setRenderingContent(RenderingContent renderingContent) {
    this.renderingContent = renderingContent;
    return this;
  }

  /**
   * Get renderingContent
   *
   * @return renderingContent
   */
  @javax.annotation.Nullable
  public RenderingContent getRenderingContent() {
    return renderingContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSearchResponse baseSearchResponse = (BaseSearchResponse) o;
    return (
      Objects.equals(this.abTestID, baseSearchResponse.abTestID) &&
      Objects.equals(this.abTestVariantID, baseSearchResponse.abTestVariantID) &&
      Objects.equals(this.aroundLatLng, baseSearchResponse.aroundLatLng) &&
      Objects.equals(this.automaticRadius, baseSearchResponse.automaticRadius) &&
      Objects.equals(this.exhaustiveFacetsCount, baseSearchResponse.exhaustiveFacetsCount) &&
      Objects.equals(this.exhaustiveNbHits, baseSearchResponse.exhaustiveNbHits) &&
      Objects.equals(this.exhaustiveTypo, baseSearchResponse.exhaustiveTypo) &&
      Objects.equals(this.facets, baseSearchResponse.facets) &&
      Objects.equals(this.facetsStats, baseSearchResponse.facetsStats) &&
      Objects.equals(this.hitsPerPage, baseSearchResponse.hitsPerPage) &&
      Objects.equals(this.index, baseSearchResponse.index) &&
      Objects.equals(this.indexUsed, baseSearchResponse.indexUsed) &&
      Objects.equals(this.message, baseSearchResponse.message) &&
      Objects.equals(this.nbHits, baseSearchResponse.nbHits) &&
      Objects.equals(this.nbPages, baseSearchResponse.nbPages) &&
      Objects.equals(this.nbSortedHits, baseSearchResponse.nbSortedHits) &&
      Objects.equals(this.page, baseSearchResponse.page) &&
      Objects.equals(this.params, baseSearchResponse.params) &&
      Objects.equals(this.parsedQuery, baseSearchResponse.parsedQuery) &&
      Objects.equals(this.processingTimeMS, baseSearchResponse.processingTimeMS) &&
      Objects.equals(this.query, baseSearchResponse.query) &&
      Objects.equals(this.queryAfterRemoval, baseSearchResponse.queryAfterRemoval) &&
      Objects.equals(this.serverUsed, baseSearchResponse.serverUsed) &&
      Objects.equals(this.userData, baseSearchResponse.userData) &&
      Objects.equals(this.renderingContent, baseSearchResponse.renderingContent)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      abTestID,
      abTestVariantID,
      aroundLatLng,
      automaticRadius,
      exhaustiveFacetsCount,
      exhaustiveNbHits,
      exhaustiveTypo,
      facets,
      facetsStats,
      hitsPerPage,
      index,
      indexUsed,
      message,
      nbHits,
      nbPages,
      nbSortedHits,
      page,
      params,
      parsedQuery,
      processingTimeMS,
      query,
      queryAfterRemoval,
      serverUsed,
      userData,
      renderingContent
    );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSearchResponse {\n");
    sb.append("    abTestID: ").append(toIndentedString(abTestID)).append("\n");
    sb.append("    abTestVariantID: ").append(toIndentedString(abTestVariantID)).append("\n");
    sb.append("    aroundLatLng: ").append(toIndentedString(aroundLatLng)).append("\n");
    sb.append("    automaticRadius: ").append(toIndentedString(automaticRadius)).append("\n");
    sb.append("    exhaustiveFacetsCount: ").append(toIndentedString(exhaustiveFacetsCount)).append("\n");
    sb.append("    exhaustiveNbHits: ").append(toIndentedString(exhaustiveNbHits)).append("\n");
    sb.append("    exhaustiveTypo: ").append(toIndentedString(exhaustiveTypo)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    facetsStats: ").append(toIndentedString(facetsStats)).append("\n");
    sb.append("    hitsPerPage: ").append(toIndentedString(hitsPerPage)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    indexUsed: ").append(toIndentedString(indexUsed)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nbHits: ").append(toIndentedString(nbHits)).append("\n");
    sb.append("    nbPages: ").append(toIndentedString(nbPages)).append("\n");
    sb.append("    nbSortedHits: ").append(toIndentedString(nbSortedHits)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    parsedQuery: ").append(toIndentedString(parsedQuery)).append("\n");
    sb.append("    processingTimeMS: ").append(toIndentedString(processingTimeMS)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryAfterRemoval: ").append(toIndentedString(queryAfterRemoval)).append("\n");
    sb.append("    serverUsed: ").append(toIndentedString(serverUsed)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    renderingContent: ").append(toIndentedString(renderingContent)).append("\n");
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
