package com.example.addon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addon.dto.GetActiveAddonResponse;
import com.example.addon.service.AddonService;

@RestController
@RequestMapping("/api/addon/v1")
public class AddonController {

	@Autowired
	private AddonService addonService;
	
	@GetMapping(path = "/active", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetActiveAddonResponse> getAllActivePackages(){
		GetActiveAddonResponse response = addonService.getAllActiveAddons();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
}
