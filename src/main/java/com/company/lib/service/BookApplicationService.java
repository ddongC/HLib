package com.company.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.lib.dao.BookDAO;
import com.company.lib.dao.WishBookDAO;
import com.company.lib.domain.Book;
import com.company.lib.domain.WishBook;

@Service
public class BookApplicationService {

	public BookDAO bookDAO;
	public WishBookDAO wishBookDAO;
	
	@Autowired
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Autowired
	public void setWishBookDAO(WishBookDAO wishBookDAO) {
		this.wishBookDAO = wishBookDAO;
	}
	
	public boolean lookForBook(String bookName, String author) {
		for(Book book : bookDAO.listBooks()) {
			if(book.getBookName().equals(bookName) /*&& book.getAuthor().equals(author)*/) {
				return false;
			}
		}
		for(WishBook wishBook : wishBookDAO.listBooks()) {
			if(wishBook.getBookName().equals(bookName) && wishBook.getAuthor().equals(author)) {
				return false;
			}
		}
		return true;
	}

	public boolean wishBookCreate(String bookName, String author) {
		return wishBookDAO.createWishBook(bookName, author);
	}
}
