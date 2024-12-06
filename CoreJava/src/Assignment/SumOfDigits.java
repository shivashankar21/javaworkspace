package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:14:47 pm
* Email :paspunoori.shankar@coforge.com
*/
public class SumOfDigits {
	public static void main(String[] args) {
		int a,sum = 0,rem;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		a=s.nextInt();
		s.close();
		
		while(a>0) {
			rem=a%10;
			sum+=+rem;
			a=a/10;
		}
		
		System.out.println("The sum of number is "+sum);
	}


}
