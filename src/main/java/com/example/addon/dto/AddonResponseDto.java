package com.example.addon.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddonResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8214561234844607681L;

	private long addonId;
	
	private String addonName;
	
	private String addonDesc;
	
	private double addonPrice;
}
