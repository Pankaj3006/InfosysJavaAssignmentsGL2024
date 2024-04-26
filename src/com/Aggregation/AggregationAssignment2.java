package com.Aggregation;

class Book {
	private String name;
	private Author author;
	private double price;
	private int quantity;
	
	public Book(String name, Author author, double price, int quantity) {
		this.name= name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void displayAuthorDetails() {
		System.out.println("Displaying author Details");
		System.out.println("Author name: "+this.getAuthor().getName());
		System.out.println("Author email: "+this.getAuthor().getEmailId());
		System.out.println("Author gender: "+this.getAuthor().getGender());	
	}
}

class Author {
	private String name;
	private String emailId;
	private char gender;
	
	public Author(String name, String emailId, char gender) {
		this.name= name;
		this.emailId = emailId;
		this.gender=gender;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}	
}

public class AggregationAssignment2 {

	public static void main(String[] args) {
		Author author1= new Author("Joshua Bloch", "jousha@email.com", 'M');
		Book book1= new Book("Effective Java", author1, 45.0, 15);
		book1.displayAuthorDetails();
	}

}
