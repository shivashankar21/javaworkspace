package controlflow;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int a;
        Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter number:");// shortcut- Type sysout -ctrl + Space
		a =scanner.nextInt();
		if (a%2==0) {
			System.out.println(a+" is a even number");
		}
		else {
			System.out.println(a+" is a odd number");
		}
        scanner.close();
	}
	

}
