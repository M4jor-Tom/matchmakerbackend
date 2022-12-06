package com.warframe.matchmakerbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.warframe.matchmakerbackend.domain.Action;
import com.warframe.matchmakerbackend.service.NodeService;

@Controller
public class NodeController {
	
	private static Gson GSON = new GsonBuilder().create();
	
	@Autowired
	private NodeService nodeService;
	
	@MessageMapping("/ws-destination")
	@SendTo("/ws-broker")
	public String getUpdatedNode(String actionJson) throws Exception {
		Action action = GSON.fromJson(actionJson, Action.class);
		System.out.println(action);
		return GSON.toJson(nodeService.getNodeUpdates());
	}
}