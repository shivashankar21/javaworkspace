package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :12:27:53 pm
* Email :paspunoori.shankar@coforge.com
*/
public class OverloadDemo {
	public static void main(String[] args) {
		
		
		Addition ad1=new Addition(33, 45);
		
		ad1.add();
		ad1.add(999);
		ad1.add(89, 175);
		ad1.add(450,350.50f);
		ad1.add(20.50F,45.50f);//type promotion-calls methods with double type parameters
		ad1.add("Hello","World");
		ad1.add(300,250,500);
	
	}
}
