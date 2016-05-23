package com.company.lib.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookName(rs.getString("bookName"));
		book.setAuthor(rs.getString("author"));

		return book;
	}

}
