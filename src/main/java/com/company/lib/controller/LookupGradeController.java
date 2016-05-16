package com.company.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.lib.service.LookupGradeService;

@Controller
public class LookupGradeController {

	private LookupGradeService lookupGradeService;

	@Autowired
	public void setLookupGradeService(LookupGradeService lookupGradeService) {
		this.lookupGradeService = lookupGradeService;
	}
	
	@RequestMapping("/printgrade")
	public String printGradeInfo(Model model) {
		
		int stdID = 992072;
		int grade = lookupGradeService.LookupGrade(stdID);
		model.addAttribute("Grade", grade);
		return "printgrade";
	}
	
}


