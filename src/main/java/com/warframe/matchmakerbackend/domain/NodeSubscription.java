package com.warframe.matchmakerbackend.domain;

public class NodeSubscription {
	private NodeId nodeId;
	private boolean ifTrueAddElseRemove;
	
	public NodeSubscription() {
		this(NodeId.NO_ID, true);
	}
	
	public NodeSubscription(NodeId nodeId, boolean ifTrueAddElseRemove) {
		super();
		
		this.nodeId = nodeId;
		this.ifTrueAddElseRemove = ifTrueAddElseRemove;
	}

	public NodeId getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(NodeId nodeId) {
		this.nodeId = nodeId;
	}
	
	public boolean isIfTrueAddElseRemove() {
		return ifTrueAddElseRemove;
	}
	
	public void setIfTrueAddElseRemove(boolean ifTrueAddElseRemove) {
		this.ifTrueAddElseRemove = ifTrueAddElseRemove;
	}
}