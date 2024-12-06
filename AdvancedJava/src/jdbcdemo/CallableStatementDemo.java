package jdbcdemo;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :7 Nov 2024
* Time  :4:51:57 pm
* Email :paspunoori.shankar@coforge.com
*/
public class CallableStatementDemo {
	public static void main(String[] args) {
		
		try {
			Skills s = new Skills();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter Candidate Id : ");
			int id = scan.nextInt();
			
			
			s.getSkills(id);
			scan.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
