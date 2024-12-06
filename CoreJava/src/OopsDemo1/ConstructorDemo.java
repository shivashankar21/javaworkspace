package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :2:36:39 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ConstructorDemo {

		
		int id;
		String name;
		float salary;
		
		
		
		
		
	public ConstructorDemo() {
			System.out.println("No -Args /Implicit Constructor ");
			this.id=101;
			this.name="shiba";
			this.salary=50000.00f;
		}
    public void name () {
    	System.out.println("I am a method");
    	System.out.println(this.id+" "+this.name+" "+this.salary);
    	}
    
    //Parameterized constructor
	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(1001,"shiva",4300.00f);


		cd1.name();
		cd2.name();
		
		
	}

}
