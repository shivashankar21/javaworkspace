package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :3:28:16 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Book extends Item {
	
	public Book(String name, int price, String author) {
		super(name, price);
		this.author=author;
	}

	private String author;

	@Override
	void display() {
		super.display();
		System.out.println("Author       : "+author);
	}
	
	

}
