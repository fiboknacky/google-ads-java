// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/keyword_plan_common.proto

package com.google.ads.googleads.v5.common;

public final class KeywordPlanCommonProto {
  private KeywordPlanCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_KeywordPlanHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_KeywordPlanHistoricalMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_MonthlySearchVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_MonthlySearchVolume_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v5/common/keyword" +
      "_plan_common.proto\022\036google.ads.googleads" +
      ".v5.common\032Bgoogle/ads/googleads/v5/enum" +
      "s/keyword_plan_competition_level.proto\0321" +
      "google/ads/googleads/v5/enums/month_of_y" +
      "ear.proto\032\036google/protobuf/wrappers.prot" +
      "o\032\034google/api/annotations.proto\"\332\003\n\034Keyw" +
      "ordPlanHistoricalMetrics\0229\n\024avg_monthly_" +
      "searches\030\001 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022S\n\026monthly_search_volumes\030\006 \003(\01323.go" +
      "ogle.ads.googleads.v5.common.MonthlySear" +
      "chVolume\022o\n\013competition\030\002 \001(\0162Z.google.a" +
      "ds.googleads.v5.enums.KeywordPlanCompeti" +
      "tionLevelEnum.KeywordPlanCompetitionLeve" +
      "l\0226\n\021competition_index\030\003 \001(\0132\033.google.pr" +
      "otobuf.Int64Value\022?\n\032low_top_of_page_bid" +
      "_micros\030\004 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\022@\n\033high_top_of_page_bid_micros\030\005 \001(\0132" +
      "\033.google.protobuf.Int64Value\"\302\001\n\023Monthly" +
      "SearchVolume\022)\n\004year\030\001 \001(\0132\033.google.prot" +
      "obuf.Int64Value\022I\n\005month\030\002 \001(\0162:.google." +
      "ads.googleads.v5.enums.MonthOfYearEnum.M" +
      "onthOfYear\0225\n\020monthly_searches\030\003 \001(\0132\033.g" +
      "oogle.protobuf.Int64ValueB\361\001\n\"com.google" +
      ".ads.googleads.v5.commonB\026KeywordPlanCom" +
      "monProtoP\001ZDgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v5/common;common" +
      "\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V5.Common\312" +
      "\002\036Google\\Ads\\GoogleAds\\V5\\Common\352\002\"Googl" +
      "e::Ads::GoogleAds::V5::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.KeywordPlanCompetitionLevelProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.MonthOfYearProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_KeywordPlanHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_KeywordPlanHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_KeywordPlanHistoricalMetrics_descriptor,
        new java.lang.String[] { "AvgMonthlySearches", "MonthlySearchVolumes", "Competition", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", });
    internal_static_google_ads_googleads_v5_common_MonthlySearchVolume_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_common_MonthlySearchVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_MonthlySearchVolume_descriptor,
        new java.lang.String[] { "Year", "Month", "MonthlySearches", });
    com.google.ads.googleads.v5.enums.KeywordPlanCompetitionLevelProto.getDescriptor();
    com.google.ads.googleads.v5.enums.MonthOfYearProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}