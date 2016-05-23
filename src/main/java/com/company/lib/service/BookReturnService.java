package com.company.lib.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.lib.dao.BorrowDAO;
import com.company.lib.dao.MemberDAO;
import com.company.lib.domain.BorrowInfo;
import com.company.lib.domain.Member;

@Service
public class BookReturnService {

	public MemberDAO memberDAO;
	public BorrowDAO borrowDAO;
	
	@Autowired
	public void setMeberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Autowired
	public void setBorrowDAO(BorrowDAO borrowDAO) {
		this.borrowDAO = borrowDAO;
	}
	
	//서비스가 할 일작성
	
	public boolean bookReturn(int stdID, String bookName, String author) {
		Member i = memberDAO.getMember(stdID);
		BorrowInfo ex = borrowDAO.getBorrowInfo(stdID, bookName, author);
		if(ex != null) {
			Date toDay = new Date();
			Date borrowDate = ex.getBorrowDate();
			long result = (toDay.getTime() - borrowDate.getTime()) / (1000 * 60 * 60 * 24);
			if(result > 7) {
				i.setGrade(i.getGrade() - 1);
				i.setRateFee(((int)result - 7) * 100);
			} else {
			i.setGrade(i.getGrade() + 1);
			i.setPoint(i.getPoint() + 100);
			}
			memberDAO.updateMember(i);
			borrowDAO.deleteInfo(ex);
			return true;
		} else {
			return false;
		}
	}
	
	
}
