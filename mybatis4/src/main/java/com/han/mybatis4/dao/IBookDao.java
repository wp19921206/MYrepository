package com.han.mybatis4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.han.mybatis4.vo.Book;

public interface IBookDao {
	@Delete("DELETE FROM `book` WHERE `id`= #{id}")
	public int deleteBook(Long id);
	
	public int getRowCount();
	
	public String selectName(Long id);

	public List<Book> selectBooks();
	
	public List<Book> selectBooks2();
	
	public List<Map<String, Object>> selectBooks3();
	@Select("SELECT * FROM `book` LIMIT  #{page}, #{size}")
	public List<Book> books(@Param("page") int page,@Param("size") int size);
	
	
	
}
