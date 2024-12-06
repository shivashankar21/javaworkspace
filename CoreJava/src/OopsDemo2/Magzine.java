package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :10:18:08 am
* Email :paspunoori.shankar@coforge.com
* /*
 * In Java, aggregation represents HAS-A relationship, 
 * which means when a class contains reference of another class known to have aggregation.
 * 
 * When you want to use some property or behavior of any class without the requirement of modifying it 
 * or adding more functionality to it, in such case Aggregation 
 */

public class Magzine {
	private String name;
	private int price;
	
	
	//Aggregation has a relationship-one way
	private Author author ;
	private Publisher publisher;
	
	public Magzine(String name, int price, Author author, Publisher publisher) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	
	@Override
	public String toString() {
		return "Magzine [name=" + name + ", price=" + price + ", author=" + author + ", publisher=" + publisher + "]";
	}



	void display() {
		System.out.println("*************** Magazine Details ****************");
		System.out.println("Magazine Name    : "+name);
	    System.out.println("Magazine Price   : "+price);
	    
	    System.out.println("------------Author Details----------");
	    System.out.println("Author Name  : "+author.authorName);
	    System.out.println("Author Age   : "+author.age);
	    System.out.println("Author place : "+author.place);
	    
	    System.out.println("------------Publisher Details-------");
	    System.out.println("Publisher Name: "+publisher.name);
	    System.out.println("Publisher ID  : "+publisher.publisherID);
	    System.out.println("Publisher City: "+publisher.city);
	    
	}
	

}
