// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/feed.proto

package com.google.ads.googleads.v3.resources;

public final class FeedProto {
  private FeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_FeedAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v3/resources/feed" +
      ".proto\022!google.ads.googleads.v3.resource" +
      "s\032Mgoogle/ads/googleads/v3/enums/affilia" +
      "te_location_feed_relationship_type.proto" +
      "\0327google/ads/googleads/v3/enums/feed_att" +
      "ribute_type.proto\032/google/ads/googleads/" +
      "v3/enums/feed_origin.proto\032/google/ads/g" +
      "oogleads/v3/enums/feed_status.proto\032\031goo" +
      "gle/api/resource.proto\032\036google/protobuf/" +
      "wrappers.proto\032\034google/api/annotations.p" +
      "roto\"\201\014\n\004Feed\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002" +
      "id\030\002 \001(\0132\033.google.protobuf.Int64Value\022*\n" +
      "\004name\030\003 \001(\0132\034.google.protobuf.StringValu" +
      "e\022D\n\nattributes\030\004 \003(\01320.google.ads.googl" +
      "eads.v3.resources.FeedAttribute\022W\n\024attri" +
      "bute_operations\030\t \003(\01329.google.ads.googl" +
      "eads.v3.resources.FeedAttributeOperation" +
      "\022H\n\006origin\030\005 \001(\01628.google.ads.googleads." +
      "v3.enums.FeedOriginEnum.FeedOrigin\022H\n\006st" +
      "atus\030\010 \001(\01628.google.ads.googleads.v3.enu" +
      "ms.FeedStatusEnum.FeedStatus\022c\n\031places_l" +
      "ocation_feed_data\030\006 \001(\0132>.google.ads.goo" +
      "gleads.v3.resources.Feed.PlacesLocationF" +
      "eedDataH\000\022i\n\034affiliate_location_feed_dat" +
      "a\030\007 \001(\0132A.google.ads.googleads.v3.resour" +
      "ces.Feed.AffiliateLocationFeedDataH\000\032\311\004\n" +
      "\026PlacesLocationFeedData\022\\\n\noauth_info\030\001 " +
      "\001(\0132H.google.ads.googleads.v3.resources." +
      "Feed.PlacesLocationFeedData.OAuthInfo\0223\n" +
      "\remail_address\030\002 \001(\0132\034.google.protobuf.S" +
      "tringValue\0229\n\023business_account_id\030\n \001(\0132" +
      "\034.google.protobuf.StringValue\022:\n\024busines" +
      "s_name_filter\030\004 \001(\0132\034.google.protobuf.St" +
      "ringValue\0226\n\020category_filters\030\005 \003(\0132\034.go" +
      "ogle.protobuf.StringValue\0223\n\rlabel_filte" +
      "rs\030\006 \003(\0132\034.google.protobuf.StringValue\032\267" +
      "\001\n\tOAuthInfo\0221\n\013http_method\030\001 \001(\0132\034.goog" +
      "le.protobuf.StringValue\0226\n\020http_request_" +
      "url\030\002 \001(\0132\034.google.protobuf.StringValue\022" +
      "?\n\031http_authorization_header\030\003 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\032\327\001\n\031AffiliateLo" +
      "cationFeedData\022.\n\tchain_ids\030\001 \003(\0132\033.goog" +
      "le.protobuf.Int64Value\022\211\001\n\021relationship_" +
      "type\030\002 \001(\0162n.google.ads.googleads.v3.enu" +
      "ms.AffiliateLocationFeedRelationshipType" +
      "Enum.AffiliateLocationFeedRelationshipTy" +
      "pe:E\352AB\n\035googleads.googleapis.com/Feed\022!" +
      "customers/{customer}/feeds/{feed}B\035\n\033sys" +
      "tem_feed_generation_data\"\356\001\n\rFeedAttribu" +
      "te\022\'\n\002id\030\001 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\022*\n\004name\030\002 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022T\n\004type\030\003 \001(\0162F.google.ads.googl" +
      "eads.v3.enums.FeedAttributeTypeEnum.Feed" +
      "AttributeType\0222\n\016is_part_of_key\030\004 \001(\0132\032." +
      "google.protobuf.BoolValue\"\342\001\n\026FeedAttrib" +
      "uteOperation\022T\n\010operator\030\001 \001(\0162B.google." +
      "ads.googleads.v3.resources.FeedAttribute" +
      "Operation.Operator\022?\n\005value\030\002 \001(\01320.goog" +
      "le.ads.googleads.v3.resources.FeedAttrib" +
      "ute\"1\n\010Operator\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKN" +
      "OWN\020\001\022\007\n\003ADD\020\002B\366\001\n%com.google.ads.google" +
      "ads.v3.resourcesB\tFeedProtoP\001ZJgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v3/resources;resources\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V3.Resources\312\002!Google\\Ads" +
      "\\GoogleAds\\V3\\Resources\352\002%Google::Ads::G" +
      "oogleAds::V3::Resourcesb\006proto3"
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
          com.google.ads.googleads.v3.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedAttributeTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedOriginProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.FeedStatusProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_Feed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Attributes", "AttributeOperations", "Origin", "Status", "PlacesLocationFeedData", "AffiliateLocationFeedData", "SystemFeedGenerationData", });
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor,
        new java.lang.String[] { "OauthInfo", "EmailAddress", "BusinessAccountId", "BusinessNameFilter", "CategoryFilters", "LabelFilters", });
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor,
        new java.lang.String[] { "HttpMethod", "HttpRequestUrl", "HttpAuthorizationHeader", });
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v3_resources_Feed_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_Feed_AffiliateLocationFeedData_descriptor,
        new java.lang.String[] { "ChainIds", "RelationshipType", });
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v3_resources_FeedAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_FeedAttribute_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", "IsPartOfKey", });
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_FeedAttributeOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedAttributeTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedOriginProto.getDescriptor();
    com.google.ads.googleads.v3.enums.FeedStatusProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
