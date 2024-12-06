package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :10:47:09 am
* Email :paspunoori.shankar@coforge.com
*/
public class Circle extends Shape {
	private final double radius;
	public Circle(double radius) {
		this .radius=radius;
	}
	
	@Override
	public Double calculateArea() {
		return radius*radius*Math.PI;
	}

}
