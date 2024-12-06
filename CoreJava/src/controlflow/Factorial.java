package controlflow;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :5:08:15 pm
* Email :paspunoori.shankar@coforge.com
* Program to find Factorial of a Number 1 + 1 * 2 * 3 * .... * n

*/
public class Factorial {
	public static void main(String[] args) {
		
		

		int n,fact=1,i;
		Scanner scanner =new Scanner(System.in);
				
				System.out.println("Enter a Number : ");
				n=scanner.nextInt();
				scanner.close();
				
				if(n > 0) {
					//Loop to find factorial
					for(i=1;i<=n;i++) {
						fact =fact *i;
					}
					
					System.out.println("The Factorial of "+n+" is : "+fact);
					scanner.close();
					}
				else {
					System.out.println("Please Enter Value greater Than Zero");
				}
				
	}
}