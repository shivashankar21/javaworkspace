package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :3:30:15 pm
* Email :paspunoori.shankar@coforge.com
*/
public class UPcastingDemo {
	public static void main(String[] args) {
		
		Item item;
		//upcasting - child object is referred by parent object
		item=new Book("Java Programming ",450,"JAmes Gosling");
		item.display();//Dynamic polymorphism
		
		//switch from one implementation to another. becoz of upcasting
		item=new Laptop("Ideapad", 60000, "Lenovo");
		item.display();
		
		item=new Book("Python Made Easy",650,"Yeshwath Kanetkar");
		item.display();//dynamic polymorphism
	}

}
