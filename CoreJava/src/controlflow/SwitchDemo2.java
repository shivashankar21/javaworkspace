package controlflow;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :12:39:06 pm
* Email :paspunoori.shankar@coforge.com
*/

public class SwitchDemo2 {
	public static void main(String[] args) {

		   float num1,num2,result;
				String operator;
				Scanner scanner=new Scanner(System.in);

				System.out.println("Enter 2 Numbers :");
				num1=scanner.nextInt();
				num2=scanner.nextInt();
				System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
				operator=scanner.next();
				scanner.close();
				
				switch(operator) {
				case "+": result =num1+num2;
				          System.out.println("the addition of "+num1+ "and"+num2+"is :"+result );
				          break;
				case "-": result =num1-num2;
		                  System.out.println("the subtraction of "+num1+ "and"+num2+"is :"+result );
		                  break;
				case "*": result =num1*num2;
		                  System.out.println("the multiplication of "+num1+ "and"+num2+"is :"+result );
		                  break;
				case "/": result =num1+num2;
		                  System.out.println("the division of "+num1+ "and"+num2+"is :"+result );
		                  break ;
		        default : System.out.println("invalid operator");
		                  break;
		          
		          
					}
		
	}

}
