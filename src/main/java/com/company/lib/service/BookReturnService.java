package com.company.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.lib.dao.BorrowDAO;
import com.company.lib.dao.MemberDAO;

@Service
public class BookReturnService {

	public MemberDAO meberDAO;
	public BorrowDAO borrowDAO;
	
	@Autowired
	public void setMeberDAO(MemberDAO meberDAO) {
		this.meberDAO = meberDAO;
	}
	
	@Autowired
	public void setBorrowDAO(BorrowDAO borrowDAO) {
		this.borrowDAO = borrowDAO;
	}
	
	//서비스가 할 일작성
	
	
}
