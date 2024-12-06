package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :25 Oct 2024
* Time  :4:12:41 pm
* Email :paspunoori.shankar@coforge.com
* 
* program to create a instance class and define its behaviour and states.
*/

import java.util.Scanner;

public class Student {

		//define properties/state/attributes
		private int rollnumber;
		private String firstName,lastName;
		private float[] marks =new float [5] ;
		private float total;
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		//define methods/behavior/ actions 
		
		public void inputStudentDetails() {
			System.out.println("Enter a roll number: ");
			rollnumber=scanner.nextInt();
			System.out.println("Enter First Name & Last Name :");
			firstName=scanner.next();
			lastName=scanner.next();
			System.out.println("Enter Marks of 5 subjects ");
			
			for (int i =0; i<marks.length;i++){
				marks[i]=scanner.nextFloat();
				
				
			}
		}
		
		public float claculateTotalMarks() {
			for (int i =0; i<marks.length; i++) {
				total+=marks[i];
			}
			return total;
		}
		
		public void displayStudentDetails(){
			System.out.println("*************student Result Informatipon****************");
			System.out.println("RollNumber                       :"+rollnumber);
			System.out.println("StudentName                      :"+firstName+""+lastName);
			System.out.println("Total Marks                      : "+total);
			System.out.println("*********************************************************");
		}
		
		
		
		
		
		


}
