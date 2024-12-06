package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :2:31:46 pm
* Email :paspunoori.shankar@coforge.com
*/
public class DoctorHierachicalTest {
	public static void main(String[] args) {
		
		Specialist specialistDoctor=new Specialist(10001,"Mary King","Bengaluru","Cardiologist");

		NonSpecialist nonSpecialistDoctor=new NonSpecialist(20001,"Gavin King","Melbourne");

		specialistDoctor.display();
		nonSpecialistDoctor.display();
	}

}
