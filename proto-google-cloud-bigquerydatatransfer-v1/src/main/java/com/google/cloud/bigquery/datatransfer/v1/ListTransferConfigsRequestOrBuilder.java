/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface ListTransferConfigsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The BigQuery project id for which data sources
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery project id for which data sources
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  java.util.List<java.lang.String> getDataSourceIdsList();
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  int getDataSourceIdsCount();
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  java.lang.String getDataSourceIds(int index);
  /**
   *
   *
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   */
  com.google.protobuf.ByteString getDataSourceIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Page size. The default page size is the maximum value of 1000 results.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();
}
