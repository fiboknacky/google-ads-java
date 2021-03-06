// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_service.proto

package com.google.ads.googleads.v3.services;

/**
 * <pre>
 * A keyword forecast.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.services.KeywordPlanKeywordForecast}
 */
public  final class KeywordPlanKeywordForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.services.KeywordPlanKeywordForecast)
    KeywordPlanKeywordForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanKeywordForecast.newBuilder() to construct.
  private KeywordPlanKeywordForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanKeywordForecast() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordPlanKeywordForecast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (keywordPlanAdGroupKeyword_ != null) {
              subBuilder = keywordPlanAdGroupKeyword_.toBuilder();
            }
            keywordPlanAdGroupKeyword_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keywordPlanAdGroupKeyword_);
              keywordPlanAdGroupKeyword_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.ads.googleads.v3.services.ForecastMetrics.Builder subBuilder = null;
            if (keywordForecast_ != null) {
              subBuilder = keywordForecast_.toBuilder();
            }
            keywordForecast_ = input.readMessage(com.google.ads.googleads.v3.services.ForecastMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keywordForecast_);
              keywordForecast_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.class, com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.Builder.class);
  }

  public static final int KEYWORD_PLAN_AD_GROUP_KEYWORD_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue keywordPlanAdGroupKeyword_;
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  public boolean hasKeywordPlanAdGroupKeyword() {
    return keywordPlanAdGroupKeyword_ != null;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  public com.google.protobuf.StringValue getKeywordPlanAdGroupKeyword() {
    return keywordPlanAdGroupKeyword_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroupKeyword_;
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupKeywordOrBuilder() {
    return getKeywordPlanAdGroupKeyword();
  }

  public static final int KEYWORD_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v3.services.ForecastMetrics keywordForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  public boolean hasKeywordForecast() {
    return keywordForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  public com.google.ads.googleads.v3.services.ForecastMetrics getKeywordForecast() {
    return keywordForecast_ == null ? com.google.ads.googleads.v3.services.ForecastMetrics.getDefaultInstance() : keywordForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  public com.google.ads.googleads.v3.services.ForecastMetricsOrBuilder getKeywordForecastOrBuilder() {
    return getKeywordForecast();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (keywordPlanAdGroupKeyword_ != null) {
      output.writeMessage(1, getKeywordPlanAdGroupKeyword());
    }
    if (keywordForecast_ != null) {
      output.writeMessage(2, getKeywordForecast());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keywordPlanAdGroupKeyword_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeywordPlanAdGroupKeyword());
    }
    if (keywordForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKeywordForecast());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast other = (com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast) obj;

    if (hasKeywordPlanAdGroupKeyword() != other.hasKeywordPlanAdGroupKeyword()) return false;
    if (hasKeywordPlanAdGroupKeyword()) {
      if (!getKeywordPlanAdGroupKeyword()
          .equals(other.getKeywordPlanAdGroupKeyword())) return false;
    }
    if (hasKeywordForecast() != other.hasKeywordForecast()) return false;
    if (hasKeywordForecast()) {
      if (!getKeywordForecast()
          .equals(other.getKeywordForecast())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKeywordPlanAdGroupKeyword()) {
      hash = (37 * hash) + KEYWORD_PLAN_AD_GROUP_KEYWORD_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanAdGroupKeyword().hashCode();
    }
    if (hasKeywordForecast()) {
      hash = (37 * hash) + KEYWORD_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordForecast().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A keyword forecast.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.services.KeywordPlanKeywordForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.services.KeywordPlanKeywordForecast)
      com.google.ads.googleads.v3.services.KeywordPlanKeywordForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.class, com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        keywordPlanAdGroupKeyword_ = null;
      } else {
        keywordPlanAdGroupKeyword_ = null;
        keywordPlanAdGroupKeywordBuilder_ = null;
      }
      if (keywordForecastBuilder_ == null) {
        keywordForecast_ = null;
      } else {
        keywordForecast_ = null;
        keywordForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v3.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v3_services_KeywordPlanKeywordForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast build() {
      com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast buildPartial() {
      com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast result = new com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast(this);
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        result.keywordPlanAdGroupKeyword_ = keywordPlanAdGroupKeyword_;
      } else {
        result.keywordPlanAdGroupKeyword_ = keywordPlanAdGroupKeywordBuilder_.build();
      }
      if (keywordForecastBuilder_ == null) {
        result.keywordForecast_ = keywordForecast_;
      } else {
        result.keywordForecast_ = keywordForecastBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast) {
        return mergeFrom((com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast other) {
      if (other == com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast.getDefaultInstance()) return this;
      if (other.hasKeywordPlanAdGroupKeyword()) {
        mergeKeywordPlanAdGroupKeyword(other.getKeywordPlanAdGroupKeyword());
      }
      if (other.hasKeywordForecast()) {
        mergeKeywordForecast(other.getKeywordForecast());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue keywordPlanAdGroupKeyword_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> keywordPlanAdGroupKeywordBuilder_;
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public boolean hasKeywordPlanAdGroupKeyword() {
      return keywordPlanAdGroupKeywordBuilder_ != null || keywordPlanAdGroupKeyword_ != null;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public com.google.protobuf.StringValue getKeywordPlanAdGroupKeyword() {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        return keywordPlanAdGroupKeyword_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroupKeyword_;
      } else {
        return keywordPlanAdGroupKeywordBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public Builder setKeywordPlanAdGroupKeyword(com.google.protobuf.StringValue value) {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keywordPlanAdGroupKeyword_ = value;
        onChanged();
      } else {
        keywordPlanAdGroupKeywordBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public Builder setKeywordPlanAdGroupKeyword(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        keywordPlanAdGroupKeyword_ = builderForValue.build();
        onChanged();
      } else {
        keywordPlanAdGroupKeywordBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public Builder mergeKeywordPlanAdGroupKeyword(com.google.protobuf.StringValue value) {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        if (keywordPlanAdGroupKeyword_ != null) {
          keywordPlanAdGroupKeyword_ =
            com.google.protobuf.StringValue.newBuilder(keywordPlanAdGroupKeyword_).mergeFrom(value).buildPartial();
        } else {
          keywordPlanAdGroupKeyword_ = value;
        }
        onChanged();
      } else {
        keywordPlanAdGroupKeywordBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public Builder clearKeywordPlanAdGroupKeyword() {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        keywordPlanAdGroupKeyword_ = null;
        onChanged();
      } else {
        keywordPlanAdGroupKeyword_ = null;
        keywordPlanAdGroupKeywordBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getKeywordPlanAdGroupKeywordBuilder() {
      
      onChanged();
      return getKeywordPlanAdGroupKeywordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupKeywordOrBuilder() {
      if (keywordPlanAdGroupKeywordBuilder_ != null) {
        return keywordPlanAdGroupKeywordBuilder_.getMessageOrBuilder();
      } else {
        return keywordPlanAdGroupKeyword_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : keywordPlanAdGroupKeyword_;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan keyword related to the forecast.
     * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
     * </pre>
     *
     * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getKeywordPlanAdGroupKeywordFieldBuilder() {
      if (keywordPlanAdGroupKeywordBuilder_ == null) {
        keywordPlanAdGroupKeywordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getKeywordPlanAdGroupKeyword(),
                getParentForChildren(),
                isClean());
        keywordPlanAdGroupKeyword_ = null;
      }
      return keywordPlanAdGroupKeywordBuilder_;
    }

    private com.google.ads.googleads.v3.services.ForecastMetrics keywordForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.services.ForecastMetrics, com.google.ads.googleads.v3.services.ForecastMetrics.Builder, com.google.ads.googleads.v3.services.ForecastMetricsOrBuilder> keywordForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public boolean hasKeywordForecast() {
      return keywordForecastBuilder_ != null || keywordForecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public com.google.ads.googleads.v3.services.ForecastMetrics getKeywordForecast() {
      if (keywordForecastBuilder_ == null) {
        return keywordForecast_ == null ? com.google.ads.googleads.v3.services.ForecastMetrics.getDefaultInstance() : keywordForecast_;
      } else {
        return keywordForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public Builder setKeywordForecast(com.google.ads.googleads.v3.services.ForecastMetrics value) {
      if (keywordForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keywordForecast_ = value;
        onChanged();
      } else {
        keywordForecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public Builder setKeywordForecast(
        com.google.ads.googleads.v3.services.ForecastMetrics.Builder builderForValue) {
      if (keywordForecastBuilder_ == null) {
        keywordForecast_ = builderForValue.build();
        onChanged();
      } else {
        keywordForecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public Builder mergeKeywordForecast(com.google.ads.googleads.v3.services.ForecastMetrics value) {
      if (keywordForecastBuilder_ == null) {
        if (keywordForecast_ != null) {
          keywordForecast_ =
            com.google.ads.googleads.v3.services.ForecastMetrics.newBuilder(keywordForecast_).mergeFrom(value).buildPartial();
        } else {
          keywordForecast_ = value;
        }
        onChanged();
      } else {
        keywordForecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public Builder clearKeywordForecast() {
      if (keywordForecastBuilder_ == null) {
        keywordForecast_ = null;
        onChanged();
      } else {
        keywordForecast_ = null;
        keywordForecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public com.google.ads.googleads.v3.services.ForecastMetrics.Builder getKeywordForecastBuilder() {
      
      onChanged();
      return getKeywordForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    public com.google.ads.googleads.v3.services.ForecastMetricsOrBuilder getKeywordForecastOrBuilder() {
      if (keywordForecastBuilder_ != null) {
        return keywordForecastBuilder_.getMessageOrBuilder();
      } else {
        return keywordForecast_ == null ?
            com.google.ads.googleads.v3.services.ForecastMetrics.getDefaultInstance() : keywordForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v3.services.ForecastMetrics keyword_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v3.services.ForecastMetrics, com.google.ads.googleads.v3.services.ForecastMetrics.Builder, com.google.ads.googleads.v3.services.ForecastMetricsOrBuilder> 
        getKeywordForecastFieldBuilder() {
      if (keywordForecastBuilder_ == null) {
        keywordForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v3.services.ForecastMetrics, com.google.ads.googleads.v3.services.ForecastMetrics.Builder, com.google.ads.googleads.v3.services.ForecastMetricsOrBuilder>(
                getKeywordForecast(),
                getParentForChildren(),
                isClean());
        keywordForecast_ = null;
      }
      return keywordForecastBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.services.KeywordPlanKeywordForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.KeywordPlanKeywordForecast)
  private static final com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast();
  }

  public static com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanKeywordForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanKeywordForecast>() {
    @java.lang.Override
    public KeywordPlanKeywordForecast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordPlanKeywordForecast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordPlanKeywordForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanKeywordForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

