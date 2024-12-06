package OopsDemo2;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :11:47:50 am
* Email :paspunoori.shankar@coforge.com
*/
//Main class for testing Shopping Cart . Customer --> ShoppingCart

public class ShoppingApplication {

	public static void main(String[] args) {
		
        Scanner scanner =new Scanner(System.in);
        System.out.println("********** Online Shopping Portal ************");
        
        System.out.println("Enter customer Name and email: ");
        String name=scanner.nextLine();
        String email=scanner.nextLine();
        scanner.close();
        



		ShoppingCart cart1 =new ShoppingCart(name,email);

		        

		        //Add items to Cart
		        cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
		        cart1.addItem("Logitech Mouse");
		        cart1.addItem("Samsung HDD");
		        cart1.addItem("HP Laser Printer");
		        cart1.addItem("keyboard ");
		        cart1.addItem("dell Laser Printer");

		   

		        System.out.println("Customer Details :");
		        cart1.display(); //Base class method
		        System.out.println("Cart Details :");
		        cart1.displayCart();

		
		
		
		
	}

}
