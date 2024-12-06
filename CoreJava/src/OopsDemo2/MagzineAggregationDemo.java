package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :10:24:02 am
* Email :paspunoori.shankar@coforge.com
*/
public class MagzineAggregationDemo {
	public static void main(String[] args) {
		
		Author author1 = new Author("john", 42, "USA");
		
		Publisher publisher1 = new Publisher("Sun Publications", "JDSR-III4","LA");
		
		Magzine magzine1 = new Magzine("The wolf Street", 800, author1 , publisher1);
		
		magzine1.display();
		
		System.out.println();
		System.out.println(author1);
		System.out.println(publisher1);
		System.out.println(magzine1);
		
	}

}
