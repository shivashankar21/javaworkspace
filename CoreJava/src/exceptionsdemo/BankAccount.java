package exceptionsdemo;
/**
* Author:Paspunoori.Shankar
* Date  :6 Nov 2024
* Time  :4:41:03 pm
* Email :paspunoori.shankar@coforge.com
* 
Java program that demonstrates the use of a custom exception.
 * This example involves a bank account system where a custom
 * exception is used to handle insufficient funds.
 
*/
public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

 
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //Method might throw custom Exception InSufficientFundsException
    public void withdraw(double amount) throws InSufficientFundsException {
        if (amount > balance) {
            throw new InSufficientFundsException("Insufficient funds for withdrawal.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}