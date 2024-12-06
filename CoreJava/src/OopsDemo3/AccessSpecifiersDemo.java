package OopsDemo3;

import OopsDemo1.complex;

/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :9:53:01 am
* Email :paspunoori.shankar@coforge.com
*/
class Test{
	
	
	int a; // default variable - accessible within the package
	private int b; //private variable - accessible within class only
	protected int c; // accessible in class & subclass
	public int d; //accessible from any part of the project
	
	  public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	void display(){ // default method
			System.out.println("Private Variable : "+b);
		}	
}


class Test2 extends Test{

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	public void  Display() {
		System.out.println("Protected Variable: " +c);
	}
	
}


public class AccessSpecifiersDemo {
	public static void main(String[] args) {
		
		Test t1= new Test(100,200,300,400);
		t1.display();
		//t1.b=500;//compilation error -private variables cannot be accessed 
		Test t2 = new Test(300,400,500,600);
		t2.display();
		
		complex  complex1=new complex(10.3,67.4);
		complex complex2=new complex(0.7,3.6);
		
		complex1.add(complex2);
		complex1.display();
		
		
	}

}
