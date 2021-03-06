// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v3.resources;

public final class AdGroupAdAssetViewProto {
  private AdGroupAdAssetViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v3/resources/ad_g" +
      "roup_ad_asset_view.proto\022!google.ads.goo" +
      "gleads.v3.resources\032+google/ads/googlead" +
      "s/v3/common/policy.proto\0324google/ads/goo" +
      "gleads/v3/enums/asset_field_type.proto\032;" +
      "google/ads/googleads/v3/enums/asset_perf" +
      "ormance_label.proto\032:google/ads/googlead" +
      "s/v3/enums/policy_approval_status.proto\032" +
      "8google/ads/googleads/v3/enums/policy_re" +
      "view_status.proto\032\031google/api/resource.p" +
      "roto\032\036google/protobuf/wrappers.proto\032\034go" +
      "ogle/api/annotations.proto\"\225\004\n\022AdGroupAd" +
      "AssetView\022\025\n\rresource_name\030\001 \001(\t\0221\n\013ad_g" +
      "roup_ad\030\005 \001(\0132\034.google.protobuf.StringVa" +
      "lue\022+\n\005asset\030\006 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022T\n\nfield_type\030\002 \001(\0162@.google.ad" +
      "s.googleads.v3.enums.AssetFieldTypeEnum." +
      "AssetFieldType\022V\n\016policy_summary\030\003 \001(\0132>" +
      ".google.ads.googleads.v3.resources.AdGro" +
      "upAdAssetPolicySummary\022i\n\021performance_la" +
      "bel\030\004 \001(\0162N.google.ads.googleads.v3.enum" +
      "s.AssetPerformanceLabelEnum.AssetPerform" +
      "anceLabel:o\352Al\n+googleads.googleapis.com" +
      "/AdGroupAdAssetView\022=customers/{customer" +
      "}/adGroupAdAssets/{ad_group_ad_asset_vie" +
      "w}\"\265\002\n\033AdGroupAdAssetPolicySummary\022N\n\024po" +
      "licy_topic_entries\030\001 \003(\01320.google.ads.go" +
      "ogleads.v3.common.PolicyTopicEntry\022_\n\rre" +
      "view_status\030\002 \001(\0162H.google.ads.googleads" +
      ".v3.enums.PolicyReviewStatusEnum.PolicyR" +
      "eviewStatus\022e\n\017approval_status\030\003 \001(\0162L.g" +
      "oogle.ads.googleads.v3.enums.PolicyAppro" +
      "valStatusEnum.PolicyApprovalStatusB\204\002\n%c" +
      "om.google.ads.googleads.v3.resourcesB\027Ad" +
      "GroupAdAssetViewProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v3/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V3.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V3\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V3::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.AssetPerformanceLabelProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetView_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Asset", "FieldType", "PolicySummary", "PerformanceLabel", });
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AdGroupAdAssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v3.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.AssetPerformanceLabelProto.getDescriptor();
    com.google.ads.googleads.v3.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
