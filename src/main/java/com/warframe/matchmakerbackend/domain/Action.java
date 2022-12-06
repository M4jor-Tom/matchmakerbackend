package com.warframe.matchmakerbackend.domain;

public class Action {
	private NodeId nodeId;
	private ActionType actionType;
	
	public Action(NodeId nodeId, ActionType actionType) {
		super();
		
		this.nodeId = nodeId;
		this.actionType = actionType;
	}
	
	@Override
	public String toString() {
		return "Action: {\n\tnodeId: " + nodeId + ",\n\t" + "actionType: " + actionType + "\n}";
	}
}