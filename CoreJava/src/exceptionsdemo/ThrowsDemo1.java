package exceptionsdemo;
/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :4:18:07 pm
* Email :paspunoori.shankar@coforge.com
* 		Throws keyword is used to define exceptions , that a method can throw in OOP.

*/
public class ThrowsDemo1 {
		
		

		void division(int a, int b) throws ArithmeticException
		    {
		        int result = a/b;
		        System.out.println("The Division is : "+result);
		    }
		  public static void main(String[] args) {
			  ThrowsDemo1 td1=new ThrowsDemo1();

		        try{
		            td1.division(10,0);
		        }
		        catch (ArithmeticException e){
		            System.err.println(e);
		        }

		        try{
		            td1.division(10,3);
		        }
		        catch (ArithmeticException e){
		            System.err.println(e);
		        }
		}
}
