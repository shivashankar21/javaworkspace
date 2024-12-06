package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:17:44 pm
* Email :paspunoori.shankar@coforge.com
*/
public class TriangleType {
	public static void main(String[] args) {
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
