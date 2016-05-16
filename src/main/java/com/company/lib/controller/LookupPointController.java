package com.company.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.lib.service.LookupGradeService;
import com.company.lib.service.LookupPointService;

@Controller
public class LookupPointController {

	private LookupPointService lookupPointService;

	@Autowired
	public void setLookupGradeService(LookupPointService lookupPointService) {
		this.lookupPointService = lookupPointService;
	}
	
	@RequestMapping("/printpoint")
	public String printPointInfo(Model model) {
		
		int stdID = 992072;
		int point = lookupPointService.LookupPoint(stdID);
		model.addAttribute("Point", point);
		return "printpoint";
	}
}
