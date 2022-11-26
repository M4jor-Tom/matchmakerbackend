package com.warframe.matchmakerbackend.domain;

public class Node {
	private NodeId nodeId;

	private String name;
	
	public Node(NodeId nodeId, String name) {
		this.setNodeId(nodeId);
		this.setName(name);
	}
	
	public NodeId getNodeId() {
		return nodeId;
	}

	public void setNodeId(NodeId nodeId) {
		this.nodeId = nodeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
