package com.reports.service;

import java.util.List;

import com.reports.entity.Citizen_Info;
import com.reports.entity.SearchRequest;

public interface ReportsService {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<Citizen_Info> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
}
