package com.algolia.search.integration.common.sync;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.algolia.search.AlgoliaObject;
import com.algolia.search.AlgoliaObjectForFaceting;
import com.algolia.search.Index;
import com.algolia.search.SyncAlgoliaIntegrationTest;
import com.algolia.search.exceptions.AlgoliaException;
import com.algolia.search.exceptions.AlgoliaIndexNotFoundException;
import com.algolia.search.objects.*;
import com.algolia.search.responses.FacetStats;
import com.algolia.search.responses.MultiQueriesResult;
import com.algolia.search.responses.SearchFacetResult;
import com.algolia.search.responses.SearchResult;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public abstract class SyncSearchTest extends SyncAlgoliaIntegrationTest {

  @Test
  public void search() throws AlgoliaException {
    Index<AlgoliaObject> index = createIndex(AlgoliaObject.class);

    waitForCompletion(
        index.addObjects(
            Arrays.asList(
                new AlgoliaObject("algolia1", 1),
                new AlgoliaObject("algolia2", 1),
                new AlgoliaObject("toto", 1))));

    SearchResult<AlgoliaObject> search = index.search(new Query("algolia"));
    assertThat(search.getHits())
        .hasSize(2)
        .extractingResultOf("getClass")
        .containsOnly(AlgoliaObject.class);
  }

  @Test
  public void multiQuery() throws AlgoliaException {
    Index<AlgoliaObject> index = createIndex(AlgoliaObject.class);

    waitForCompletion(
        index.addObjects(
            Arrays.asList(
                new AlgoliaObject("algolia1", 1),
                new AlgoliaObject("algolia2", 1),
                new AlgoliaObject("toto", 1))));

    MultiQueriesResult search =
        client.multipleQueries(
            Arrays.asList(
                new IndexQuery(index, new Query("al")), new IndexQuery(index, new Query("1"))));

    MultiQueriesResult searchWithStrategy =
        client.multipleQueries(
            Arrays.asList(
                new IndexQuery(index, new Query("al")), new IndexQuery(index, new Query("1"))),
            MultiQueriesStrategy.STOP_IF_ENOUGH_MATCHES);

    assertThat(search.getResults()).hasSize(2);
    assertThat(searchWithStrategy.getResults()).hasSize(2);
  }

  @Test
  public void multiQueryWithFacetFilters() throws AlgoliaException {
    Index<AlgoliaObject> index = createIndex(AlgoliaObject.class);

    waitForCompletion(
        index.addObjects(
            Arrays.asList(
                new AlgoliaObject("algolia", 1),
                new AlgoliaObject("algolia", 2),
                new AlgoliaObject("algolia", 3))));

    waitForCompletion(
        index.setSettings(
            new IndexSettings()
                .setAttributesForFaceting(Arrays.asList("searchable(name)", "searchable(age)"))));

    List<IndexQuery> queryFacetListOfString =
        Arrays.asList(
            new IndexQuery(
                index,
                new Query("").setFacetFilters(FacetFilters.ofList(Arrays.asList("name:algolia")))));

    List<IndexQuery> queryFacetListListOfString =
        Arrays.asList(
            new IndexQuery(
                index,
                new Query("")
                    .setFacetFilters(
                        FacetFilters.ofListOfList(
                            Arrays.asList(
                                Arrays.asList("name:algolia"), Arrays.asList("age:3"))))));

    MultiQueriesResult searchWithFacetListOfString = client.multipleQueries(queryFacetListOfString);
    MultiQueriesResult searchWithFacetListOfListOfString =
        client.multipleQueries(queryFacetListListOfString);

    assertThat(searchWithFacetListOfString.getResults().get(0).getParams()).contains("name");
    assertThat(searchWithFacetListOfListOfString.getResults().get(0).getParams()).contains("name");
    assertThat(searchWithFacetListOfListOfString.getResults().get(0).getParams()).contains("age");
  }

  @Test
  public void searchOnNonExistingIndex() {
    Index<AlgoliaObject> index = createIndex(AlgoliaObject.class);
    assertThatExceptionOfType(AlgoliaIndexNotFoundException.class)
        .isThrownBy(() -> index.search(new Query((""))))
        .withMessage(index.getName() + " does not exist");
  }

  @Test
  public void searchAndFacets() throws AlgoliaException {
    Index<AlgoliaObjectForFaceting> index = createIndex(AlgoliaObjectForFaceting.class);
    waitForCompletion(
        index.setSettings(
            new IndexSettings()
                .setAttributesForFaceting(Arrays.asList("searchable(series)", "age"))));

    waitForCompletion(
        index.addObjects(
            Arrays.asList(
                new AlgoliaObjectForFaceting("snoopy", 10, "Peanuts"),
                new AlgoliaObjectForFaceting("woodstock", 20, "Peanuts"),
                new AlgoliaObjectForFaceting("Calvin", 30, "Calvin & Hobbes"))));

    SearchFacetResult result = index.searchForFacetValues("series", "Peanuts");
    assertThat(result.getFacetHits()).hasSize(1);

    SearchResult<AlgoliaObjectForFaceting> search = index.search(new Query("").setFacets("age"));
    Map<String, FacetStats> expected =
        ImmutableMap.of("age", new FacetStats().setMax(30f).setMin(10f).setSum(60f).setAvg(20f));
    assertThat(search.getFacets_stats()).isEqualToComparingFieldByFieldRecursively(expected);
  }

  @Test
  public void geoSearch() throws AlgoliaException {
    Index<AlgoliaObject> index = createIndex(AlgoliaObject.class);

    waitForCompletion(
        index.addObjects(
            Arrays.asList(
                new AlgoliaObject("algolia1", 1),
                new AlgoliaObject("algolia2", 1),
                new AlgoliaObject("toto", 1))));

    SearchResult<AlgoliaObject> searchInsideBounding =
        index.search(
            new Query("algolia")
                .setInsideBoundingBox(
                    Arrays.asList(
                        Arrays.asList(
                            46.650828100116044f, 7.123046875f, 45.17210966999772f, 1.009765625f))));

    searchInsideBounding.getParams();

    SearchResult<AlgoliaObject> searchInsindeBoundingList =
        index.search(
            new Query("algolia")
                .setInsideBoundingBox(
                    Arrays.asList(
                        Arrays.asList(
                            46.650828100116044f, 7.123046875f, 45.17210966999772f, 1.009765625f),
                        Arrays.asList(
                            49.62625916704081f,
                            4.6181640625f,
                            47.715070300900194f,
                            0.482421875f))));

    SearchResult<AlgoliaObject> searchInsidePolygon =
        index.search(
            new Query("algolia")
                .setInsidePolygon(
                    Arrays.asList(
                        Arrays.asList(
                            46.650828100116044f,
                            7.123046875f,
                            45.17210966999772f,
                            1.009765625f,
                            49.62625916704081f,
                            4.6181640625f))));

    SearchResult<AlgoliaObject> searchInsidePolygonList =
        index.search(
            new Query("algolia")
                .setInsidePolygon(
                    Arrays.asList(
                        Arrays.asList(
                            46.650828100116044f,
                            7.123046875f,
                            45.17210966999772f,
                            1.009765625f,
                            49.62625916704081f,
                            4.6181640625f),
                        Arrays.asList(
                            49.62625916704081f,
                            4.6181640625f,
                            47.715070300900194f,
                            0.482421875f,
                            45.17210966999772f,
                            1.009765625f,
                            50.62626704081f,
                            4.6181640625f))));
  }
}
