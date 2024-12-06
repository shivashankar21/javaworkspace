package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :25 Oct 2024
* Time  :4:41:02 pm
* Email :paspunoori.shankar@coforge.com
*/
public class StudentTest {
	public static void main(String[] args) {
		
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		
		float tot1=s1.claculateTotalMarks();
		float tot2=s2.claculateTotalMarks();
		float tot3=s3.claculateTotalMarks();
		
		
		s1.displayStudentDetails();
		System.out.println("Displayed Total marks to main:"+tot1);
		s2.displayStudentDetails();
		System.out.println("Displayed Total marks to main:"+tot2);
		s3.displayStudentDetails();
		System.out.println("Displayed Total marks to main:"+tot3);
	
		
	}

}
