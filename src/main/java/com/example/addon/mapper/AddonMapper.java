package com.example.addon.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.addon.dto.AddonResponseDto;
import com.example.addon.dto.GetActiveAddonResponse;
import com.example.addon.entity.Addon;

@Component
public class AddonMapper {

	public GetActiveAddonResponse convertAddonEntityToDto(List<Addon> addons) {
		GetActiveAddonResponse getAddonPackageResponse = new GetActiveAddonResponse();
		List<AddonResponseDto> addonResponseDtos = new ArrayList<>();
		AddonResponseDto addonResponseDto = null;
		for(Addon addon :  addons) {
			addonResponseDto = new AddonResponseDto();
			addonResponseDto.setAddonId(addon.getAddonId());
			addonResponseDto.setAddonName(addon.getAddonName());
			addonResponseDto.setAddonDesc(addon.getAddonDesc());
			addonResponseDto.setAddonPrice(addon.getAddonPrice());
			addonResponseDtos.add(addonResponseDto);
		}
		getAddonPackageResponse.setAddonResponseDtos(addonResponseDtos);
		return getAddonPackageResponse;
	}

}
