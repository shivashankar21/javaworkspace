package logicbuilding;

import java.util.ArrayList;
import java.util.List;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:51:16 pm
* Email :paspunoori.shankar@coforge.com
*/

 

 
public class Library {
 
	private List<Book> books;
 
	// constructor to intialize books list
	public Library() {
		books= new ArrayList<>();
	}
 
	//to add a book to library 
	public void addBook(Book book) {
		books.add(book);
	}
 
	// Method to get books by a specific author
	// for loop goes through each book object in the books list
	public List<Book> getBooksByAuthor(String author) {
		List<Book> booksByAuthor = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				booksByAuthor.add(book);
			}
		}
		return booksByAuthor;
	}
 
	// Method to get the total value of all books in the library
	public double getTotalValue() {
		double totalValue = 0;
		for (Book book : books) {
			totalValue += book.getPrice();
		}
		return totalValue;
	}
}

