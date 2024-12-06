package newfeatures;
/**
* Author:Paspunoori.Shankar
* Date  :8 Nov 2024
* Time  :3:26:44 pm
* Email :paspunoori.shankar@coforge.com
*/
//Method Reference - Shorthand of Lambda expression to call method


@FunctionalInterface
interface MyInterface
{
	void myMethod();
}
class Test // instance class
{
		void display() // instance method
		{
			System.out.println("Iam a Instance Method");
		}
}


public class MethodReferenceDemo1 {
	
	//traditional approach
			Test t1=new Test();
			t1.display();
			
			//Java8 Method Reference approach
			MyInterface m1ref=t1::display; // method reference to instance method of Object
			
			//calling method of FI
			m1ref.myMethod();
			
			// Lambda ---> FI
			// MR--- shorthand of Lambda
			//MR -->FI
	
	

}
