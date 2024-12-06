package controlflow;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :4:30:43 pm
* Email :paspunoori.shankar@coforge.com
* Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/
public class ShoppingApp {
	public static void main(String[] args) {
		String userinput=null;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("Welcome to the shopping App");
			System.out.println("1. view Products ");
			System.out.println("2 .Add products ");
			System.out.println("3. Check out");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice ");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Displaying products ...");break;
			case 2:
			System.out.println("Adding  products ...");break;
			case 3:
			System.out.println("Checking products ...");break;
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
