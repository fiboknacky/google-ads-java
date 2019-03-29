// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v1.services;

public interface RestatementValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.RestatementValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The restated conversion value. This is the value of the conversion after
   * restatement. For example, to change the value of a conversion from 100 to
   * 70, an adjusted value of 70 should be reported.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue adjusted_value = 1;</code>
   */
  boolean hasAdjustedValue();
  /**
   * <pre>
   * The restated conversion value. This is the value of the conversion after
   * restatement. For example, to change the value of a conversion from 100 to
   * 70, an adjusted value of 70 should be reported.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue adjusted_value = 1;</code>
   */
  com.google.protobuf.DoubleValue getAdjustedValue();
  /**
   * <pre>
   * The restated conversion value. This is the value of the conversion after
   * restatement. For example, to change the value of a conversion from 100 to
   * 70, an adjusted value of 70 should be reported.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue adjusted_value = 1;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getAdjustedValueOrBuilder();

  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code e.g. USD or EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 2;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code e.g. USD or EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 2;</code>
   */
  com.google.protobuf.StringValue getCurrencyCode();
  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code e.g. USD or EUR.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder();
}
