package io.cetrax.grpc.objects;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ObjectsServiceGrpc {

  private ObjectsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.cetrax.grpc.objects.ObjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.CreateRequest,
      io.cetrax.grpc.objects.VoidResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = io.cetrax.grpc.objects.CreateRequest.class,
      responseType = io.cetrax.grpc.objects.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.CreateRequest,
      io.cetrax.grpc.objects.VoidResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.CreateRequest, io.cetrax.grpc.objects.VoidResponse> getCreateMethod;
    if ((getCreateMethod = ObjectsServiceGrpc.getCreateMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getCreateMethod = ObjectsServiceGrpc.getCreateMethod) == null) {
          ObjectsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.CreateRequest, io.cetrax.grpc.objects.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DropRequest,
      io.cetrax.grpc.objects.VoidResponse> getDropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "drop",
      requestType = io.cetrax.grpc.objects.DropRequest.class,
      responseType = io.cetrax.grpc.objects.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DropRequest,
      io.cetrax.grpc.objects.VoidResponse> getDropMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DropRequest, io.cetrax.grpc.objects.VoidResponse> getDropMethod;
    if ((getDropMethod = ObjectsServiceGrpc.getDropMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getDropMethod = ObjectsServiceGrpc.getDropMethod) == null) {
          ObjectsServiceGrpc.getDropMethod = getDropMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.DropRequest, io.cetrax.grpc.objects.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "drop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.DropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.KeysRequest,
      io.cetrax.grpc.objects.KeysResponse> getKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "keys",
      requestType = io.cetrax.grpc.objects.KeysRequest.class,
      responseType = io.cetrax.grpc.objects.KeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.KeysRequest,
      io.cetrax.grpc.objects.KeysResponse> getKeysMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.KeysRequest, io.cetrax.grpc.objects.KeysResponse> getKeysMethod;
    if ((getKeysMethod = ObjectsServiceGrpc.getKeysMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getKeysMethod = ObjectsServiceGrpc.getKeysMethod) == null) {
          ObjectsServiceGrpc.getKeysMethod = getKeysMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.KeysRequest, io.cetrax.grpc.objects.KeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "keys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.KeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.KeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.GetRequest,
      io.cetrax.grpc.objects.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = io.cetrax.grpc.objects.GetRequest.class,
      responseType = io.cetrax.grpc.objects.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.GetRequest,
      io.cetrax.grpc.objects.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.GetRequest, io.cetrax.grpc.objects.GetResponse> getGetMethod;
    if ((getGetMethod = ObjectsServiceGrpc.getGetMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getGetMethod = ObjectsServiceGrpc.getGetMethod) == null) {
          ObjectsServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.GetRequest, io.cetrax.grpc.objects.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.GetResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.StoreRequest,
      io.cetrax.grpc.objects.VoidResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "store",
      requestType = io.cetrax.grpc.objects.StoreRequest.class,
      responseType = io.cetrax.grpc.objects.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.StoreRequest,
      io.cetrax.grpc.objects.VoidResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.StoreRequest, io.cetrax.grpc.objects.VoidResponse> getStoreMethod;
    if ((getStoreMethod = ObjectsServiceGrpc.getStoreMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getStoreMethod = ObjectsServiceGrpc.getStoreMethod) == null) {
          ObjectsServiceGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.StoreRequest, io.cetrax.grpc.objects.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.StoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DeleteRequest,
      io.cetrax.grpc.objects.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = io.cetrax.grpc.objects.DeleteRequest.class,
      responseType = io.cetrax.grpc.objects.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DeleteRequest,
      io.cetrax.grpc.objects.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.DeleteRequest, io.cetrax.grpc.objects.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ObjectsServiceGrpc.getDeleteMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getDeleteMethod = ObjectsServiceGrpc.getDeleteMethod) == null) {
          ObjectsServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.DeleteRequest, io.cetrax.grpc.objects.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.DeleteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.objects.SizeRequest,
      io.cetrax.grpc.objects.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "size",
      requestType = io.cetrax.grpc.objects.SizeRequest.class,
      responseType = io.cetrax.grpc.objects.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.objects.SizeRequest,
      io.cetrax.grpc.objects.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.objects.SizeRequest, io.cetrax.grpc.objects.SizeResponse> getSizeMethod;
    if ((getSizeMethod = ObjectsServiceGrpc.getSizeMethod) == null) {
      synchronized (ObjectsServiceGrpc.class) {
        if ((getSizeMethod = ObjectsServiceGrpc.getSizeMethod) == null) {
          ObjectsServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.objects.SizeRequest, io.cetrax.grpc.objects.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.objects.SizeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObjectsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceStub>() {
        @java.lang.Override
        public ObjectsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectsServiceStub(channel, callOptions);
        }
      };
    return ObjectsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ObjectsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceBlockingV2Stub>() {
        @java.lang.Override
        public ObjectsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ObjectsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObjectsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceBlockingStub>() {
        @java.lang.Override
        public ObjectsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectsServiceBlockingStub(channel, callOptions);
        }
      };
    return ObjectsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObjectsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObjectsServiceFutureStub>() {
        @java.lang.Override
        public ObjectsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObjectsServiceFutureStub(channel, callOptions);
        }
      };
    return ObjectsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(io.cetrax.grpc.objects.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void drop(io.cetrax.grpc.objects.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropMethod(), responseObserver);
    }

    /**
     */
    default void keys(io.cetrax.grpc.objects.KeysRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.KeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeysMethod(), responseObserver);
    }

    /**
     */
    default void get(io.cetrax.grpc.objects.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void store(io.cetrax.grpc.objects.StoreRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    default void delete(io.cetrax.grpc.objects.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    default void size(io.cetrax.grpc.objects.SizeRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ObjectsService.
   */
  public static abstract class ObjectsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ObjectsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ObjectsService.
   */
  public static final class ObjectsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ObjectsServiceStub> {
    private ObjectsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectsServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.cetrax.grpc.objects.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drop(io.cetrax.grpc.objects.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void keys(io.cetrax.grpc.objects.KeysRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.KeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.cetrax.grpc.objects.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void store(io.cetrax.grpc.objects.StoreRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(io.cetrax.grpc.objects.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void size(io.cetrax.grpc.objects.SizeRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ObjectsService.
   */
  public static final class ObjectsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ObjectsServiceBlockingV2Stub> {
    private ObjectsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse create(io.cetrax.grpc.objects.CreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse drop(io.cetrax.grpc.objects.DropRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.KeysResponse keys(io.cetrax.grpc.objects.KeysRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.GetResponse get(io.cetrax.grpc.objects.GetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse store(io.cetrax.grpc.objects.StoreRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.DeleteResponse delete(io.cetrax.grpc.objects.DeleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.SizeResponse size(io.cetrax.grpc.objects.SizeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ObjectsService.
   */
  public static final class ObjectsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ObjectsServiceBlockingStub> {
    private ObjectsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse create(io.cetrax.grpc.objects.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse drop(io.cetrax.grpc.objects.DropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.KeysResponse keys(io.cetrax.grpc.objects.KeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.GetResponse get(io.cetrax.grpc.objects.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.VoidResponse store(io.cetrax.grpc.objects.StoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.DeleteResponse delete(io.cetrax.grpc.objects.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.objects.SizeResponse size(io.cetrax.grpc.objects.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ObjectsService.
   */
  public static final class ObjectsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ObjectsServiceFutureStub> {
    private ObjectsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObjectsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObjectsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.VoidResponse> create(
        io.cetrax.grpc.objects.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.VoidResponse> drop(
        io.cetrax.grpc.objects.DropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.KeysResponse> keys(
        io.cetrax.grpc.objects.KeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.GetResponse> get(
        io.cetrax.grpc.objects.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.VoidResponse> store(
        io.cetrax.grpc.objects.StoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.DeleteResponse> delete(
        io.cetrax.grpc.objects.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.objects.SizeResponse> size(
        io.cetrax.grpc.objects.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DROP = 1;
  private static final int METHODID_KEYS = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_STORE = 4;
  private static final int METHODID_DELETE = 5;
  private static final int METHODID_SIZE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((io.cetrax.grpc.objects.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse>) responseObserver);
          break;
        case METHODID_DROP:
          serviceImpl.drop((io.cetrax.grpc.objects.DropRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse>) responseObserver);
          break;
        case METHODID_KEYS:
          serviceImpl.keys((io.cetrax.grpc.objects.KeysRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.KeysResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.cetrax.grpc.objects.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.GetResponse>) responseObserver);
          break;
        case METHODID_STORE:
          serviceImpl.store((io.cetrax.grpc.objects.StoreRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.cetrax.grpc.objects.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.DeleteResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((io.cetrax.grpc.objects.SizeRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.objects.SizeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.CreateRequest,
              io.cetrax.grpc.objects.VoidResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.DropRequest,
              io.cetrax.grpc.objects.VoidResponse>(
                service, METHODID_DROP)))
        .addMethod(
          getKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.KeysRequest,
              io.cetrax.grpc.objects.KeysResponse>(
                service, METHODID_KEYS)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.GetRequest,
              io.cetrax.grpc.objects.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getStoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.StoreRequest,
              io.cetrax.grpc.objects.VoidResponse>(
                service, METHODID_STORE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.DeleteRequest,
              io.cetrax.grpc.objects.DeleteResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.objects.SizeRequest,
              io.cetrax.grpc.objects.SizeResponse>(
                service, METHODID_SIZE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ObjectsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateMethod())
              .addMethod(getDropMethod())
              .addMethod(getKeysMethod())
              .addMethod(getGetMethod())
              .addMethod(getStoreMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
