package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :10:25:07 am
* Email :paspunoori.shankar@coforge.com
*/
// This is a child class of Employee
public class Developer extends Employee {
	
	private String tech;
	
	public Developer(int empId, String name, float basic,String tech) {
		super(empId, name, basic);// this will invoke super class constructor
		this.tech=tech;
		
		
		
	}
	public void displayDeveloperDetails() {
		System.out.println("Technology           :+"+this.tech);
		System.out.println("*********************************************");
		
	}

		
		
	

}
