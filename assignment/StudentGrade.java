package assignment;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 24-Oct-2024
* Time   : 9:03:42 pm
* Email  : Singuluri.Kumar@coforge.com
*/

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		m=s.nextInt();
		
		if(m>=90 && m<=100) System.out.println("Your grade is A");
		else if(m>=80 && m<=89) System.out.println("Your grade is B");
		else if(m>=70 && m<=79) System.out.println("Your grade is C");
		else if(m>=60 && m<=69) System.out.println("Your grade is D");
		else System.out.println("Your grade is F");
		s.close();

	}

}
