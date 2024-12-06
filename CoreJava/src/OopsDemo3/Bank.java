package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :2:31:46 pm
* Email :paspunoori.shankar@coforge.com
* 
* 
Overriding is a feature that allows a subclass or
 child class to provide a specific implementation of a method
 that is already provided by one of its super-classes or parent classes.
*/
public class Bank {
	private String name;
	public Bank (String name) {
		this.name=name;
	}
	//Method to be overridden
	int getRAteofInterest() {
		return 0;
	}
	void display() {
		System.out.println("Welcome to the "+name+" Bank");
	}

}


class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRAteofInterest() {
		return 5;
	}
	
	
}
 class Axis extends Bank{

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRAteofInterest() {
		return 6;
	}
	
	 
 }
 class Icici extends Bank{

	public Icici(String name) {
		super(name);
	}

	@Override
	int getRAteofInterest() {
		return 7;
	}
	
	 
 }
