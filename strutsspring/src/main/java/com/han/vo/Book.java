package com.han.vo;

public class Book {

	private long id;
	private String name;
	private String author;
	private double price;
	private String info;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Book(long id, String name, String author, double price, String info) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.info = info;
	}
	public Book(String name, String author, double price, String info) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.info = info;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", info=" + info + "]";
	}
	
	
}
