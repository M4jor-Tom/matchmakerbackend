package com.warframe.matchmakerbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.NodeId;
import com.warframe.matchmakerbackend.domain.dto.NodeUpdate;
import com.warframe.matchmakerbackend.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {

	private long getWaitingPlayersCountForNode(NodeId nodeId) {
		//TODO Unmock
		return 1;
	}
	
	@Override
	public List<NodeUpdate> getNodeUpdates() {
		//TODO Unmock
		return List.of(
			new NodeUpdate(NodeId.NO_ID, getWaitingPlayersCountForNode(NodeId.NO_ID), true),
			new NodeUpdate(NodeId.NO_ID, -1, false)
		);
	}
}
