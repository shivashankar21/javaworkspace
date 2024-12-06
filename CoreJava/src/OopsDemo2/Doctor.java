package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :2:21:55 pm
* Email :paspunoori.shankar@coforge.com
* 
* Hierachical Inheritance Demo
*       Doctor
Specialist          NonSpecialist
*/
public class Doctor {
	private int idNumber;
    private String name,address;
    
    
    
    public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}



	public void display() {
        System.out.println("******** Doctor Details ***********");
        System.out.println("The Doctor Id is   : "+idNumber);
        System.out.println("The Doctor Name is : "+name);
        System.out.println("The Doctor City is : "+address);
    }

}
