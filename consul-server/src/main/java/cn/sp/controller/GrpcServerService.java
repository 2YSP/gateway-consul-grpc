package cn.sp.controller;


import cn.sp.lib.HelloReply;
import cn.sp.lib.HelloRequest;
import cn.sp.lib.SimpleGrpc;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

import io.grpc.stub.StreamObserver;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */

@GrpcService(SimpleGrpc.class)
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello =============> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
