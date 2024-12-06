package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :11:35:45 am
* Email :paspunoori.shankar@coforge.com
*/
public class Marks extends Trianee{

	
	private double marks;
	public Marks(String name, String address, int number,double marks) {
		super(name, address, number);
		this.marks=marks;
		
	}

	@Override
	public double calculateMarks() {
		System.out.println("Marks :"+marks );
		return (marks*2);
	}
	
	
	

}
