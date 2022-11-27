package com.warframe.matchmakerbackend.service;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeId;

@Service
public class NodeService {
	public Node getUpdatedNode() {
		return new Node(NodeId.NO_ID, "node1", 2);
	}
}
