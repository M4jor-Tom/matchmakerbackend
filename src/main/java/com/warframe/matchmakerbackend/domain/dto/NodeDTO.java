package com.warframe.matchmakerbackend.domain.dto;

import java.io.Serializable;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeId;

/**
 * Properties are annotated @SuppressWarnings("unused")
 * because they are indeed used for serialization,
 * and this can't be seen by compiler.
 */
public class NodeDTO implements Serializable{
	
	private static final long serialVersionUID = 1808231608234603104L;
	
	
	@SuppressWarnings("unused")
	private NodeId nodeId;
	
	@SuppressWarnings("unused")
	private String name;
	
	@SuppressWarnings("unused")
	private long waitingPlayersCount;

	public NodeDTO(Node node, long waitingPlayersCount) {
		super();
		
		this.nodeId = node.getNodeId();
		this.name = node.getName();
		this.waitingPlayersCount = waitingPlayersCount;
	}
}
