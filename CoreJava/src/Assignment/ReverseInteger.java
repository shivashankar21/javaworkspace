package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:12:34 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ReverseInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,rem;
		int rev=0;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		a=s.nextInt();
		s.close();
		
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		System.out.println("The reversed number is "+rev);
		
	}

}
