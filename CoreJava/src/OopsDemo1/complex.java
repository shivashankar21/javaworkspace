package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :3:02:09 pm
* Email :paspunoori.shankar@coforge.com
*/
public class complex {
	
	
	private double real;
	private double imaginary;
	public complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(complex obj) {
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	
	public void display() {
		System.out.println("the addition of 2 complex numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);

	}
	
	
}
