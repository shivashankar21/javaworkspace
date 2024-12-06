package OopsDemo3;
/**
* Author:Paspunoori.Shankar
* Date  :29 Oct 2024
* Time  :3:40:50 pm
* Email :paspunoori.shankar@coforge.com
*/
public class SavingsAccount extends Account{
	
	private double interestRate;
	

	public SavingsAccount(String name, double balance,double interestRate) {
		super(name, balance);
		this.interestRate=interestRate;
		
	}
	//generate getters


	public double getInterestRate() {
		return interestRate;
	}
	
}
