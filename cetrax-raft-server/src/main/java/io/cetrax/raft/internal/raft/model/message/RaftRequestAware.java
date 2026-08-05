package io.cetrax.raft.internal.raft.model.message;

import io.cetrax.raft.raft.proto.RaftRequest;

public interface RaftRequestAware {

    void populate(RaftRequest.Builder builder);

}
