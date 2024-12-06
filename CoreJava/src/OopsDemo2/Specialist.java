package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :2:25:01 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Specialist extends Doctor{
	private String speciality;
	

	public Specialist(int idNumber, String name, String address,String speciality) {
		super(idNumber, name, address);
		this.speciality=speciality;
		
		
	}
	
	public void display() {
		super.display();
		System.out.println("the speciality is:" +speciality);
	}

}


class NonSpecialist extends Doctor{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
	
}