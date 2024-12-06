package OopsDemo1;
/**
* Author:Paspunoori.Shankar
* Date  :26 Oct 2024
* Time  :4:49:28 pm
* Email :paspunoori.shankar@coforge.com
*/
//object class is a parent of all java classes
class Test{
//Implement Finalize() Method of object class
	//Destructor Method-Destroys Object
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object Destroyed & Garbage Collector ");
		
	}
	
}
public class DestructorDemo {
	public static void main(String[] args) {
		
		//invokes default constructor 
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();

		
		
		t1=null;
		t2=null;
		t3=null;
		
		
		System.gc();//invokes service method gc(), which in-turn invokes finalize Method

		
		
	}
	

}
