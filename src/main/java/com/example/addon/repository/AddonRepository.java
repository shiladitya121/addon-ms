package com.example.addon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.addon.entity.Addon;

public interface AddonRepository extends JpaRepository<Addon, Long> {

	@Query("FROM Addon a WHERE a.status = ?1")
	public List<Addon> findAddonByStatus(String status);
	
}
