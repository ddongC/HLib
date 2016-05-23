package com.company.lib.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WishBookMapper implements RowMapper<WishBook> {

	public WishBook mapRow(ResultSet rs, int rowNum) throws SQLException {
		WishBook book = new WishBook();
		book.setBookName(rs.getString("bookName"));
		book.setAuthor(rs.getString("author"));

		return book;
	}

}