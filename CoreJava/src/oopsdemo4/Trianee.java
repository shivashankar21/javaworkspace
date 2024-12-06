package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :11:32:41 am
* Email :paspunoori.shankar@coforge.com
*/
public abstract class Trianee {
	private String name;
	private String address;
	private int number;
	
	
	public Trianee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}


	@Override
	public String toString() {
		return "Trianee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	public abstract double calculateMarks();//override in subclass

}
