// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/asset.proto

package com.google.ads.googleads.v3.resources;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the asset.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the asset.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the asset.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetTypeEnum.AssetType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.AssetTypeEnum.AssetType type = 4;</code>
   */
  com.google.ads.googleads.v3.enums.AssetTypeEnum.AssetType getType();

  /**
   * <pre>
   * A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YoutubeVideoAsset youtube_video_asset = 5;</code>
   */
  boolean hasYoutubeVideoAsset();
  /**
   * <pre>
   * A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YoutubeVideoAsset youtube_video_asset = 5;</code>
   */
  com.google.ads.googleads.v3.common.YoutubeVideoAsset getYoutubeVideoAsset();
  /**
   * <pre>
   * A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.YoutubeVideoAsset youtube_video_asset = 5;</code>
   */
  com.google.ads.googleads.v3.common.YoutubeVideoAssetOrBuilder getYoutubeVideoAssetOrBuilder();

  /**
   * <pre>
   * A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MediaBundleAsset media_bundle_asset = 6;</code>
   */
  boolean hasMediaBundleAsset();
  /**
   * <pre>
   * A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MediaBundleAsset media_bundle_asset = 6;</code>
   */
  com.google.ads.googleads.v3.common.MediaBundleAsset getMediaBundleAsset();
  /**
   * <pre>
   * A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.MediaBundleAsset media_bundle_asset = 6;</code>
   */
  com.google.ads.googleads.v3.common.MediaBundleAssetOrBuilder getMediaBundleAssetOrBuilder();

  /**
   * <pre>
   * An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAsset image_asset = 7;</code>
   */
  boolean hasImageAsset();
  /**
   * <pre>
   * An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAsset image_asset = 7;</code>
   */
  com.google.ads.googleads.v3.common.ImageAsset getImageAsset();
  /**
   * <pre>
   * An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.ImageAsset image_asset = 7;</code>
   */
  com.google.ads.googleads.v3.common.ImageAssetOrBuilder getImageAssetOrBuilder();

  /**
   * <pre>
   * A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAsset text_asset = 8;</code>
   */
  boolean hasTextAsset();
  /**
   * <pre>
   * A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAsset text_asset = 8;</code>
   */
  com.google.ads.googleads.v3.common.TextAsset getTextAsset();
  /**
   * <pre>
   * A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.TextAsset text_asset = 8;</code>
   */
  com.google.ads.googleads.v3.common.TextAssetOrBuilder getTextAssetOrBuilder();

  public com.google.ads.googleads.v3.resources.Asset.AssetDataCase getAssetDataCase();
}
