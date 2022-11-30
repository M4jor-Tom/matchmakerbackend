package com.warframe.matchmakerbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeId;
import com.warframe.matchmakerbackend.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {
	@Override
	public List<Node> getUpdatedNodes() {
		return List.of(new Node(NodeId.NO_ID, "node1", 1), new Node(NodeId.NO_ID, "node2", 2));
	}
}
