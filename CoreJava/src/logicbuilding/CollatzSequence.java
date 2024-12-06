package logicbuilding;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:40:51 pm
* Email :paspunoori.shankar@coforge.com
*/

 
public class CollatzSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		System.out.print("Enter n value: ");
		long n = scanner.nextLong();
 
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
		}
 
		System.out.println(1); // Print the final 1
		scanner.close();
	}
}
 	


