package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :10:51:27 am
* Email :paspunoori.shankar@coforge.com
*/
public class Square extends Shape {
	private final double side;


	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public Double calculateArea() {
		return side*side;
	}
	
	

}
