package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :12:14:50 pm
* Email :paspunoori.shankar@coforge.com
*/
public class Addition {
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void add(){
		System.out.println("****************Method Overloading Demo*******************");
		System.out.println("The Addition of 2 numbers is: "+(a+b));
		
	}
	
	public void add(int x) {
		System.out.println("The Addition of single number to itself id : "+(x+x));
		
	}
	
	public void add(int x,int y) {
		System.out.println("The Addition of 2 numbers : "+(x+y));
		
	}
	
	public void add(int x,float y) {
		System.out.println("The Addition of sof a integer and float : "+(x+y));
		
	}
	
	public void add(String  x,String y) {
		System.out.println("The Addition of 2 Strings: "+(x+y));
		
	}
	public void add(double x ,double y) {
		System.out.println("The Addition of 2 float numbers : "+(x+y));
		
	}
	public void add(int x,int y, int z ) {
		System.out.println("The Addition of 3 integers : "+(x+y+z));
		
	}
}
