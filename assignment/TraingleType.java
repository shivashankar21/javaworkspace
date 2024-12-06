package assignment;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 24-Oct-2024
* Time   : 9:12:23 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class TraingleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter three sides of traingle :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a==b && a==c && b==c) System.out.println("The traingle is equilateral");
		else if(a==b || b==c || c==a) System.out.println("This traingle is isosceles");
		else System.out.println("The traingle is scalene");
		sc.close();

	}

}
