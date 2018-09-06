package com.han.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.han.dao.IBookDao;
import com.han.dao.impl.BookDao.BookRowMapper;
import com.han.vo.Book;

@Repository
public class BookDao extends BaseDao implements IBookDao {

	public List<Book> selectBooks(int page, int size) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM `book` LIMIT ?,?";
		return jdbcTemplate.query(sql, new BookRowMapper(),(page-1)*size,size);
	}
	
	class BookRowMapper implements RowMapper<Book>{

		public Book mapRow(ResultSet rs, int index) throws SQLException {
			// TODO Auto-generated method stub
			Book book = new Book(rs.getLong("id"), rs.getString("name"), rs.getString("author"), rs.getDouble("price"),rs.getString("info"));
			return book;
		}

	}

	public Book selectABook(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM `book` WHERE `id` = ? ";
		List<Book> books = jdbcTemplate.query(sql, new BookRowMapper(),id);
		return books==null || books.isEmpty() ? null : books.get(0);
	}
}
