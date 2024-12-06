package basics;
import java.util.Scanner;
/*
 java program to perform arithmetic operations using scanner input methods
 
 */
public class Arithmetic {
	public static void main(String[] args) {
		//declaration of variables
		int a,b,sum,sub ,mul; 
		float div ;
		String name;
		Scanner scanner= new Scanner(System.in);
		
		//input statement - Take input using Scanner object
		
		System.out.println("enter 2 numbers:");// shortcut- Type sysout -ctrl + Space
		a =scanner.nextInt();
		b =scanner.nextInt();
		System.out.println("enter your name");
		scanner.nextLine();// pause for input multiple words
		name=scanner.nextLine();
	
		//process
		sum= a+b;
		sub = a-b;
		mul = a*b;
		div = (float)(a/b);
		
		//display output
		System.out.println("***********Arithmetic Operations***********");
		System.out.println("the addition of 2 numbers is : "+sum);
		System.out.println("the subtraction of 2 numbers is : "+sub);
		System.out.println("the multiplication of 2 numbers is : "+mul);
		System.out.println("the division of 2 numbers is : "+div);
		System.out.println("Program created " +name);
		System.out.println("*******************************************");
        scanner.close();
	}
	

}
