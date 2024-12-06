package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :12:03:20 pm
* Email :paspunoori.shankar@coforge.com
* 
* 
* Java Program to demonstrate Banking Transactions using Multi-Level Inheritance

*/
public class Account {
	private int accountNumber;
    private String name;
    
    
    
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
    
	 public void display() {
	        System.out.println("********** Account Details ***********");
	        System.out.println("Account Number : "+accountNumber);
	        System.out.println("Customer Name  :"+name);
	    }    
    
	

}
