package com.warframe.matchmakerbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.warframe.matchmakerbackend.domain.Node;

@Service
public class NodeService {
	public List<Node> getNodes() {
		return List.of(new Node("toto"), new Node("tata"));
	}
}
