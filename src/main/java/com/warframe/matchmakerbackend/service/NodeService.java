package com.warframe.matchmakerbackend.service;

import java.util.List;

import com.warframe.matchmakerbackend.domain.dto.NodeDTO;

public interface NodeService {
	public List<NodeDTO> getUpdatedNodeDTOs();
}
