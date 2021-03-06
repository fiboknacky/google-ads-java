// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v3.resources;

public interface AdGroupAdAssetViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.AdGroupAdAssetView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form:
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.asset_field_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form:
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.asset_field_type}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5;</code>
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5;</code>
   */
  com.google.protobuf.StringValue getAdGroupAd();
  /**
   * <pre>
   * The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupAdOrBuilder();

  /**
   * <pre>
   * The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6;</code>
   */
  boolean hasAsset();
  /**
   * <pre>
   * The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6;</code>
   */
  com.google.protobuf.StringValue getAsset();
  /**
   * <pre>
   * The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAssetOrBuilder();

  /**
   * <pre>
   * Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2;</code>
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2;</code>
   */
  com.google.ads.googleads.v3.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();

  /**
   * <pre>
   * Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdAssetPolicySummary policy_summary = 3;</code>
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdAssetPolicySummary policy_summary = 3;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupAdAssetPolicySummary getPolicySummary();
  /**
   * <pre>
   * Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.AdGroupAdAssetPolicySummary policy_summary = 3;</code>
   */
  com.google.ads.googleads.v3.resources.AdGroupAdAssetPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4;</code>
   */
  int getPerformanceLabelValue();
  /**
   * <pre>
   * Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4;</code>
   */
  com.google.ads.googleads.v3.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel getPerformanceLabel();
}
