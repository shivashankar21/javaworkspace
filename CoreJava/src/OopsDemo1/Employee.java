package OopsDemo1;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :10:48:31 am
* Email :paspunoori.shankar@coforge.com
* 
*Instance Class-----Employee details,Calculate the salary and display slip;
*/
public class Employee {

	
	private int empid;
	private String firstName, lastName,desig;
	private double basic,hra,da,grosssalary,netsalary;
	private static final double TAX =1000;
	
	Scanner scanner= new Scanner(System.in);
	
	
	public void INputEmployeeDetails() {
		System.out.println("ENter EmployeeId,FirstName,LAstName& Designation:");
		empid=scanner.nextInt();
		firstName=scanner.next();
		lastName=scanner.next();
		scanner.next();//input multiple words
		desig = scanner.nextLine();
		System.out.println("Enter BAsic salary of Employee:");
		basic=scanner.nextDouble();
		
		
	}
	public void calculateSalary() {
		hra=basic*0.25;//hra is 25th of basic salary
		da=basic*0.15;//da is 15& of basic salary
		grosssalary=basic+hra+da;
		netsalary=grosssalary-TAX;
		
		
	}
	
	public void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("*******************Employee Salary Slip*************************");
		System.out.println("Employee ID                                  :"+empid);
		System.out.println("EMployee Id                                  :"+firstName+" "+lastName);
		System.out.println("Designation                                  : "+desig);
		System.out.println("Basic                                        :"+basic);
		System.out.println("Hra                                          :"+hra);
		System.out.println("Dearness Allow                               :"+da);
		System.out.println("Gross salry                                  :"+grosssalary);
		System.out.println("Tax                                          :"+TAX);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Netsalary                                     :"+netsalary);
		System.out.println("---------------------------------------------------------------");

		
	}
	

}
