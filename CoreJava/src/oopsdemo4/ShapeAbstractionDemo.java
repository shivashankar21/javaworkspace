package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :10:55:46 am
* Email :paspunoori.shankar@coforge.com
*/
public class ShapeAbstractionDemo {
	public static void main(String[] args) {
		
		Shape s;
		
		s=new Circle(5);
		System.out.println("The Area of Circle is: "+s.calculateArea());

		
		s=new Square(5);		
		
		System.out.println("The Area of Square is: "+s.calculateArea());

		
		
	}

}
