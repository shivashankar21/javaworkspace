package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:09:09 pm
* Email :paspunoori.shankar@coforge.com
*/
public class AgeUsingDOB {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int DOB;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your Birth year: ");
		DOB=s.nextInt();
		System.out.println("Age is : "+(2024-DOB));
		s.close();

	}


}
