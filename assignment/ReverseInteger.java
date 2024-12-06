package assignment;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 24-Oct-2024
* Time   : 9:26:33 pm
* Email  : Singuluri.Kumar@coforge.com
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
