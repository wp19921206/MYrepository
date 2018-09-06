package com.han.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.han.service.IBookService;
import com.han.service.impl.BookService;
import com.han.vo.Book;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	
	@Autowired
	private IBookService bookService;
	
	private List<Book> books;
	
	public Book  ABook;
	

	public Book getABook() {
		return ABook;
	}

	public void setABook(Book aBook) {
		ABook = aBook;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("UserAction.execute()");
		 books = bookService.findBooks(1, 10);
		 ABook = bookService.findABook(100L);
		return super.execute();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
	
}
