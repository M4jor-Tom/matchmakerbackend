package com.warframe.matchmakerbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.domain.NodeSubscription;
import com.warframe.matchmakerbackend.service.NodeService;

@Controller
public class NodeController {
	
	@Autowired
	private NodeService nodeService;
	
	@MessageMapping("/ws-destination")
	@SendTo("/ws-broker")
	public List<Node> getUpdatedNode(NodeSubscription nodeSubscription) throws Exception {
		return nodeService.getUpdatedNodes();
	}
}