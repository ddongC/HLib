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
	
	//���񽺰� �� ���ۼ�
	
	public boolean bookReturn(int stdID, String bookName, String author) {
		Member i = memberDAO.getMember(stdID);
		BorrowInfo ex = borrowDAO.getBorrowInfo(stdID, bookName, author);
		if(ex != null) {
			//���ο�DAO���� �ݳ��� �����Ȱ� �����ϵ���.
			//��ü������ ���Ǻб� �߰�.
			//���DAO�� �̿��ؼ� ������ ������ �ݿ�
			i.setPoint(i.getPoint()+ 20);
			i.setGrade(i.getGrade() + 1);
			return true;
		} else {
			return false;
		}
	}
	
	
}
