package oopsdemo4;
/**
 * Author:Paspunoori.Shankar
 * Date  :30 Oct 2024
 * Time  :12:44:19 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class Book implements IItem {

	private String title;
	private String author;
	private boolean available;


	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.available = true;
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public String getAuthor() {
		
		return author;
	}

	@Override
	public String getCategory() {
		return "Book";
	}

	@Override
	public boolean isAvailable() {

		return true;
	}

	@Override
	public void borrowItem() {

		if (available) {
			available = false;
			System.out.println(title + " has been borrowed.");
		} else {
			System.out.println(title + " is not available.");
		}

	}

	@Override
	public void returnItem() {
		available = true;
		System.out.println(title + " has been returned.");

	}

}
