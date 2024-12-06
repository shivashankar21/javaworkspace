package controlflow;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :3:15:43 pm
* Email :paspunoori.shankar@coforge.com
*/
public class MUltpilpication {
	public static void main(String[] args) {
		
		int i =1, mul, num;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a  number: ");
		num=scan.nextInt();
		scan.close();
		
		
		System.out.println("******Multiplication Table of : "+num+" **********");
		while(i<10) {
			mul = num*1;
			System.out.println( num+ " *  " +i+  "=" +mul);
			
			i=i+1;
		}
		}
}
