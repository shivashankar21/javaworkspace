package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:00:27 pm
* Email :paspunoori.shankar@coforge.com
*/
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num;
		int count=0;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		num=s.nextInt();
		s.close();
		if (num>1) {
			for(int i=1;i<=num;i++) {
				if (num%i==0) 
					count++;
			}
			if (count==2) {
				System.out.println(num+" is a Prime Number");
			}
			else {
				System.out.println(num+" is not a prime number");
			}
		}
		else {
			System.out.println(num+"is not a prime number");
		}
		
	}
}
