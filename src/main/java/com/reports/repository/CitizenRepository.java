package com.reports.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reports.entity.Citizen_Info;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen_Info, Integer>{
	
	@Query("select distinct(plan_name) from citizen_info")
	public List<String> getPlanNames();
	
	
	@Query("select distinct(plan_status) from citizen_info")
	public List<String> getPlanStatus();

}
