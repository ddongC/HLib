package com.company.lib.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowInfo {
	
	int stdID;
	String bookName;
	String author;
	Date borrowDate;
	
	public int getStdID() {
		return stdID;
	}
	
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Date getBorrowDate() {
		return borrowDate;
	}
	
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

}
