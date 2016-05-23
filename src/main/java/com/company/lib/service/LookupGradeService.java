package com.company.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.lib.dao.MemberDAO;

@Service("LookupGrade")
public class LookupGradeService {

	public MemberDAO memberDAO;

	@Autowired
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public int lookupGrade(int stdID) {
		return memberDAO.getMember(stdID).getGrade();
	}
	
}
