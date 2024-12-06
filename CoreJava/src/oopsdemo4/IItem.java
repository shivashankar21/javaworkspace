package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :12:42:54 pm
* Email :paspunoori.shankar@coforge.com
*/
public interface IItem {

	// by default public abstract methods
		String getTitle();
	    String getAuthor();
	    String getCategory();
	    boolean isAvailable();
	    void borrowItem();
	    void returnItem();
}
