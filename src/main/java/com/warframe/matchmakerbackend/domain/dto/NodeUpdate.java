package com.warframe.matchmakerbackend.domain.dto;

import java.io.Serializable;

import com.warframe.matchmakerbackend.domain.NodeId;

/**
 * Properties are annotated @SuppressWarnings("unused")
 * because they are indeed used for serialization,
 * and this can't be seen by compiler.
 */
public class NodeUpdate implements Serializable{
	
	private static final long serialVersionUID = 1808231608234603104L;
	
	
	@SuppressWarnings("unused")
	private NodeId nodeId;
	
	@SuppressWarnings("unused")
	private long waitingPlayersCount;
	
	@SuppressWarnings("unused")
	private boolean isPlayerSubscribed;

	public NodeUpdate(NodeId nodeId, long waitingPlayersCount, boolean isPlayerSubscribed) {
		super();
		
		this.nodeId = nodeId;
		this.waitingPlayersCount = waitingPlayersCount;
		this.isPlayerSubscribed = isPlayerSubscribed;
	}
}
