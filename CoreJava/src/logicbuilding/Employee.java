package logicbuilding;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:43:53 pm
* Email :paspunoori.shankar@coforge.com
*/

 
public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
 
 
	public double getSalary() {
		return salary;
	}
 
 
	public String getDetails() {
		return "Name: " + name + ", Salary: " + salary;
	}
 
 
}
 
 
