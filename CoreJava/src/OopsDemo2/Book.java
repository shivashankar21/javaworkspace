package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :11:39:23 am
* Email :paspunoori.shankar@coforge.com
*/

//Composition Example 
public class Book {
	String title,author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	

}
