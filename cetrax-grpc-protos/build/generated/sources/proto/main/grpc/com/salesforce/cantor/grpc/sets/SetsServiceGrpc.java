package io.cetrax.grpc.sets;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class SetsServiceGrpc {

  private SetsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.cetrax.grpc.sets.SetsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.CreateRequest,
      io.cetrax.grpc.sets.VoidResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = io.cetrax.grpc.sets.CreateRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.CreateRequest,
      io.cetrax.grpc.sets.VoidResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.CreateRequest, io.cetrax.grpc.sets.VoidResponse> getCreateMethod;
    if ((getCreateMethod = SetsServiceGrpc.getCreateMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getCreateMethod = SetsServiceGrpc.getCreateMethod) == null) {
          SetsServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.CreateRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DropRequest,
      io.cetrax.grpc.sets.VoidResponse> getDropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "drop",
      requestType = io.cetrax.grpc.sets.DropRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DropRequest,
      io.cetrax.grpc.sets.VoidResponse> getDropMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DropRequest, io.cetrax.grpc.sets.VoidResponse> getDropMethod;
    if ((getDropMethod = SetsServiceGrpc.getDropMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getDropMethod = SetsServiceGrpc.getDropMethod) == null) {
          SetsServiceGrpc.getDropMethod = getDropMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.DropRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "drop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.GetRequest,
      io.cetrax.grpc.sets.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = io.cetrax.grpc.sets.GetRequest.class,
      responseType = io.cetrax.grpc.sets.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.GetRequest,
      io.cetrax.grpc.sets.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.GetRequest, io.cetrax.grpc.sets.GetResponse> getGetMethod;
    if ((getGetMethod = SetsServiceGrpc.getGetMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getGetMethod = SetsServiceGrpc.getGetMethod) == null) {
          SetsServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.GetRequest, io.cetrax.grpc.sets.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.GetResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.UnionRequest,
      io.cetrax.grpc.sets.UnionResponse> getUnionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "union",
      requestType = io.cetrax.grpc.sets.UnionRequest.class,
      responseType = io.cetrax.grpc.sets.UnionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.UnionRequest,
      io.cetrax.grpc.sets.UnionResponse> getUnionMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.UnionRequest, io.cetrax.grpc.sets.UnionResponse> getUnionMethod;
    if ((getUnionMethod = SetsServiceGrpc.getUnionMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getUnionMethod = SetsServiceGrpc.getUnionMethod) == null) {
          SetsServiceGrpc.getUnionMethod = getUnionMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.UnionRequest, io.cetrax.grpc.sets.UnionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "union"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.UnionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.UnionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUnionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IntersectRequest,
      io.cetrax.grpc.sets.IntersectResponse> getIntersectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "intersect",
      requestType = io.cetrax.grpc.sets.IntersectRequest.class,
      responseType = io.cetrax.grpc.sets.IntersectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IntersectRequest,
      io.cetrax.grpc.sets.IntersectResponse> getIntersectMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IntersectRequest, io.cetrax.grpc.sets.IntersectResponse> getIntersectMethod;
    if ((getIntersectMethod = SetsServiceGrpc.getIntersectMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getIntersectMethod = SetsServiceGrpc.getIntersectMethod) == null) {
          SetsServiceGrpc.getIntersectMethod = getIntersectMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.IntersectRequest, io.cetrax.grpc.sets.IntersectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "intersect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.IntersectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.IntersectResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIntersectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.PopRequest,
      io.cetrax.grpc.sets.PopResponse> getPopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pop",
      requestType = io.cetrax.grpc.sets.PopRequest.class,
      responseType = io.cetrax.grpc.sets.PopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.PopRequest,
      io.cetrax.grpc.sets.PopResponse> getPopMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.PopRequest, io.cetrax.grpc.sets.PopResponse> getPopMethod;
    if ((getPopMethod = SetsServiceGrpc.getPopMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getPopMethod = SetsServiceGrpc.getPopMethod) == null) {
          SetsServiceGrpc.getPopMethod = getPopMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.PopRequest, io.cetrax.grpc.sets.PopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.PopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.PopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddRequest,
      io.cetrax.grpc.sets.VoidResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = io.cetrax.grpc.sets.AddRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddRequest,
      io.cetrax.grpc.sets.VoidResponse> getAddMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddRequest, io.cetrax.grpc.sets.VoidResponse> getAddMethod;
    if ((getAddMethod = SetsServiceGrpc.getAddMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getAddMethod = SetsServiceGrpc.getAddMethod) == null) {
          SetsServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.AddRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddBatchRequest,
      io.cetrax.grpc.sets.VoidResponse> getAddBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBatch",
      requestType = io.cetrax.grpc.sets.AddBatchRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddBatchRequest,
      io.cetrax.grpc.sets.VoidResponse> getAddBatchMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.AddBatchRequest, io.cetrax.grpc.sets.VoidResponse> getAddBatchMethod;
    if ((getAddBatchMethod = SetsServiceGrpc.getAddBatchMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getAddBatchMethod = SetsServiceGrpc.getAddBatchMethod) == null) {
          SetsServiceGrpc.getAddBatchMethod = getAddBatchMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.AddBatchRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.AddBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = io.cetrax.grpc.sets.DeleteRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteRequest, io.cetrax.grpc.sets.VoidResponse> getDeleteMethod;
    if ((getDeleteMethod = SetsServiceGrpc.getDeleteMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getDeleteMethod = SetsServiceGrpc.getDeleteMethod) == null) {
          SetsServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.DeleteRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBetweenRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteBetweenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBetween",
      requestType = io.cetrax.grpc.sets.DeleteBetweenRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBetweenRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteBetweenMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBetweenRequest, io.cetrax.grpc.sets.VoidResponse> getDeleteBetweenMethod;
    if ((getDeleteBetweenMethod = SetsServiceGrpc.getDeleteBetweenMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getDeleteBetweenMethod = SetsServiceGrpc.getDeleteBetweenMethod) == null) {
          SetsServiceGrpc.getDeleteBetweenMethod = getDeleteBetweenMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.DeleteBetweenRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBetween"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DeleteBetweenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteBetweenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteEntryRequest,
      io.cetrax.grpc.sets.DeleteEntryResponse> getDeleteEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEntry",
      requestType = io.cetrax.grpc.sets.DeleteEntryRequest.class,
      responseType = io.cetrax.grpc.sets.DeleteEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteEntryRequest,
      io.cetrax.grpc.sets.DeleteEntryResponse> getDeleteEntryMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteEntryRequest, io.cetrax.grpc.sets.DeleteEntryResponse> getDeleteEntryMethod;
    if ((getDeleteEntryMethod = SetsServiceGrpc.getDeleteEntryMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getDeleteEntryMethod = SetsServiceGrpc.getDeleteEntryMethod) == null) {
          SetsServiceGrpc.getDeleteEntryMethod = getDeleteEntryMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.DeleteEntryRequest, io.cetrax.grpc.sets.DeleteEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DeleteEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DeleteEntryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBatchRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBatch",
      requestType = io.cetrax.grpc.sets.DeleteBatchRequest.class,
      responseType = io.cetrax.grpc.sets.VoidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBatchRequest,
      io.cetrax.grpc.sets.VoidResponse> getDeleteBatchMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.DeleteBatchRequest, io.cetrax.grpc.sets.VoidResponse> getDeleteBatchMethod;
    if ((getDeleteBatchMethod = SetsServiceGrpc.getDeleteBatchMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getDeleteBatchMethod = SetsServiceGrpc.getDeleteBatchMethod) == null) {
          SetsServiceGrpc.getDeleteBatchMethod = getDeleteBatchMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.DeleteBatchRequest, io.cetrax.grpc.sets.VoidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.DeleteBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.VoidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.KeysRequest,
      io.cetrax.grpc.sets.KeysResponse> getKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "keys",
      requestType = io.cetrax.grpc.sets.KeysRequest.class,
      responseType = io.cetrax.grpc.sets.KeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.KeysRequest,
      io.cetrax.grpc.sets.KeysResponse> getKeysMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.KeysRequest, io.cetrax.grpc.sets.KeysResponse> getKeysMethod;
    if ((getKeysMethod = SetsServiceGrpc.getKeysMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getKeysMethod = SetsServiceGrpc.getKeysMethod) == null) {
          SetsServiceGrpc.getKeysMethod = getKeysMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.KeysRequest, io.cetrax.grpc.sets.KeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "keys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.KeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.KeysResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SetsRequest,
      io.cetrax.grpc.sets.SetsResponse> getSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sets",
      requestType = io.cetrax.grpc.sets.SetsRequest.class,
      responseType = io.cetrax.grpc.sets.SetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SetsRequest,
      io.cetrax.grpc.sets.SetsResponse> getSetsMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SetsRequest, io.cetrax.grpc.sets.SetsResponse> getSetsMethod;
    if ((getSetsMethod = SetsServiceGrpc.getSetsMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getSetsMethod = SetsServiceGrpc.getSetsMethod) == null) {
          SetsServiceGrpc.getSetsMethod = getSetsMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.SetsRequest, io.cetrax.grpc.sets.SetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.SetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.SetsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SizeRequest,
      io.cetrax.grpc.sets.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "size",
      requestType = io.cetrax.grpc.sets.SizeRequest.class,
      responseType = io.cetrax.grpc.sets.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SizeRequest,
      io.cetrax.grpc.sets.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.SizeRequest, io.cetrax.grpc.sets.SizeResponse> getSizeMethod;
    if ((getSizeMethod = SetsServiceGrpc.getSizeMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getSizeMethod = SetsServiceGrpc.getSizeMethod) == null) {
          SetsServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.SizeRequest, io.cetrax.grpc.sets.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.SizeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.WeightRequest,
      io.cetrax.grpc.sets.WeightResponse> getWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "weight",
      requestType = io.cetrax.grpc.sets.WeightRequest.class,
      responseType = io.cetrax.grpc.sets.WeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.WeightRequest,
      io.cetrax.grpc.sets.WeightResponse> getWeightMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.WeightRequest, io.cetrax.grpc.sets.WeightResponse> getWeightMethod;
    if ((getWeightMethod = SetsServiceGrpc.getWeightMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getWeightMethod = SetsServiceGrpc.getWeightMethod) == null) {
          SetsServiceGrpc.getWeightMethod = getWeightMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.WeightRequest, io.cetrax.grpc.sets.WeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "weight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.WeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.WeightResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.TimestampRequest,
      io.cetrax.grpc.sets.TimestampResponse> getTimestampMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "timestamp",
      requestType = io.cetrax.grpc.sets.TimestampRequest.class,
      responseType = io.cetrax.grpc.sets.TimestampResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.TimestampRequest,
      io.cetrax.grpc.sets.TimestampResponse> getTimestampMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.TimestampRequest, io.cetrax.grpc.sets.TimestampResponse> getTimestampMethod;
    if ((getTimestampMethod = SetsServiceGrpc.getTimestampMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getTimestampMethod = SetsServiceGrpc.getTimestampMethod) == null) {
          SetsServiceGrpc.getTimestampMethod = getTimestampMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.TimestampRequest, io.cetrax.grpc.sets.TimestampResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "timestamp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.TimestampRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.TimestampResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTimestampMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IncRequest,
      io.cetrax.grpc.sets.IncResponse> getIncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inc",
      requestType = io.cetrax.grpc.sets.IncRequest.class,
      responseType = io.cetrax.grpc.sets.IncResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IncRequest,
      io.cetrax.grpc.sets.IncResponse> getIncMethod() {
    io.grpc.MethodDescriptor<io.cetrax.grpc.sets.IncRequest, io.cetrax.grpc.sets.IncResponse> getIncMethod;
    if ((getIncMethod = SetsServiceGrpc.getIncMethod) == null) {
      synchronized (SetsServiceGrpc.class) {
        if ((getIncMethod = SetsServiceGrpc.getIncMethod) == null) {
          SetsServiceGrpc.getIncMethod = getIncMethod =
              io.grpc.MethodDescriptor.<io.cetrax.grpc.sets.IncRequest, io.cetrax.grpc.sets.IncResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "inc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.IncRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.cetrax.grpc.sets.IncResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetsServiceStub>() {
        @java.lang.Override
        public SetsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetsServiceStub(channel, callOptions);
        }
      };
    return SetsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SetsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetsServiceBlockingV2Stub>() {
        @java.lang.Override
        public SetsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return SetsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetsServiceBlockingStub>() {
        @java.lang.Override
        public SetsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetsServiceBlockingStub(channel, callOptions);
        }
      };
    return SetsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetsServiceFutureStub>() {
        @java.lang.Override
        public SetsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetsServiceFutureStub(channel, callOptions);
        }
      };
    return SetsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(io.cetrax.grpc.sets.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void drop(io.cetrax.grpc.sets.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropMethod(), responseObserver);
    }

    /**
     */
    default void get(io.cetrax.grpc.sets.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void union(io.cetrax.grpc.sets.UnionRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.UnionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnionMethod(), responseObserver);
    }

    /**
     */
    default void intersect(io.cetrax.grpc.sets.IntersectRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IntersectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntersectMethod(), responseObserver);
    }

    /**
     */
    default void pop(io.cetrax.grpc.sets.PopRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.PopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPopMethod(), responseObserver);
    }

    /**
     */
    default void add(io.cetrax.grpc.sets.AddRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    default void addBatch(io.cetrax.grpc.sets.AddBatchRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBatchMethod(), responseObserver);
    }

    /**
     */
    default void delete(io.cetrax.grpc.sets.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    default void deleteBetween(io.cetrax.grpc.sets.DeleteBetweenRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBetweenMethod(), responseObserver);
    }

    /**
     */
    default void deleteEntry(io.cetrax.grpc.sets.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.DeleteEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEntryMethod(), responseObserver);
    }

    /**
     */
    default void deleteBatch(io.cetrax.grpc.sets.DeleteBatchRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBatchMethod(), responseObserver);
    }

    /**
     */
    default void keys(io.cetrax.grpc.sets.KeysRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.KeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeysMethod(), responseObserver);
    }

    /**
     */
    default void sets(io.cetrax.grpc.sets.SetsRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetsMethod(), responseObserver);
    }

    /**
     */
    default void size(io.cetrax.grpc.sets.SizeRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     */
    default void weight(io.cetrax.grpc.sets.WeightRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.WeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWeightMethod(), responseObserver);
    }

    /**
     */
    default void timestamp(io.cetrax.grpc.sets.TimestampRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.TimestampResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTimestampMethod(), responseObserver);
    }

    /**
     */
    default void inc(io.cetrax.grpc.sets.IncRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IncResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SetsService.
   */
  public static abstract class SetsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SetsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SetsService.
   */
  public static final class SetsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SetsServiceStub> {
    private SetsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetsServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.cetrax.grpc.sets.CreateRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drop(io.cetrax.grpc.sets.DropRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.cetrax.grpc.sets.GetRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void union(io.cetrax.grpc.sets.UnionRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.UnionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void intersect(io.cetrax.grpc.sets.IntersectRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IntersectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntersectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pop(io.cetrax.grpc.sets.PopRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.PopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(io.cetrax.grpc.sets.AddRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBatch(io.cetrax.grpc.sets.AddBatchRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(io.cetrax.grpc.sets.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBetween(io.cetrax.grpc.sets.DeleteBetweenRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBetweenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEntry(io.cetrax.grpc.sets.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.DeleteEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBatch(io.cetrax.grpc.sets.DeleteBatchRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void keys(io.cetrax.grpc.sets.KeysRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.KeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sets(io.cetrax.grpc.sets.SetsRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void size(io.cetrax.grpc.sets.SizeRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void weight(io.cetrax.grpc.sets.WeightRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.WeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void timestamp(io.cetrax.grpc.sets.TimestampRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.TimestampResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTimestampMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inc(io.cetrax.grpc.sets.IncRequest request,
        io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IncResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SetsService.
   */
  public static final class SetsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SetsServiceBlockingV2Stub> {
    private SetsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse create(io.cetrax.grpc.sets.CreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse drop(io.cetrax.grpc.sets.DropRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.GetResponse get(io.cetrax.grpc.sets.GetRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.UnionResponse union(io.cetrax.grpc.sets.UnionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUnionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.IntersectResponse intersect(io.cetrax.grpc.sets.IntersectRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getIntersectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.PopResponse pop(io.cetrax.grpc.sets.PopRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPopMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse add(io.cetrax.grpc.sets.AddRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse addBatch(io.cetrax.grpc.sets.AddBatchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getAddBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse delete(io.cetrax.grpc.sets.DeleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse deleteBetween(io.cetrax.grpc.sets.DeleteBetweenRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteBetweenMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.DeleteEntryResponse deleteEntry(io.cetrax.grpc.sets.DeleteEntryRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse deleteBatch(io.cetrax.grpc.sets.DeleteBatchRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.KeysResponse keys(io.cetrax.grpc.sets.KeysRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.SetsResponse sets(io.cetrax.grpc.sets.SetsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.SizeResponse size(io.cetrax.grpc.sets.SizeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.WeightResponse weight(io.cetrax.grpc.sets.WeightRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.TimestampResponse timestamp(io.cetrax.grpc.sets.TimestampRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getTimestampMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.IncResponse inc(io.cetrax.grpc.sets.IncRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getIncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service SetsService.
   */
  public static final class SetsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SetsServiceBlockingStub> {
    private SetsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse create(io.cetrax.grpc.sets.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse drop(io.cetrax.grpc.sets.DropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.GetResponse get(io.cetrax.grpc.sets.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.UnionResponse union(io.cetrax.grpc.sets.UnionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.IntersectResponse intersect(io.cetrax.grpc.sets.IntersectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntersectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.PopResponse pop(io.cetrax.grpc.sets.PopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPopMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse add(io.cetrax.grpc.sets.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse addBatch(io.cetrax.grpc.sets.AddBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse delete(io.cetrax.grpc.sets.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse deleteBetween(io.cetrax.grpc.sets.DeleteBetweenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBetweenMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.DeleteEntryResponse deleteEntry(io.cetrax.grpc.sets.DeleteEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.VoidResponse deleteBatch(io.cetrax.grpc.sets.DeleteBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.KeysResponse keys(io.cetrax.grpc.sets.KeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.SetsResponse sets(io.cetrax.grpc.sets.SetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.SizeResponse size(io.cetrax.grpc.sets.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.WeightResponse weight(io.cetrax.grpc.sets.WeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.TimestampResponse timestamp(io.cetrax.grpc.sets.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTimestampMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cetrax.grpc.sets.IncResponse inc(io.cetrax.grpc.sets.IncRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SetsService.
   */
  public static final class SetsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SetsServiceFutureStub> {
    private SetsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> create(
        io.cetrax.grpc.sets.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> drop(
        io.cetrax.grpc.sets.DropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.GetResponse> get(
        io.cetrax.grpc.sets.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.UnionResponse> union(
        io.cetrax.grpc.sets.UnionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.IntersectResponse> intersect(
        io.cetrax.grpc.sets.IntersectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntersectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.PopResponse> pop(
        io.cetrax.grpc.sets.PopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> add(
        io.cetrax.grpc.sets.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> addBatch(
        io.cetrax.grpc.sets.AddBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> delete(
        io.cetrax.grpc.sets.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> deleteBetween(
        io.cetrax.grpc.sets.DeleteBetweenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBetweenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.DeleteEntryResponse> deleteEntry(
        io.cetrax.grpc.sets.DeleteEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.VoidResponse> deleteBatch(
        io.cetrax.grpc.sets.DeleteBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.KeysResponse> keys(
        io.cetrax.grpc.sets.KeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.SetsResponse> sets(
        io.cetrax.grpc.sets.SetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.SizeResponse> size(
        io.cetrax.grpc.sets.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.WeightResponse> weight(
        io.cetrax.grpc.sets.WeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.TimestampResponse> timestamp(
        io.cetrax.grpc.sets.TimestampRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTimestampMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cetrax.grpc.sets.IncResponse> inc(
        io.cetrax.grpc.sets.IncRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DROP = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UNION = 3;
  private static final int METHODID_INTERSECT = 4;
  private static final int METHODID_POP = 5;
  private static final int METHODID_ADD = 6;
  private static final int METHODID_ADD_BATCH = 7;
  private static final int METHODID_DELETE = 8;
  private static final int METHODID_DELETE_BETWEEN = 9;
  private static final int METHODID_DELETE_ENTRY = 10;
  private static final int METHODID_DELETE_BATCH = 11;
  private static final int METHODID_KEYS = 12;
  private static final int METHODID_SETS = 13;
  private static final int METHODID_SIZE = 14;
  private static final int METHODID_WEIGHT = 15;
  private static final int METHODID_TIMESTAMP = 16;
  private static final int METHODID_INC = 17;

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
          serviceImpl.create((io.cetrax.grpc.sets.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_DROP:
          serviceImpl.drop((io.cetrax.grpc.sets.DropRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.cetrax.grpc.sets.GetRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.GetResponse>) responseObserver);
          break;
        case METHODID_UNION:
          serviceImpl.union((io.cetrax.grpc.sets.UnionRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.UnionResponse>) responseObserver);
          break;
        case METHODID_INTERSECT:
          serviceImpl.intersect((io.cetrax.grpc.sets.IntersectRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IntersectResponse>) responseObserver);
          break;
        case METHODID_POP:
          serviceImpl.pop((io.cetrax.grpc.sets.PopRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.PopResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((io.cetrax.grpc.sets.AddRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_ADD_BATCH:
          serviceImpl.addBatch((io.cetrax.grpc.sets.AddBatchRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.cetrax.grpc.sets.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE_BETWEEN:
          serviceImpl.deleteBetween((io.cetrax.grpc.sets.DeleteBetweenRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTRY:
          serviceImpl.deleteEntry((io.cetrax.grpc.sets.DeleteEntryRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.DeleteEntryResponse>) responseObserver);
          break;
        case METHODID_DELETE_BATCH:
          serviceImpl.deleteBatch((io.cetrax.grpc.sets.DeleteBatchRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.VoidResponse>) responseObserver);
          break;
        case METHODID_KEYS:
          serviceImpl.keys((io.cetrax.grpc.sets.KeysRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.KeysResponse>) responseObserver);
          break;
        case METHODID_SETS:
          serviceImpl.sets((io.cetrax.grpc.sets.SetsRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SetsResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((io.cetrax.grpc.sets.SizeRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.SizeResponse>) responseObserver);
          break;
        case METHODID_WEIGHT:
          serviceImpl.weight((io.cetrax.grpc.sets.WeightRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.WeightResponse>) responseObserver);
          break;
        case METHODID_TIMESTAMP:
          serviceImpl.timestamp((io.cetrax.grpc.sets.TimestampRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.TimestampResponse>) responseObserver);
          break;
        case METHODID_INC:
          serviceImpl.inc((io.cetrax.grpc.sets.IncRequest) request,
              (io.grpc.stub.StreamObserver<io.cetrax.grpc.sets.IncResponse>) responseObserver);
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
              io.cetrax.grpc.sets.CreateRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.DropRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_DROP)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.GetRequest,
              io.cetrax.grpc.sets.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getUnionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.UnionRequest,
              io.cetrax.grpc.sets.UnionResponse>(
                service, METHODID_UNION)))
        .addMethod(
          getIntersectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.IntersectRequest,
              io.cetrax.grpc.sets.IntersectResponse>(
                service, METHODID_INTERSECT)))
        .addMethod(
          getPopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.PopRequest,
              io.cetrax.grpc.sets.PopResponse>(
                service, METHODID_POP)))
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.AddRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getAddBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.AddBatchRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_ADD_BATCH)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.DeleteRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getDeleteBetweenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.DeleteBetweenRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_DELETE_BETWEEN)))
        .addMethod(
          getDeleteEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.DeleteEntryRequest,
              io.cetrax.grpc.sets.DeleteEntryResponse>(
                service, METHODID_DELETE_ENTRY)))
        .addMethod(
          getDeleteBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.DeleteBatchRequest,
              io.cetrax.grpc.sets.VoidResponse>(
                service, METHODID_DELETE_BATCH)))
        .addMethod(
          getKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.KeysRequest,
              io.cetrax.grpc.sets.KeysResponse>(
                service, METHODID_KEYS)))
        .addMethod(
          getSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.SetsRequest,
              io.cetrax.grpc.sets.SetsResponse>(
                service, METHODID_SETS)))
        .addMethod(
          getSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.SizeRequest,
              io.cetrax.grpc.sets.SizeResponse>(
                service, METHODID_SIZE)))
        .addMethod(
          getWeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.WeightRequest,
              io.cetrax.grpc.sets.WeightResponse>(
                service, METHODID_WEIGHT)))
        .addMethod(
          getTimestampMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.TimestampRequest,
              io.cetrax.grpc.sets.TimestampResponse>(
                service, METHODID_TIMESTAMP)))
        .addMethod(
          getIncMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cetrax.grpc.sets.IncRequest,
              io.cetrax.grpc.sets.IncResponse>(
                service, METHODID_INC)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SetsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateMethod())
              .addMethod(getDropMethod())
              .addMethod(getGetMethod())
              .addMethod(getUnionMethod())
              .addMethod(getIntersectMethod())
              .addMethod(getPopMethod())
              .addMethod(getAddMethod())
              .addMethod(getAddBatchMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeleteBetweenMethod())
              .addMethod(getDeleteEntryMethod())
              .addMethod(getDeleteBatchMethod())
              .addMethod(getKeysMethod())
              .addMethod(getSetsMethod())
              .addMethod(getSizeMethod())
              .addMethod(getWeightMethod())
              .addMethod(getTimestampMethod())
              .addMethod(getIncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
