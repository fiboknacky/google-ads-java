// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/ad_group_label_service.proto

package com.google.ads.googleads.v3.services;

public final class AdGroupLabelServiceProto {
  private AdGroupLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_GetAdGroupLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_GetAdGroupLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_AdGroupLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_AdGroupLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v3/services/ad_gr" +
      "oup_label_service.proto\022 google.ads.goog" +
      "leads.v3.services\0326google/ads/googleads/" +
      "v3/resources/ad_group_label.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\027google/rpc/status.proto\"4\n\026GetAdGroup" +
      "LabelRequest\022\032\n\rresource_name\030\001 \001(\tB\003\340A\002" +
      "\"\270\001\n\032MutateAdGroupLabelsRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022P\n\noperations\030\002 \003(\01327." +
      "google.ads.googleads.v3.services.AdGroup" +
      "LabelOperationB\003\340A\002\022\027\n\017partial_failure\030\003" +
      " \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"y\n\025AdGroupLa" +
      "belOperation\022A\n\006create\030\001 \001(\0132/.google.ad" +
      "s.googleads.v3.resources.AdGroupLabelH\000\022" +
      "\020\n\006remove\030\002 \001(\tH\000B\013\n\toperation\"\235\001\n\033Mutat" +
      "eAdGroupLabelsResponse\0221\n\025partial_failur" +
      "e_error\030\003 \001(\0132\022.google.rpc.Status\022K\n\007res" +
      "ults\030\002 \003(\0132:.google.ads.googleads.v3.ser" +
      "vices.MutateAdGroupLabelResult\"1\n\030Mutate" +
      "AdGroupLabelResult\022\025\n\rresource_name\030\001 \001(" +
      "\t2\347\003\n\023AdGroupLabelService\022\305\001\n\017GetAdGroup" +
      "Label\0228.google.ads.googleads.v3.services" +
      ".GetAdGroupLabelRequest\032/.google.ads.goo" +
      "gleads.v3.resources.AdGroupLabel\"G\202\323\344\223\0021" +
      "\022//v3/{resource_name=customers/*/adGroup" +
      "Labels/*}\332A\rresource_name\022\352\001\n\023MutateAdGr" +
      "oupLabels\022<.google.ads.googleads.v3.serv" +
      "ices.MutateAdGroupLabelsRequest\032=.google" +
      ".ads.googleads.v3.services.MutateAdGroup" +
      "LabelsResponse\"V\202\323\344\223\0027\"2/v3/customers/{c" +
      "ustomer_id=*}/adGroupLabels:mutate:\001*\332A\026" +
      "customer_id,operations\032\033\312A\030googleads.goo" +
      "gleapis.comB\377\001\n$com.google.ads.googleads" +
      ".v3.servicesB\030AdGroupLabelServiceProtoP\001" +
      "ZHgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v3/services;services\242\002\003GAA" +
      "\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Go" +
      "ogle\\Ads\\GoogleAds\\V3\\Services\352\002$Google:" +
      ":Ads::GoogleAds::V3::Servicesb\006proto3"
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
          com.google.ads.googleads.v3.resources.AdGroupLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_services_GetAdGroupLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_services_GetAdGroupLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_GetAdGroupLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v3_services_AdGroupLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_services_AdGroupLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_AdGroupLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_services_MutateAdGroupLabelResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.resources.AdGroupLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
