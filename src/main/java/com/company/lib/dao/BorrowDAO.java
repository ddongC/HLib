package com.company.lib.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.company.lib.domain.BorrowInfo;

@Component
public class BorrowDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public BorrowInfo getBorrowInfo(int stdID, String bookName, String author) {
		String sqlStatement = "select * from borrow where stdID=? AND bookName=? AND author=?";
		try {
			return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { stdID, bookName, author },
					new RowMapper<BorrowInfo>() {

						@Override
						public BorrowInfo mapRow(ResultSet rs, int rowNum) {
							BorrowInfo borrowInfo = new BorrowInfo();
							try {
								try {

									if (rs.getDate("returnDate") != null) {
										throw new NullPointerException();
									}
								} catch (NullPointerException e) {
									return null;
								}

								borrowInfo.setStdID(rs.getInt("stdID"));

								borrowInfo.setBookName(rs.getString("bookName"));
								borrowInfo.setAuthor(rs.getString("author"));
								borrowInfo.setBorrowDate(rs.getDate("borrowDate"));

								try {
									borrowInfo.setReturnDate(new Date());
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								return null;
							}

							return borrowInfo;
						}

					});
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
