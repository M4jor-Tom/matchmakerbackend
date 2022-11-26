package com.warframe.matchmakerbackend.websocket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.service.NodeService;

@Controller
public class NodeController {
	
	@Autowired
	private NodeService nodeService;
	
	@MessageMapping("/nodes/requestor")
	@SendTo("/nodes/receptor")
	public List<Node> nodes() throws Exception {
		Thread.sleep(1000); // simulated delay
		return nodeService.getNodes();
	}

}
