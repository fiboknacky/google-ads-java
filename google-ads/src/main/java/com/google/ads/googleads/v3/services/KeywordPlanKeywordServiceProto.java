// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_keyword_service.proto

package com.google.ads.googleads.v3.services;

public final class KeywordPlanKeywordServiceProto {
  private KeywordPlanKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanKeywordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetKeywordPlanKeywordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v3/services/keywo" +
      "rd_plan_keyword_service.proto\022 google.ad" +
      "s.googleads.v3.services\032<google/ads/goog" +
      "leads/v3/resources/keyword_plan_keyword." +
      "proto\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032 google/protobuf/field_mas" +
      "k.proto\032\027google/rpc/status.proto\":\n\034GetK" +
      "eywordPlanKeywordRequest\022\032\n\rresource_nam" +
      "e\030\001 \001(\tB\003\340A\002\"\304\001\n MutateKeywordPlanKeywor" +
      "dsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022V\n\no" +
      "perations\030\002 \003(\0132=.google.ads.googleads.v" +
      "3.services.KeywordPlanKeywordOperationB\003" +
      "\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate" +
      "_only\030\004 \001(\010\"\377\001\n\033KeywordPlanKeywordOperat" +
      "ion\022/\n\013update_mask\030\004 \001(\0132\032.google.protob" +
      "uf.FieldMask\022G\n\006create\030\001 \001(\01325.google.ad" +
      "s.googleads.v3.resources.KeywordPlanKeyw" +
      "ordH\000\022G\n\006update\030\002 \001(\01325.google.ads.googl" +
      "eads.v3.resources.KeywordPlanKeywordH\000\022\020" +
      "\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\251\001\n!Mutate" +
      "KeywordPlanKeywordsResponse\0221\n\025partial_f" +
      "ailure_error\030\003 \001(\0132\022.google.rpc.Status\022Q" +
      "\n\007results\030\002 \003(\0132@.google.ads.googleads.v" +
      "3.services.MutateKeywordPlanKeywordResul" +
      "t\"7\n\036MutateKeywordPlanKeywordResult\022\025\n\rr" +
      "esource_name\030\001 \001(\t2\235\004\n\031KeywordPlanKeywor" +
      "dService\022\335\001\n\025GetKeywordPlanKeyword\022>.goo" +
      "gle.ads.googleads.v3.services.GetKeyword" +
      "PlanKeywordRequest\0325.google.ads.googlead" +
      "s.v3.resources.KeywordPlanKeyword\"M\202\323\344\223\002" +
      "7\0225/v3/{resource_name=customers/*/keywor" +
      "dPlanKeywords/*}\332A\rresource_name\022\202\002\n\031Mut" +
      "ateKeywordPlanKeywords\022B.google.ads.goog" +
      "leads.v3.services.MutateKeywordPlanKeywo" +
      "rdsRequest\032C.google.ads.googleads.v3.ser" +
      "vices.MutateKeywordPlanKeywordsResponse\"" +
      "\\\202\323\344\223\002=\"8/v3/customers/{customer_id=*}/k" +
      "eywordPlanKeywords:mutate:\001*\332A\026customer_" +
      "id,operations\032\033\312A\030googleads.googleapis.c" +
      "omB\205\002\n$com.google.ads.googleads.v3.servi" +
      "cesB\036KeywordPlanKeywordServiceProtoP\001ZHg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v3/services;services\242\002\003GAA\252\002 " +
      "Google.Ads.GoogleAds.V3.Services\312\002 Googl" +
      "e\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ad" +
      "s::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.KeywordPlanKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanKeywordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetKeywordPlanKeywordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetKeywordPlanKeywordRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateKeywordPlanKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.KeywordPlanKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
