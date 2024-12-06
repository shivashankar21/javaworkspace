package OopsDemo1;

/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :12:40:07 pm
* Email :paspunoori.shankar@coforge.com
*/
public class ThisDemo {

		
		
		private int number;
		private String text;
		
		//Default Constructor - 
				//Compiler Creates it for Automatic initialization of Object Properties
		
		//This keyword refers to Current Object calling the Method
		public void setvalues(int number , String Text, String text) {
		  this.number=number;//demo 1 .number= number 
		  this.text=text;
		  
	  }
	  
	  
	  
	  public void display() {
			System.out.println("Number : "+this.number);
			System.out.println("Text   : "+this.text);
		}
		
	public static void main(String[] args) {
		
		
		ThisDemo demo1=new ThisDemo();
		ThisDemo demo2=new ThisDemo();
		
		demo1.setvalues(100, "Java Programming", "yhjh"); //Method call
		demo2.setvalues(200, "Spring Programming","hffkj");//Method call
		
		demo1.display();
		demo2.display();
	}

}
