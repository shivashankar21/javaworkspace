package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :12:02:33 am
* Email :paspunoori.shankar@coforge.com
*/
public class Factorial {
	public static void main(String[] args) {
		
		int num;
		long factorial =1;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		num= scanner.nextInt();
		
		for(int i =num; i>=1;i--) {
			factorial=factorial*i;
			
		}
		for (int i =1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of given number is " +factorial);
		
		scanner.close();
		
	}

}
