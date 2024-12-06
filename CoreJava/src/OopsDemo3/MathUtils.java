package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :4:51:51 pm
* Email :paspunoori.shankar@coforge.com
* 
* Static Methods Demo
*/
public class MathUtils {
	public static int square (int num) {
		return num*num;
		
	}
	public static int myAddition(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		
		int result= MathUtils.square(5);
		 System.out.println("The square of 5 is: "+result);
		 System.out.println("The Addition of 2 nos is :" +MathUtils.myAddition(400, 120));
	}
}
