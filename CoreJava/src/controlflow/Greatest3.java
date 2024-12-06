package controlflow;

import java.util.Scanner;

public class Greatest3 {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter 3 numbers:");// shortcut- Type sysout -ctrl + Space
		a =scanner.nextInt();
		b =scanner.nextInt();
		c =scanner.nextInt();
		
		if(a>b && a>c){
			System.out.println(a+ " is the greatest");
		}
		else if (b>c){
			System.out.println(b+ " is the greatest");
		}
		else if(a==b&&a==c) {
			System.out.println("All are equal numbers");
		}
		else {
			System.out.println(c+" is the greatest");
		}
		scanner.close();
	}

}
