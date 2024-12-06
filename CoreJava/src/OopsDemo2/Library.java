package OopsDemo2;

import java.util.List;

/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :11:41:18 am
* Email :paspunoori.shankar@coforge.com
*/
//Composition Example
public class Library {
	
	private List<Book>books;//composition -library has book reference object

	public Library(List<Book> books) {
		super();
		this.books = books;
	}
	
	//Generate getter Method

	public List<Book> getBooks() {
		return books;
	}

}
