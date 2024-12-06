package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:Paspunoori.Shankar
 * Date  :25 Oct 2024
 * Time  :12:18:42 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class SumAverage {

	public static void main(String[] args) {

		int[] marks =new int[10];

		Scanner scanner=new Scanner(System.in);

		//Array input at runtime from user
		System.out.println("Enter Elements into Array :");
		for (int i = 0; i < marks.length; i++) {
			marks[i]= scanner.nextInt();
		}

		System.out.println("Array Contents displayed using Classic For Loop");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();

		//For-each Loop is used for Iteration in Arrays in sequential Manner
		System.out.println("Array Contents displayed using For-Each Loop");
		for(int i:marks){
			System.out.print(i+"\t");
		}
		System.out.println();

		int sum=0; float avg=0.00f;

		//Access Array elements using for-each loop & perform calculation
		for(int element:marks) {
			sum+=element; // sum+=marks[i]; in classic for loop
		}
		avg=(float)sum/marks.length;

		System.out.println("The Sum of Array Elements is : "+sum);
		System.out.println("The Average of Array Elements is : "+avg);
		System.out.println("The Length of Array is : "+marks.length);
		System.out.println("Array contents displayed without Loop : " +Arrays.toString(marks));
		scanner.close();




	}

}
