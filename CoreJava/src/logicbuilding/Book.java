package logicbuilding;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:37:52 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Book {
	
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
 
	public String getAuthor() {
		return author;
	}
 
 
	public double getPrice() {
		return price;
	}
 
 
	public void displayDetails() {
		System.out.println("Title: " + title+", Author: "+author+", Price :"+price);
	}
	
	

 
}
