package arraysdemo;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :4:30:43 pm
* Email :paspunoori.shankar@coforge.com
* Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
 
 Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/
public class ShoppingApp {
	public static void main(String[] args) {
		String userinput=null;
		Scanner scanner = new Scanner(System.in);
		
		
		String[] products = {"logitech mouse","boat earbuds","Hp laptop"," Samsung HDD","Phlips Mgic Lights ","Hp Printer"};
		String[] cart=new String[products.length];
		int cartIndex=0;
		
		
		do {
			System.out.println("Welcome to the shopping App");
			System.out.println("1. view Products ");
			System.out.println("2 . Add products ");
			System.out.println("3. Check out");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice ");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Displaying products ...");
			for (int i=0;i< products.length; i++) {
				System.out.println(i+1+" ."+products[i]);
			}
			break;
			case 2:
			System.out.println("Adding  products ...");
			System.out.println("Enter Product Number To Add to Cart:");
			int pno=scanner.nextInt();
			if (pno>0 && pno <= products.length){
					cart[cartIndex++]=products[pno-1];
			        System.out.println("Products added tp cart");
			}
			else {
				System.out.println("Invalid Product Number");
			}
			break;
			case 3:
			System.out.println("Checking products ...");
			
			for(int i=0;i< cartIndex; i++) {
				System.out.println((i+1)+". "+cart[i]);
			}
			break;
			
			case 4:
			System.out.println("Exit ...");
			return;
			default:
			System.out.println("Invalid Choice. Please Try Again");
			}
			System.out.println("do you wnat to continue shopping ? (Yes/No): ");
			userinput=scanner.next();
			
		}while(userinput.equalsIgnoreCase("Yes"));
		      
		     System.out.println("Thanks for shopping with us !!!");
		     scanner.close();
	}

}
