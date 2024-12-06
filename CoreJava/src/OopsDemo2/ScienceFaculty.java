package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :10:52:26 am
* Email :paspunoori.shankar@coforge.com
* 
* ScienceFaculty class inherits from the Faculty class, 
* adding its own specific attributes and behaviors while 
* reusing and extending the functionality of the superclass.
*/
public class ScienceFaculty extends Faculty {
	
	private String department;
    private String researchArea;
    private double bonus;
	
	public ScienceFaculty(String name, String facultyId, double salary,String department,String researchArea,double bonus) {
		super(name, facultyId, salary);
		this.bonus=bonus;
		this.department=department;
		this.researchArea=researchArea;
		
		
	}
	public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass
        System.out.println("Department: " + department);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Bonus: $" + bonus);
    }
	
	

	
	
	
	

}
