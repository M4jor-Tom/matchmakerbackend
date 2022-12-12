package com.warframe.matchmakerbackend.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.warframe.matchmakerbackend.service.NodeService;

@Controller
public class NodeController {
	
	private static Gson GSON = new GsonBuilder().create();
	
	@Autowired
	private NodeService nodeService;
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/secured/ws-room")
	@SendToUser("/secured/ws-user")
	public void sendSpecific(
	  @Payload Message msg,
	  Principal user, 
	  @Header("simpSessionId") String sessionId) throws Exception { 
		System.out.println("SessionId: " + sessionId);
		System.out.println("Message: " + msg);
		System.out.println("userName: " + user.getName());
	    String message = GSON.toJson(nodeService.getNodeUpdates());
//	    simpMessagingTemplate.convertAndSendToUser(user.getName(), "/secured/ws-user", msg);
	    simpMessagingTemplate.convertAndSendToUser(user.getName(), "/secured/ws-user" , message);
	}
}