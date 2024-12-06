package exceptionsdemo;
/**
 * Author:Paspunoori.Shankar
 * Date  :6 Nov 2024
 * Time  :3:27:01 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class ThrowDemo {

	public static void test(int a) {		
		if(a==0) 
			throw new ArithmeticException("Pass Non Zero Values : By shiva ");
		else 
			System.out.println("The Value passed to Method is : "+a);




	}
	public static void main(String[] args) {
		ThrowDemo.test(250);
		ThrowDemo.test(0);


	}
}
