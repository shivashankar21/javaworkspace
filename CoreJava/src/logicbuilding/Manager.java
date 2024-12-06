package logicbuilding;
/**
* Author:Paspunoori.Shankar
* Date  :15 Nov 2024
* Time  :11:48:05 pm
* Email :paspunoori.shankar@coforge.com
*/
 
public class Manager extends Employee{
 
	private Developer[] developers;
	private int developercount=0;
 
	public Manager(String name, double salary, int maxDevelopers) {
		super(name, salary);
		developers=new Developer[maxDevelopers];
	}
 
	public void addDeveloper(Developer developer) {
		if (developercount < developers.length) {
			developers[developercount++]=developer;
		}
		else {
			System.out.println("Cannot add more developers. Max limit reached.");
		}
	}
 
	// Overridden method to include managed developers in the details
	@Override
	public String getDetails() {
		StringBuilder details = new StringBuilder(super.getDetails() + ", Managing Developers:");
		for (int i = 0; i < developercount; i++) {
			details.append("\n  ").append(developers[i].getDetails());
		}
		return details.toString();
 
	}
}
 
