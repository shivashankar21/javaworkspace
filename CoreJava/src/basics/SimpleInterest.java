package basics;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		String customerName;
		Double principle;
		int time, rate ;
		float si;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter customername:");// shortcut- Type sysout -ctrl + Space
	    customerName =scanner.nextLine();
	    System.out.println("enter amount:");// shortcut- Type sysout -ctrl + Space
		principle =scanner.nextDouble();
		System.out.println("enter period:");// shortcut- Type sysout -ctrl + Space
		time =scanner.nextInt();
		System.out.println("enter rate:");// shortcut- Type sysout -ctrl + Space
		rate =scanner.nextInt();
		
		si= (float)(principle*time*rate)/100;
		System.out.println("hello" +customerName);
		System.out.println("si is :"+si);// shortcut- Type sysout -ctrl + Space
        scanner.close();
        
		
	}

}
