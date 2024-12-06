package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :10:59:02 am
* Email :paspunoori.shankar@coforge.com
*/
public class FacultyInheritanceDemo {
	public static void main(String[] args) {
		
		ScienceFaculty faculty;
		
		faculty=new ScienceFaculty("Dr.Smith", "T465", 90888, "BioTechnology","Genetics",58787);
		
		
		faculty.displayDetails();
	}

}
