/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.MobileDeviceConstant;
import com.google.ads.googleads.v3.services.stub.MobileDeviceConstantServiceStub;
import com.google.ads.googleads.v3.services.stub.MobileDeviceConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch mobile device constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient = MobileDeviceConstantServiceClient.create()) {
 *   String formattedResourceName = MobileDeviceConstantServiceClient.formatMobileDeviceConstantName("[MOBILE_DEVICE_CONSTANT]");
 *   MobileDeviceConstant response = mobileDeviceConstantServiceClient.getMobileDeviceConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the mobileDeviceConstantServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * MobileDeviceConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * MobileDeviceConstantServiceSettings mobileDeviceConstantServiceSettings =
 *     MobileDeviceConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient =
 *     MobileDeviceConstantServiceClient.create(mobileDeviceConstantServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MobileDeviceConstantServiceSettings mobileDeviceConstantServiceSettings =
 *     MobileDeviceConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient =
 *     MobileDeviceConstantServiceClient.create(mobileDeviceConstantServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class MobileDeviceConstantServiceClient implements BackgroundResource {
  private final MobileDeviceConstantServiceSettings settings;
  private final MobileDeviceConstantServiceStub stub;

  private static final PathTemplate MOBILE_DEVICE_CONSTANT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("mobileDeviceConstants/{mobile_device_constant}");

  /**
   * Formats a string containing the fully-qualified path to represent a mobile_device_constant
   * resource.
   *
   * @deprecated Use the {@link MobileDeviceConstantName} class instead.
   */
  @Deprecated
  public static final String formatMobileDeviceConstantName(String mobileDeviceConstant) {
    return MOBILE_DEVICE_CONSTANT_PATH_TEMPLATE.instantiate(
        "mobile_device_constant", mobileDeviceConstant);
  }

  /**
   * Parses the mobile_device_constant from the given fully-qualified path which represents a
   * mobile_device_constant resource.
   *
   * @deprecated Use the {@link MobileDeviceConstantName} class instead.
   */
  @Deprecated
  public static final String parseMobileDeviceConstantFromMobileDeviceConstantName(
      String mobileDeviceConstantName) {
    return MOBILE_DEVICE_CONSTANT_PATH_TEMPLATE
        .parse(mobileDeviceConstantName)
        .get("mobile_device_constant");
  }

  /** Constructs an instance of MobileDeviceConstantServiceClient with default settings. */
  public static final MobileDeviceConstantServiceClient create() throws IOException {
    return create(MobileDeviceConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MobileDeviceConstantServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final MobileDeviceConstantServiceClient create(
      MobileDeviceConstantServiceSettings settings) throws IOException {
    return new MobileDeviceConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of MobileDeviceConstantServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use MobileDeviceConstantServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MobileDeviceConstantServiceClient create(
      MobileDeviceConstantServiceStub stub) {
    return new MobileDeviceConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of MobileDeviceConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected MobileDeviceConstantServiceClient(MobileDeviceConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((MobileDeviceConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MobileDeviceConstantServiceClient(MobileDeviceConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MobileDeviceConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MobileDeviceConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile device constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient = MobileDeviceConstantServiceClient.create()) {
   *   String formattedResourceName = MobileDeviceConstantServiceClient.formatMobileDeviceConstantName("[MOBILE_DEVICE_CONSTANT]");
   *   MobileDeviceConstant response = mobileDeviceConstantServiceClient.getMobileDeviceConstant(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. Resource name of the mobile device to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MobileDeviceConstant getMobileDeviceConstant(String resourceName) {
    MOBILE_DEVICE_CONSTANT_PATH_TEMPLATE.validate(resourceName, "getMobileDeviceConstant");
    GetMobileDeviceConstantRequest request =
        GetMobileDeviceConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getMobileDeviceConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile device constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient = MobileDeviceConstantServiceClient.create()) {
   *   String formattedResourceName = MobileDeviceConstantServiceClient.formatMobileDeviceConstantName("[MOBILE_DEVICE_CONSTANT]");
   *   GetMobileDeviceConstantRequest request = GetMobileDeviceConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   MobileDeviceConstant response = mobileDeviceConstantServiceClient.getMobileDeviceConstant(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MobileDeviceConstant getMobileDeviceConstant(
      GetMobileDeviceConstantRequest request) {
    return getMobileDeviceConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile device constant in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileDeviceConstantServiceClient mobileDeviceConstantServiceClient = MobileDeviceConstantServiceClient.create()) {
   *   String formattedResourceName = MobileDeviceConstantServiceClient.formatMobileDeviceConstantName("[MOBILE_DEVICE_CONSTANT]");
   *   GetMobileDeviceConstantRequest request = GetMobileDeviceConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;MobileDeviceConstant&gt; future = mobileDeviceConstantServiceClient.getMobileDeviceConstantCallable().futureCall(request);
   *   // Do something
   *   MobileDeviceConstant response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetMobileDeviceConstantRequest, MobileDeviceConstant>
      getMobileDeviceConstantCallable() {
    return stub.getMobileDeviceConstantCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
