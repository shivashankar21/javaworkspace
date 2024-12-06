package exceptionsdemo;

import java.util.Scanner;

/**
 * Author:Paspunoori.Shankar
 * Date  :6 Nov 2024
 * Time  :12:51:42 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class DivisionwithException {
	public static void main(String[] args) {


		//Division of 2 Numbers without Exception Handling using try-catch- finally Blocks

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();
		 //statements to be monitored which may throw Exception
		try {
			result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
			System.out.println("Result = " + result);
		}

		 //Exception thrown in try block is handled in catch block
		        //using Exception Object
		catch(ArithmeticException ex ) {
			System.out.println("please enter Second Number as Non -Zero");
			System.err.println("Exception Name & Description: "+ex.toString());
			System.err.println("Exception Description "+ex.getMessage());
			//print Exception Name, Description,File Name and Line Number
			ex.printStackTrace();
		}
		finally {
		
		input.close();
		System.out.println("In Finally Block");
		}

	}

}
