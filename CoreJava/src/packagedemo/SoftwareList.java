package packagedemo;
import com.coforge.microsoft.OperatingSystem;
import com.coforge.oracle.*;
/**
* Author:Paspunoori.Shankar
* Date  :4 Nov 2024
* Time  :3:13:24 pm
* Email :paspunoori.shankar@coforge.com
*/
public class SoftwareList {

	public static void main(String[] args) {
		
		Database db1= new Database();
		
		OperatingSystem os1=new OperatingSystem();
		
		System.out.println("*****************DATABASE SOFTWARE****************");
		db1.printSoftware();
		
		System.out.println("*****************OPERATING SYSTEM******************");
		os1.listSoftware();	
		
	}

}
