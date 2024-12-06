package OopsDemo3;
/**
 * Author:Paspunoori.Shankar
 * Date  :29 Oct 2024
 * Time  :4:58:48 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class Student {

	private int rollNo;
	private String name;



	private static String organization ="VTU";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	//static method-can use only staic variables
	public static void organizationChange() {
		organization="wipro";
	}
	
	
	//insatnce method

	public void display() {
		System.out.println(this.rollNo+" "+this.name+" "+organization);
	}






}
