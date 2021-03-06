// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/mutate_job_service.proto

package com.google.ads.googleads.v3.services;

public interface ListMutateJobResultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.ListMutateJobResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v3.services.MutateJobResult> 
      getResultsList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  com.google.ads.googleads.v3.services.MutateJobResult getResults(int index);
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.services.MutateJobResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.MutateJobResult results = 1;</code>
   */
  com.google.ads.googleads.v3.services.MutateJobResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
