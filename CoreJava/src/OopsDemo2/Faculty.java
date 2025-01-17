package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :10:47:25 am
* Email :paspunoori.shankar@coforge.com
* 
* 
* Imagine a university system where we have a general Faculty class representing a faculty member. 
* We want to create a ScienceFaculty class that inherits from Faculty and adds science-specific attributes.

* This example demonstrates single inheritance in Java, where the ScienceFaculty class 
* inherits from the Faculty class, adding its own specific attributes and behaviors while 
* reusing and extending the functionality of the superclass.


*/
public class Faculty {

	   private String name;
	    private String facultyId;
	    private double salary;
	    
	    
		public Faculty(String name, String facultyId, double salary) {
			this.name = name;
			this.facultyId = facultyId;
			this.salary = salary;
		}
		
		
		public void displayDetails() {
			System.out.println("Name:                        "+name);
			System.out.println("faculty ID:                        "+facultyId);
			System.out.println("Salary:                        "+salary);

		}
	
	    
	    
	

}
