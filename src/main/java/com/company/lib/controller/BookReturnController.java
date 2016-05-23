package com.company.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.lib.service.BookReturnService;

@Controller
public class BookReturnController {
	

	public BookReturnService bookReturnService;

	@Autowired
	public void setBookReturnService(BookReturnService bookReturnService) {
		this.bookReturnService = bookReturnService;
	}
	
	@RequestMapping(value ="inputreturninfo")
	public String inputstart() {
		return "inputreturninfo";
	}
	
	@RequestMapping(value ="bookreturn"  ,method = { RequestMethod.POST, RequestMethod.GET })
	public String bookReturn(@RequestParam("bookname") String bookName, @RequestParam("author") String author, Model model) {
		int stdID = 1092003;
		
		model.addAttribute("complete" ,bookReturnService.bookReturn(stdID, bookName, author));
		return "bookreturn";
	}
	
	
}
