package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:13:23 pm
* Email :paspunoori.shankar@coforge.com
*/
public class StudentGrade {
	public static void main(String[] args) {
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
