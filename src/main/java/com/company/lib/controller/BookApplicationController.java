package com.company.lib.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.lib.service.BookApplicationService;

@Controller
public class BookApplicationController {

	private BookApplicationService bookApplicationService;

	@Autowired
	public void setBookApplicationService(BookApplicationService bookApplicationService) {
		this.bookApplicationService = bookApplicationService;
	}

	@RequestMapping(value = "/wishbook")
	public String wishBookApplication(Model model) {

		return "wishbook";
	}

	@RequestMapping(value = "/sendBookData", method = { RequestMethod.POST, RequestMethod.GET })
	public String wie(@RequestParam("bookname") String name, @RequestParam("author") String au, Model model) {
		String bookName = name;
		String author = au;
		boolean isExist = bookApplicationService.lookForBook(bookName, author);
		if(isExist){
			bookApplicationService.wishBookCreate(bookName, author);
		}
		model.addAttribute("Exist", isExist);
		
		return "bookapplication";
	}

}
