package com.warframe.matchmakerbackend.domain;

public class Node {
	private NodeId nodeId;

	private String name;
	
	private long waitingPlayersCount;

	public Node() {
		this(NodeId.NO_ID, "", 0);
	}

	public Node(NodeId nodeId, String name, int waitingPlayersCount) {
		super();
		
		this.setNodeId(nodeId);
		this.setName(name);
		this.setWaitingPlayersCount(waitingPlayersCount);
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
	
	public long getWaitingPlayersCount() {
		return waitingPlayersCount;
	}

	public void setWaitingPlayersCount(long waitingPlayersCount) {
		this.waitingPlayersCount = waitingPlayersCount;
	}
}
