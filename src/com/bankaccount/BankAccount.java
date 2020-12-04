package com.bankaccount;

public class BankAccount {
	public String name;
	public String accountingNumber;
	public Double checkingBalance = 0.0;
	public Double savingsBalance = 0.0;
	public static Integer totalAccounts = 0;
	static Double totalMoney = 0.0;
	public BankAccount(String name){
		this.name = name;
		this.totalAccounts += 1;
	}
	public void depositSavings(Double check) {
		this.savingsBalance = check + savingsBalance;
		this.totalMoney += check;
		System.out.println(name + " You deposited " + check + " into your savings. Your total savings is " + savingsBalance);		  
	}
	public void depositChecking(Double check) {
		this.checkingBalance = check + checkingBalance;
		this.totalMoney += check;
		System.out.println(name + " You deposited " + check + " into your savings. Your total Checking is " + checkingBalance);
	}
	public void checkBalance() {
		System.out.println(name + " your savings $"+this.savingsBalance);
		System.out.println(name + " your checking $"+this.checkingBalance);
	}
	public void checkTotalBalance() {
		System.out.println(name + " your total $"+ (this.savingsBalance + this.checkingBalance));

	}
	public void withdrawlCheckingMoney(Double withdraw) {
		this.checkingBalance -= withdraw;
		if(this.checkingBalance < 00.00) {
			this.checkingBalance += withdraw;
			System.out.println(name + " You dont have enough funds to withdrawl that amount from this account!");
		} else {
			System.out.println(name + " Your current balance after withdraw from checking: $" + this.checkingBalance);

		}

	}
	public void withdrawlSavingsMoney(Double withdraw) {
		this.savingsBalance -= withdraw;
		if(this.savingsBalance < 00.00) {
			this.savingsBalance += withdraw;
			System.out.println(name + " You dont have enough funds to withdrawl that amount from this account!");
		} else {
			System.out.println(name + " Your current balance after withdraw from savings: $" + this.savingsBalance);

		}

	}
}
