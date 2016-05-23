package com.company.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.company.lib.service.BookReturnService;

@Controller
public class BookReturnController {

	public BookReturnService bookReturnService;

	@Autowired
	public void setBookReturnService(BookReturnService bookReturnService) {
		this.bookReturnService = bookReturnService;
	}
	
	
}
