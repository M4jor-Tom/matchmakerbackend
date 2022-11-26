package com.warframe.matchmakerbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeId;

@Service
public class NodeService {
	public List<Node> getNodes() {
		return List.of(new Node(NodeId.NO_ID, "node1"), new Node(NodeId.NO_ID, "node2"));
	}
}
