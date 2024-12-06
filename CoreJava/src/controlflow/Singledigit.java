package controlflow;

import java.util.Scanner;

public class Singledigit {
	public static void main(String[] args) {
		
		int a;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		a=scan.nextInt();
		
		// implementing conditional statements
		if (a> -10 && a< 10) {
			System.out.println(a+"is greatest");
		}
		else {
			System.out.println(a+"is not a greatest");
		}
		scan.close();
		}

}
