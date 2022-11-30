package com.warframe.matchmakerbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeId;
import com.warframe.matchmakerbackend.domain.dto.NodeDTO;
import com.warframe.matchmakerbackend.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {
	
	private long getWaitingPlayersCountForNode(NodeId nodeId) {
		return 1;
	}
	
	private Node getNodeById(NodeId nodeId) {
		return new Node(NodeId.NO_ID, "node1");
	}
	
	@Override
	public List<NodeDTO> getUpdatedNodeDTOs() {
		return List.of(
				new NodeDTO(getNodeById(NodeId.NO_ID), getWaitingPlayersCountForNode(NodeId.NO_ID)),
				new NodeDTO(getNodeById(NodeId.NO_ID), getWaitingPlayersCountForNode(NodeId.NO_ID))
		);
	}
}
