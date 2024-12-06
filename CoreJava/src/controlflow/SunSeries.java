package controlflow;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :3:07:46 pm
* Email :paspunoori.shankar@coforge.com
* 
* a program to find sum of series 1+2+3.....+n
*/
public class SunSeries {
	public static void main(String[] args) {
		
	int num,i=1,sum=0;
	Scanner scan = new Scanner(System.in);
	num= scan.nextInt();
	scan.close();
	while(i<=num) {
		i=i+1;
		
	}
	System.out.println("The sum of the series:" +sum);
	}
	

}
