package com.example.addon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addon.dto.GetActiveAddonResponse;
import com.example.addon.entity.Addon;
import com.example.addon.mapper.AddonMapper;
import com.example.addon.repository.AddonRepository;
import com.example.addon.service.AddonService;

@Service
public class AddonServiceImpl implements AddonService {

	@Autowired
	private AddonRepository addonRepository;
	
	@Autowired
	private AddonMapper addonMapper;
	
	@Override
	public GetActiveAddonResponse getAllActiveAddons() {
		List<Addon> addons = addonRepository.findAddonByStatus("ACTIVE");
		return addonMapper.convertAddonEntityToDto(addons);
	}

}
