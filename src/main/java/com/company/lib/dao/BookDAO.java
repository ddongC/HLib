package com.company.lib.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.company.lib.domain.Book;
import com.company.lib.domain.BookMapper;

@Component
public class BookDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}


	public List<Book> listBooks() {
		String SQL = "select * from book";
		List<Book> books = jdbcTemplateObject.query(SQL, new BookMapper());
		return books;
	}
}
