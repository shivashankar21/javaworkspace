package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :11:11:34 pm
* Email :paspunoori.shankar@coforge.com
*/
public class BmiCalc {
	public static void main(String[] args) {
		float weight,height,BMI;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the weight in kgs: ");
		weight=s.nextFloat();
		System.out.println("Enter the height in meters: ");
		height=s.nextFloat();
		
		BMI=weight/(height * height);
		System.out.println("Your BMI is "+String.format("%.2f", BMI));
		s.close();
		

	}

}
