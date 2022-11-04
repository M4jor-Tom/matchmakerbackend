package com.warframe.matchmakerbackend.domain;

public class Node {
	private String name;
	
	public Node(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
