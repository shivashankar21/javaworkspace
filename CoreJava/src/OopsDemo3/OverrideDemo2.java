package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :3:00:34 pm
* Email :paspunoori.shankar@coforge.com
*/
public class OverrideDemo2 {
	public static void main(String[] args) {
		
		ElectronicsProduct ep1=new ElectronicsProduct("LPTOP", 9999.9, "DELL", "Latitude");
		ClothingProduct cp1= new ClothingProduct("T-shirt", 15.50f, "Medium ", "Indigo");
		
		System.out.println("**********Electronics Products******************");
		ep1.displayDetails();//call to Overridden Method 
		
		
		System.out.println("**********Clothing Products******************");
		cp1.displayDetails();// call to Overridden Method

	}

}
