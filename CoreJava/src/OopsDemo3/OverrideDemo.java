package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :2:43:19 pm
* Email :paspunoori.shankar@coforge.com
*/
public class OverrideDemo {
	public static void main(String[] args) {
		
		SBI sbibank=new SBI("SBI");
		Axis axisbank=new Axis("Axis");
		Icici icicibank = new Icici("ICICI");
		
		sbibank.display();// invokes base class method 
		//invokes Overridden Method
		System.out.println("\t The Interate Rate is :"+sbibank.getRAteofInterest()+"%");
		
		icicibank.display();
		System.out.println("\t The Interate Rate is :"+icicibank.getRAteofInterest()+"%");
		
		axisbank.display();
		System.out.println("\t The Interate Rate is :"+axisbank.getRAteofInterest()+"%");

	}

}
