package com.han.dao;

import java.util.List;

import com.han.vo.Book;

public interface IBookDao {

	List<Book> selectBooks(int page,int size);
	
	Book selectABook(Long id);
}
