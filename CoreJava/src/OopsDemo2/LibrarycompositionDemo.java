package OopsDemo2;

import java.util.ArrayList;
import java.util.List;

/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :11:45:55 am
* Email :paspunoori.shankar@coforge.com
*/
public class LibrarycompositionDemo {
	
	public static void main(String[] args) {
		
		// Creating the Objects of Book class. 
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch"); 
        Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
          
        // Creating the list which contains the  
        // no. of books. 
        List<Book> books = new ArrayList<Book>(); 
        books.add(b1); 
        books.add(b2); 
        books.add(b3); 
        
        //Library object with books List initialized
        Library lib=new Library(books);// Invoke Constructor
        
        //get the Book List
        List<Book> bks = lib.getBooks(); 
        
        for(Book bk : bks){ 
              
            System.out.println("Title : " + bk.title + " and " 
            +" Author : " + bk.author); 
	}

       // lib=null;
     //  System.gc();
        System.out.println(lib.getBooks());
        System.out.println(b1.author);

		
	}

}
