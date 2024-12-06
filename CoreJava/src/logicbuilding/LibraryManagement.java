package logicbuilding;


import java.util.List;
import java.util.Scanner;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:52:29 pm
* Email :paspunoori.shankar@coforge.com
*/


 
public class LibraryManagement {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
 
		// Input for the number of books
		System.out.print("Enter no. of Books: ");
		int n = scanner.nextInt();
		scanner.nextLine();
 
		// Input for each book details
		System.out.println("Enter Book Details Title, Author, Price:");
		for (int i = 0; i < n; i++) {
			String title = scanner.next();
			String author = scanner.next();
			double price = scanner.nextDouble();
			scanner.nextLine();
 
			Book book = new Book(title, author, price);
			library.addBook(book);
		}
 
		// Input for the author to search for
		System.out.print("Enter Author to Search: ");
		String searchAuthor = scanner.nextLine();
 
		// Get and display books by the specified author
		List<Book> booksByAuthor = library.getBooksByAuthor(searchAuthor);
		for (Book book : booksByAuthor) {
			book.displayDetails();
		}
 
		// Display the total value of all books in the library
		System.out.printf("Total Value of All Books: %.2f%n", library.getTotalValue());
		scanner.close();
	}
}
 

