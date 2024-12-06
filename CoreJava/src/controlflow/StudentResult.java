package controlflow;

import java.util.Scanner;
public class StudentResult {
	public static void main(String[] args) {
		
		int rollNumber;
		String firstName,result;
		float marks1,marks2,marks3,marks4,marks5,total,percentage;
		Scanner scan = new Scanner(System.in);
		
		//Input
		System.out.println("Enter Roll Number & Name of a Student :");
		rollNumber=scan.nextInt();
		scan.nextLine();
		firstName=scan.nextLine();
		System.out.println("Enter Marks of 5 Subjects");
		marks1=scan.nextInt();
		marks2=scan.nextInt();
		marks3=scan.nextInt();
		marks4=scan.nextInt();
		marks5=scan.nextInt();
		
		//Calculate Total Marks & Percentage
		total=marks1+marks2+marks3+marks4+marks5;
		percentage=(total/500)*100;
		if (percentage>= 85.00f) {
			result="Distinction";
		}
		else if (percentage>= 60.00f) {
			result="First Class";
		}
		else if (percentage >=50.00f) {
			result="pass class";

		}
		else {
			result="Fail";
		}
		System.out.println("************* Student Result **************");
		System.out.println("Roll Number         : "+rollNumber);
		System.out.println("Student Name        : "+firstName);
		System.out.println("Student Marks       : "+marks1+" "+marks2+" "+marks3+" "+marks4+" "+marks5);
		System.out.println("Total Marks         : "+total);
		System.out.println("-------------------------------------------------");
		System.out.println("Percentage          : "+String.format("%.2f", percentage));
		System.out.println("Result              : "+result);
		System.out.println("*************************************************");
		
		scan.close();
	}
	

}
