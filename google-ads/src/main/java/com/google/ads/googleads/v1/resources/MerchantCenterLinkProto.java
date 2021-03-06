// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/merchant_center_link.proto

package com.google.ads.googleads.v1.resources;

public final class MerchantCenterLinkProto {
  private MerchantCenterLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_MerchantCenterLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_MerchantCenterLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v1/resources/merc" +
      "hant_center_link.proto\022!google.ads.googl" +
      "eads.v1.resources\032?google/ads/googleads/" +
      "v1/enums/merchant_center_link_status.pro" +
      "to\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"\376\001\n\022MerchantCen" +
      "terLink\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\003 \001" +
      "(\0132\033.google.protobuf.Int64Value\022B\n\034merch" +
      "ant_center_account_name\030\004 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022d\n\006status\030\005 \001(\0162T.go" +
      "ogle.ads.googleads.v1.enums.MerchantCent" +
      "erLinkStatusEnum.MerchantCenterLinkStatu" +
      "sB\204\002\n%com.google.ads.googleads.v1.resour" +
      "cesB\027MerchantCenterLinkProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v1/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V1.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V1\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V1::Resourcesb\006proto3"
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
          com.google.ads.googleads.v1.enums.MerchantCenterLinkStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_MerchantCenterLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_MerchantCenterLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_MerchantCenterLink_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "MerchantCenterAccountName", "Status", });
    com.google.ads.googleads.v1.enums.MerchantCenterLinkStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
