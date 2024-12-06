package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :12:36:03 am
* Email :paspunoori.shankar@coforge.com
*/
public class SumArray {
	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr=0;
		
		arr=s.nextInt();
		int[] a= new int [arr];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("Array Elements are ");
		for(int i=0; i<arr;i++) {

System.out.println(a[i]+ " ");

		}
		for(int i=0;i<arr;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements are "+sum);

s.close();
}
}