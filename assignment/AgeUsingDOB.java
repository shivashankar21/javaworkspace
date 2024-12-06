package assignment;

import java.util.Scanner;

/**
* Author : Singuluri.Kumar
* Date   : 24-Oct-2024
* Time   : 8:21:53 pm
* Email  : Singuluri.Kumar@coforge.com
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
