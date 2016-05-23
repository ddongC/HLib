package com.company.lib.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.company.lib.domain.Book;
import com.company.lib.domain.BookMapper;
import com.company.lib.domain.WishBook;
import com.company.lib.domain.WishBookMapper;

@Component
public class WishBookDAO {

	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public List<WishBook> listBooks() {
		String SQL = "select * from wishbook";
		List<WishBook> wishBooks = jdbcTemplateObject.query(SQL, new WishBookMapper());
		return wishBooks;
	}
	
	public boolean createWishBook(String bookName, String author) {
		String SQL = "insert into wishbook (bookName, author) values (?, ?)";
	      
	      jdbcTemplateObject.update( SQL, bookName, author);
	      System.out.println("Created Record Name = " + bookName + " Author = " + author);
	      return true;
		
		
	}
	
}
