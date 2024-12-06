package Assignment;

import java.util.Scanner;

/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :1:09:17 am
* Email :paspunoori.shankar@coforge.com
*/
public class HourlyEmployeeTest {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			 
	        // Taking user input for salary and hours per day
	        System.out.print("Enter salary: ");
	        double salary = scanner.nextDouble();
	 
	        System.out.print("Enter hours of work per day: ");
	        int hoursPerDay = scanner.nextInt();
	 
	        // Creating an Employee object with user input
	        HourlyEmployee employee = new HourlyEmployee(salary, hoursPerDay);
	 
	        // Adding salary and work
	        employee.addSalary();
	        employee.addWork();
	 
	        // Printing the final salary
	        employee.printSalary();
	 
	        scanner.close();

		}

	}


