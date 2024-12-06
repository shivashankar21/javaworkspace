package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:15:54 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Swapping {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter values a and b : ");
		a=s.nextInt();
		b=s.nextInt();
		s.close();
		 
		a=a+b; 
		b=a-b; 
		a=a-b; 
		
		System.out.println(".....After Swapping.....");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		

	}

}


