package OopsDemo2;
/**
* Author:Paspunoori.Shankar
* Date  :28 Oct 2024
* Time  :12:12:27 pm
* Email :paspunoori.shankar@coforge.com
*/
public class AccountTransactions extends SavingsAccount{
	
	public AccountTransactions(int accountNumber, String name, float minimumBalance, double balance,double withdrawal,double deposit) {
		super(accountNumber, name, minimumBalance, balance);
		this.withdrawal=withdrawal;
		this.deposit=deposit;
		
	}

	private double withdrawal,deposit,finalBalance;
	
	
	public void display()
    {
        super.display();
        System.out.println("Deposit Amount    : "+deposit);
        System.out.println("Withdrawal Amount : "+withdrawal);
        finalBalance=(balance+deposit)-withdrawal;
        System.out.println("Final Balance     : "+finalBalance);
    }

}
