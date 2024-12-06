package OopsDemo3;
/**
 * Author:Paspunoori.Shankar
 * Date  :29 Oct 2024
 * Time  :3:37:23 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class Account {
	//class for Account Operations

	private String name;
	protected double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
// Generate only getters
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	//final methods cannot be overridden
    public final void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing : "+amt);
    }
    
    //Overridden Method
    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdrawing :"+amt);
    }
	

}
