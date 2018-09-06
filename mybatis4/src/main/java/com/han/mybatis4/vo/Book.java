package com.han.mybatis4.vo;

public class Book {

	private Long id;
	private String name;
	private String author;
	private Double price;
	private String info;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", info=" + info + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Long id, String name, String author, Double price, String info) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.info = info;
	}
	public Book(String name, String author, Double price, String info) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.info = info;
	}

	
}
