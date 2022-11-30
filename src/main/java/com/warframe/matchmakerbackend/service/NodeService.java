package com.warframe.matchmakerbackend.service;

import java.util.List;

import com.warframe.matchmakerbackend.domain.dto.NodeUpdate;

public interface NodeService {
	public List<NodeUpdate> getNodeUpdates();
}
