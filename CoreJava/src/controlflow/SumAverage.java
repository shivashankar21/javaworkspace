package controlflow;
import java.util.Scanner;
/*
 * java program to find suma and average of 3 numbers which are greater than 100
 */
public class SumAverage {
	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter 3 numbers:");// shortcut- Type sysout -ctrl + Space
		a =scanner.nextInt();
		b =scanner.nextInt();
		c =scanner.nextInt();
		
		if(a>100 && b>100 && c>100) {
			sum= a+b+c;
			avg= (float)sum/3;
			
			System.out.println("the addition of 3 numbers is : "+sum);
			System.out.println("the average of 3 numbers is : "+avg);
			System.out.println("the average of 3 numbers is : "+String.format("%.3f",avg));

			
		}
		else {
			System.out.println("please enter numbers greater than 100");
		}
		
		scanner.close();
		

		
	}

}
