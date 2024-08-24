package com.reports.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.reports.service.ReportsService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportsService service;
	
	
}
