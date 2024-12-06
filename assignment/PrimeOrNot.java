package assignment;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 24-Oct-2024
* Time   : 9:33:14 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int count=1;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		a=s.nextInt();
		s.close();
		
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				System.out.println(a+" is not a prime number");
				count++;
				break;
			}
		}
		if(count==1) System.out.println(a+" is a prime number");
	}

}
