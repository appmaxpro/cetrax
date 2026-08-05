package io.cetrax.grpc.events;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EventsServiceGrpc {

  private EventsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.cetrax.grpc.events.EventsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.GetRequest,
      io.cetrax.grpc.events.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = io.cetrax.grpc.events.GetRequest.class,
      responseType = io.cetrax.grpc.events.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.GetRequest,
      io.cetrax.grpc.events.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.GetRequest, io.cetrax.grpc.events.GetResponse> getGetMethod;
    if ((getGetMethod = EventsServiceGrpc.getGetMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getGetMethod = EventsServiceGrpc.getGetMethod) == null) {
          EventsServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.GetRequest, io.cetrax.grpc.events.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.GetResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.CreateRequest,
      io.cetrax.grpc.events.VoidResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = io.cetrax.grpc.events.CreateRequest.class,
      responseType = io.cetrax.grpc.events.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.CreateRequest,
      io.cetrax.grpc.events.VoidResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.CreateRequest, io.cetrax.grpc.events.VoidResponse> getCreateMethod;
    if ((getCreateMethod = EventsServiceGrpc.getCreateMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getCreateMethod = EventsServiceGrpc.getCreateMethod) == null) {
          EventsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.CreateRequest, io.cetrax.grpc.events.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.DropRequest,
      io.cetrax.grpc.events.VoidResponse> getDropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "drop",
      requestType = io.cetrax.grpc.events.DropRequest.class,
      responseType = io.cetrax.grpc.events.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.DropRequest,
      io.cetrax.grpc.events.VoidResponse> getDropMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.DropRequest, io.cetrax.grpc.events.VoidResponse> getDropMethod;
    if ((getDropMethod = EventsServiceGrpc.getDropMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getDropMethod = EventsServiceGrpc.getDropMethod) == null) {
          EventsServiceGrpc.getDropMethod = getDropMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.DropRequest, io.cetrax.grpc.events.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "drop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.DropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequest,
      io.cetrax.grpc.events.VoidResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "store",
      requestType = io.cetrax.grpc.events.StoreRequest.class,
      responseType = io.cetrax.grpc.events.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequest,
      io.cetrax.grpc.events.VoidResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequest, io.cetrax.grpc.events.VoidResponse> getStoreMethod;
    if ((getStoreMethod = EventsServiceGrpc.getStoreMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getStoreMethod = EventsServiceGrpc.getStoreMethod) == null) {
          EventsServiceGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.StoreRequest, io.cetrax.grpc.events.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.StoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequests,
      io.cetrax.grpc.events.VoidResponse> getStoreBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeBatch",
      requestType = io.cetrax.grpc.events.StoreRequests.class,
      responseType = io.cetrax.grpc.events.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequests,
      io.cetrax.grpc.events.VoidResponse> getStoreBatchMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.StoreRequests, io.cetrax.grpc.events.VoidResponse> getStoreBatchMethod;
    if ((getStoreBatchMethod = EventsServiceGrpc.getStoreBatchMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getStoreBatchMethod = EventsServiceGrpc.getStoreBatchMethod) == null) {
          EventsServiceGrpc.getStoreBatchMethod = getStoreBatchMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.StoreRequests, io.cetrax.grpc.events.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.StoreRequests.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStoreBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.MetadataRequest,
      io.cetrax.grpc.events.MetadataResponse> getMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "metadata",
      requestType = io.cetrax.grpc.events.MetadataRequest.class,
      responseType = io.cetrax.grpc.events.MetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.MetadataRequest,
      io.cetrax.grpc.events.MetadataResponse> getMetadataMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.MetadataRequest, io.cetrax.grpc.events.MetadataResponse> getMetadataMethod;
    if ((getMetadataMethod = EventsServiceGrpc.getMetadataMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getMetadataMethod = EventsServiceGrpc.getMetadataMethod) == null) {
          EventsServiceGrpc.getMetadataMethod = getMetadataMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.MetadataRequest, io.cetrax.grpc.events.MetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "metadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.MetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.MetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.DimensionRequest,
      io.cetrax.grpc.events.DimensionResponse> getDimensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dimension",
      requestType = io.cetrax.grpc.events.DimensionRequest.class,
      responseType = io.cetrax.grpc.events.DimensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.DimensionRequest,
      io.cetrax.grpc.events.DimensionResponse> getDimensionMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.DimensionRequest, io.cetrax.grpc.events.DimensionResponse> getDimensionMethod;
    if ((getDimensionMethod = EventsServiceGrpc.getDimensionMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getDimensionMethod = EventsServiceGrpc.getDimensionMethod) == null) {
          EventsServiceGrpc.getDimensionMethod = getDimensionMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.DimensionRequest, io.cetrax.grpc.events.DimensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "dimension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.DimensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.DimensionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDimensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.events.ExpireRequest,
      io.cetrax.grpc.events.VoidResponse> getExpireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "expire",
      requestType = io.cetrax.grpc.events.ExpireRequest.class,
      responseType = io.cetrax.grpc.events.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.events.ExpireRequest,
      io.cetrax.grpc.events.VoidResponse> getExpireMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.events.ExpireRequest, io.cetrax.grpc.events.VoidResponse> getExpireMethod;
    if ((getExpireMethod = EventsServiceGrpc.getExpireMethod) == null) {
      synchronized (EventsServiceGrpc.class) {
        if ((getExpireMethod = EventsServiceGrpc.getExpireMethod) == null) {
          EventsServiceGrpc.getExpireMethod = getExpireMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.events.ExpireRequest, io.cetrax.grpc.events.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "expire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.ExpireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.events.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getExpireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceStub>() {
        @java.lang.Override
        public EventsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceStub(channel, callOptions);
        }
      };
    return EventsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EventsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingV2Stub>() {
        @java.lang.Override
        public EventsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return EventsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceBlockingStub>() {
        @java.lang.Override
        public EventsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceBlockingStub(channel, callOptions);
        }
      };
    return EventsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsServiceFutureStub>() {
        @java.lang.Override
        public EventsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsServiceFutureStub(channel, callOptions);
        }
      };
    return EventsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(io.cetrax.grpc.events.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void create(io.cetrax.grpc.events.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void drop(io.cetrax.grpc.events.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropMethod(), responseObserver);
    }

    /**
     */
    default void store(io.cetrax.grpc.events.StoreRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    default void storeBatch(io.cetrax.grpc.events.StoreRequests request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreBatchMethod(), responseObserver);
    }

    /**
     */
    default void metadata(io.cetrax.grpc.events.MetadataRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.MetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetadataMethod(), responseObserver);
    }

    /**
     */
    default void dimension(io.cetrax.grpc.events.DimensionRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.DimensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDimensionMethod(), responseObserver);
    }

    /**
     */
    default void expire(io.cetrax.grpc.events.ExpireRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpireMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventsService.
   */
  public static abstract class EventsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventsService.
   */
  public static final class EventsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventsServiceStub> {
    private EventsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(io.cetrax.grpc.events.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(io.cetrax.grpc.events.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drop(io.cetrax.grpc.events.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void store(io.cetrax.grpc.events.StoreRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void storeBatch(io.cetrax.grpc.events.StoreRequests request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void metadata(io.cetrax.grpc.events.MetadataRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.MetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dimension(io.cetrax.grpc.events.DimensionRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.DimensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDimensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void expire(io.cetrax.grpc.events.ExpireRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExpireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventsService.
   */
  public static final class EventsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EventsServiceBlockingV2Stub> {
    private EventsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.events.GetResponse get(io.cetrax.grpc.events.GetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse create(io.cetrax.grpc.events.CreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse drop(io.cetrax.grpc.events.DropRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse store(io.cetrax.grpc.events.StoreRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse storeBatch(io.cetrax.grpc.events.StoreRequests request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getStoreBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.MetadataResponse metadata(io.cetrax.grpc.events.MetadataRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.DimensionResponse dimension(io.cetrax.grpc.events.DimensionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDimensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse expire(io.cetrax.grpc.events.ExpireRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExpireMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service EventsService.
   */
  public static final class EventsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventsServiceBlockingStub> {
    private EventsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.events.GetResponse get(io.cetrax.grpc.events.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse create(io.cetrax.grpc.events.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse drop(io.cetrax.grpc.events.DropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse store(io.cetrax.grpc.events.StoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse storeBatch(io.cetrax.grpc.events.StoreRequests request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.MetadataResponse metadata(io.cetrax.grpc.events.MetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.DimensionResponse dimension(io.cetrax.grpc.events.DimensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDimensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.events.VoidResponse expire(io.cetrax.grpc.events.ExpireRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExpireMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventsService.
   */
  public static final class EventsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventsServiceFutureStub> {
    private EventsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.GetResponse> get(
        io.cetrax.grpc.events.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.VoidResponse> create(
        io.cetrax.grpc.events.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.VoidResponse> drop(
        io.cetrax.grpc.events.DropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.VoidResponse> store(
        io.cetrax.grpc.events.StoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.VoidResponse> storeBatch(
        io.cetrax.grpc.events.StoreRequests request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.MetadataResponse> metadata(
        io.cetrax.grpc.events.MetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.DimensionResponse> dimension(
        io.cetrax.grpc.events.DimensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDimensionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.events.VoidResponse> expire(
        io.cetrax.grpc.events.ExpireRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExpireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_DROP = 2;
  private static final int METHODID_STORE = 3;
  private static final int METHODID_STORE_BATCH = 4;
  private static final int METHODID_METADATA = 5;
  private static final int METHODID_DIMENSION = 6;
  private static final int METHODID_EXPIRE = 7;

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
        case METHODID_GET:
          serviceImpl.get((io.cetrax.grpc.events.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.GetResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((io.cetrax.grpc.events.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse>) responseObserver);
          break;
        case METHODID_DROP:
          serviceImpl.drop((io.cetrax.grpc.events.DropRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse>) responseObserver);
          break;
        case METHODID_STORE:
          serviceImpl.store((io.cetrax.grpc.events.StoreRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse>) responseObserver);
          break;
        case METHODID_STORE_BATCH:
          serviceImpl.storeBatch((io.cetrax.grpc.events.StoreRequests) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse>) responseObserver);
          break;
        case METHODID_METADATA:
          serviceImpl.metadata((io.cetrax.grpc.events.MetadataRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.MetadataResponse>) responseObserver);
          break;
        case METHODID_DIMENSION:
          serviceImpl.dimension((io.cetrax.grpc.events.DimensionRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.DimensionResponse>) responseObserver);
          break;
        case METHODID_EXPIRE:
          serviceImpl.expire((io.cetrax.grpc.events.ExpireRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.events.VoidResponse>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.GetRequest,
              io.cetrax.grpc.events.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.CreateRequest,
              io.cetrax.grpc.events.VoidResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.DropRequest,
              io.cetrax.grpc.events.VoidResponse>(
                service, METHODID_DROP)))
        .addMethod(
          getStoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.StoreRequest,
              io.cetrax.grpc.events.VoidResponse>(
                service, METHODID_STORE)))
        .addMethod(
          getStoreBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.StoreRequests,
              io.cetrax.grpc.events.VoidResponse>(
                service, METHODID_STORE_BATCH)))
        .addMethod(
          getMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.MetadataRequest,
              io.cetrax.grpc.events.MetadataResponse>(
                service, METHODID_METADATA)))
        .addMethod(
          getDimensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.DimensionRequest,
              io.cetrax.grpc.events.DimensionResponse>(
                service, METHODID_DIMENSION)))
        .addMethod(
          getExpireMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.events.ExpireRequest,
              io.cetrax.grpc.events.VoidResponse>(
                service, METHODID_EXPIRE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDropMethod())
              .addMethod(getStoreMethod())
              .addMethod(getStoreBatchMethod())
              .addMethod(getMetadataMethod())
              .addMethod(getDimensionMethod())
              .addMethod(getExpireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
