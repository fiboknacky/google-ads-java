// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/authorization_error.proto

package com.google.ads.googleads.v1.errors;

public final class AuthorizationErrorProto {
  private AuthorizationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_AuthorizationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_AuthorizationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/errors/authori" +
      "zation_error.proto\022\036google.ads.googleads" +
      ".v1.errors\032\034google/api/annotations.proto" +
      "\"\333\002\n\026AuthorizationErrorEnum\"\300\002\n\022Authoriz" +
      "ationError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001" +
      "\022\032\n\026USER_PERMISSION_DENIED\020\002\022#\n\037DEVELOPE" +
      "R_TOKEN_NOT_WHITELISTED\020\003\022\036\n\032DEVELOPER_T" +
      "OKEN_PROHIBITED\020\004\022\024\n\020PROJECT_DISABLED\020\005\022" +
      "\027\n\023AUTHORIZATION_ERROR\020\006\022\030\n\024ACTION_NOT_P" +
      "ERMITTED\020\007\022\025\n\021INCOMPLETE_SIGNUP\020\010\022\030\n\024CUS" +
      "TOMER_NOT_ENABLED\020\030\022\017\n\013MISSING_TOS\020\t\022 \n\034" +
      "DEVELOPER_TOKEN_NOT_APPROVED\020\nB\362\001\n\"com.g" +
      "oogle.ads.googleads.v1.errorsB\027Authoriza" +
      "tionErrorProtoP\001ZDgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v1/errors;" +
      "errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V1.E" +
      "rrors\312\002\036Google\\Ads\\GoogleAds\\V1\\Errors\352\002" +
      "\"Google::Ads::GoogleAds::V1::Errorsb\006pro" +
      "to3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_errors_AuthorizationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_AuthorizationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_AuthorizationErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
