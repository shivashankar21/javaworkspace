package basics;
import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter 3 numbers:");// shortcut- Type sysout -ctrl + Space
		a =scanner.nextInt();
		b =scanner.nextInt();
		c =scanner.nextInt();
		
		sum= a+b+c;
		avg= (float)sum/3;
		
		System.out.println("the addition of 3 numbers is : "+sum);
		System.out.println("the average of 3 numbers is : "+avg);
		System.out.println("the average of 3 numbers is : "+String.format("%.3f",avg));

		scanner.close();
		

		
	}

}
