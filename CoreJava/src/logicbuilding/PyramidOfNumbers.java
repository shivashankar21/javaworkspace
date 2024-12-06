package logicbuilding;
import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:57:02 pm
* Email :paspunoori.shankar@coforge.com
*/

 
public class PyramidOfNumbers {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = scanner.nextInt();
 
		for (int i = 1; i <= n; i++) {
			
			//printing leading spaces
			
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
 
			//printing increasing numbers
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
 
			//printing decreasing numbers
			
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
 
			//move to the next line after each row
			
			System.out.println();
		}
 
		scanner.close();
	}
}
 

