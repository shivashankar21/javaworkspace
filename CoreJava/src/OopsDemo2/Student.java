package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :9:55:00 am
* Email :paspunoori.shankar@coforge.com
* 
* Program to demonstrate Aggregation - Student class has a relationship with with address
*/
public class Student {
	
	private int rollNo;
	private  String name;
	
	private Address ad;

	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display() {
		System.out.println("---------------Student Details---------------");
		System.out.println("Student Id      :"+rollNo);
		System.out.println("Student Name    :"+name);
		
		System.out.println("Address         :"+ad.city+" "+ad.state+" "+ad.country+""+ad.pincode);

	}
	
	

	
}
