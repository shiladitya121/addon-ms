package com.example.addon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "addon", name = "t_addon")
@Setter
@Getter
public class Addon {

	@Id
	@Column(name = "addon_id")
	private long addonId;
	
	@Column(name = "addon_name")
	private String addonName;
	
	@Column(name = "addon_desc")
	private String addonDesc;
	
	@Column(name = "addon_price")
	private double addonPrice;
	
	@Column(name = "status")
	private String status;
	
}
