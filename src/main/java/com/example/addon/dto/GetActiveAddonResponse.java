package com.example.addon.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetActiveAddonResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6847915862612057125L;
	
	List<AddonResponseDto> addonResponseDtos;
	
}
