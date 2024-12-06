package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :4:21:07 pm
* Email :paspunoori.shankar@coforge.com
*/
public class LAnguageTest {
	public static void main(String[] args) {
		
		LAnguage l1=new LAnguage();
		
		LAnguage l2=new LAnguage("Scala");// single parameterized constructor with string
		LAnguage l3=new LAnguage("Ruby");
		
		LAnguage l4=new LAnguage( 3.5f);//single parameterized constructor with float
		
		LAnguage l5=new LAnguage("c#",9.0f);// constructor with 2 parameters
		LAnguage l6=new LAnguage("swift",5.2f);


		
	}

}
