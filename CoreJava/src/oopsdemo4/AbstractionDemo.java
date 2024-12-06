package oopsdemo4;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :11:40:16 am
* Email :paspunoori.shankar@coforge.com
*/
public class AbstractionDemo {

	public static void main(String[] args) {
		
		Trianee trainee1=new Marks("John Michael", "NewYork", 10001, 44);
		
		System.out.println(trainee1);//Invokes toString() method to display object Attributes		
		double result = trainee1.calculateMarks();
		
		System.out.println("Final Marks : "+result);
	}

}
