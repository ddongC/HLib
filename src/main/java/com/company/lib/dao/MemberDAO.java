package com.company.lib.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.company.lib.domain.Member;

@Component
public class MemberDAO {

	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public Member getMember(int stdID) {
		String sqlStatement = "select * from member where stdID=?";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {stdID}, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				member.setStdID(rs.getInt("stdID"));
				member.setGrade(rs.getInt("grade"));
				member.setPoint(rs.getInt("point"));
				member.setRateFee(rs.getInt("rateFee"));
				return member;
			}
			
		});
	}
}
