package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {
	public static void main(String[] args) throws IOException {
		
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	
	String name;
	int age;
	boolean isMember;
	
	System.out.println("Enter your name: ");
	name=br.readLine();
	System.out.println("Enter your age: ");
	age = Integer.parseInt( br.readLine());
	System.out.println("Are you a member ? : (true/false)");
	isMember=Boolean.parseBoolean(br.readLine());
	
	if (age < 18 || isMember) {
		System.out.println(name+ "is eligible for discount!!!");
	}
	else {
		System.out.println(name+" is not eligible for discount!!!");
	}
	
	}

}
