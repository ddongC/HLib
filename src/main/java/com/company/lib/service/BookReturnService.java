package com.company.lib.service;

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
			//버로우DAO에도 반납일 수정된거 저장하도록.
			//연체가리는 조건분기 추가.
			//멤버DAO를 이용해서 수정된 정보를 반영
			i.setPoint(i.getPoint()+ 20);
			i.setGrade(i.getGrade() + 1);
			return true;
		} else {
			return false;
		}
	}
	
	
}
