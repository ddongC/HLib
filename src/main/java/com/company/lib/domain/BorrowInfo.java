package com.company.lib.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowInfo {
	
	int stdID;
	String bookName;
	String author;
	Date borrowDate;
	String returnDate;
	
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
	
	public String getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(Date returnDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.returnDate = sdf.format(returnDate);
	}
	
}
