package com.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount dylan = new BankAccount("Dylan");
		BankAccount sadie = new BankAccount("Sadie");

		dylan.depositSavings(356.67);
		dylan.depositChecking(100.00);
		dylan.checkBalance();
		dylan.withdrawlCheckingMoney(90.00);
		dylan.withdrawlSavingsMoney(90.00);
		dylan.checkBalance();

		sadie.depositSavings(5000.00);
		sadie.depositChecking(8000.00);
		sadie.checkBalance();
		sadie.withdrawlCheckingMoney(1000.00);
		sadie.withdrawlSavingsMoney(1000.00);
		sadie.checkBalance();
		sadie.depositSavings(1000.00);
		sadie.checkBalance();
		sadie.checkTotalBalance();

		
	}
	
}
