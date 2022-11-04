package com.warframe.matchmakerbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warframe.matchmakerbackend.domain.Node;
import com.warframe.matchmakerbackend.service.NodeService;



@RestController
@RequestMapping(value = "/warframe-matchmaker")
public class NodeController {
	
	@Autowired
	private NodeService nodeService;
	
	public NodeController() {

	}
	
	@GetMapping("/nodes")
	public List<Node> getNodes() {
		return nodeService.getNodes();
	}
}
