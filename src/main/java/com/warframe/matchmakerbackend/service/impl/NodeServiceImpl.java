package com.warframe.matchmakerbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.NodeId;
import com.warframe.matchmakerbackend.domain.dto.NodeUpdate;
import com.warframe.matchmakerbackend.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {

	private Long getWaitingPlayersCountForNode(NodeId nodeId) {
		//TODO Unmock
		return 1L;
	}
	
	@Override
	public List<NodeUpdate> getNodeUpdates() {
		//TODO Unmock
		return List.of(
			new NodeUpdate(NodeId.CAMBRIA, getWaitingPlayersCountForNode(NodeId.CAMBRIA), true),
			new NodeUpdate(NodeId.CERVANTES, getWaitingPlayersCountForNode(NodeId.CERVANTES), true),
			new NodeUpdate(NodeId.COBA, getWaitingPlayersCountForNode(NodeId.COBA), true),
			new NodeUpdate(NodeId.E_PRIME, getWaitingPlayersCountForNode(NodeId.E_PRIME), true),
			new NodeUpdate(NodeId.ERPO, getWaitingPlayersCountForNode(NodeId.ERPO), true),
			new NodeUpdate(NodeId.EURASIA, getWaitingPlayersCountForNode(NodeId.EURASIA), true),
//			new NodeUpdate(NodeId.EVEREST, getWaitingPlayersCountForNode(NodeId.EVEREST), true),
			new NodeUpdate(NodeId.EVEREST, null, false),
			new NodeUpdate(NodeId.GAIA, 2L, true),
//			new NodeUpdate(NodeId.GAIA, getWaitingPlayersCountForNode(NodeId.GAIA), true),
			new NodeUpdate(NodeId.LITH, getWaitingPlayersCountForNode(NodeId.LITH), true),
			new NodeUpdate(NodeId.MANTLE, getWaitingPlayersCountForNode(NodeId.MANTLE), true),
			new NodeUpdate(NodeId.MARIANA, getWaitingPlayersCountForNode(NodeId.MARIANA), true),
			new NodeUpdate(NodeId.ORO, getWaitingPlayersCountForNode(NodeId.ORO), true),
			new NodeUpdate(NodeId.PACIFIC, getWaitingPlayersCountForNode(NodeId.PACIFIC), true),
			new NodeUpdate(NodeId.TIKAL, getWaitingPlayersCountForNode(NodeId.TIKAL), true)
		);
	}
}
