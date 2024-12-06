package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :30 Oct 2024
* Time  :9:40:10 am
* Email :paspunoori.shankar@coforge.com
*/

class MyDemo{
	//private static final int MAX_AGE =65;//final variable
	
	private int age=21;
	
	public void test() {
		//MAX_AGE=60;//final variable cannot be overridden
	}
	//final method
	public final void test1() {
		System.out.println("The Age is: "+age);
	}
}
/*
 * class MyTemp extends MyDemo{
 * 
 * // public void test1() {//final methods cannot be overriding //
 * System.out.println("The Age is: "+age); // } //
 * 
 * }
 */

final class Hello{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
	
}

/*
 * class World extends Hello{// final classes cannot be modified
 * 
 * }
 */
public class FinalDemo {
	public static void main(String[] args) {
		
	}

}
