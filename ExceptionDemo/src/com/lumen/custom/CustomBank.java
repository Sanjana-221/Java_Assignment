package com.lumen.custom;

public class CustomBank {
	double balance;
	public CustomBank(double balance) {
		super();
		this.balance= balance;
		
	}
	
void withdraw(double amount)throws ExceedingLimitException,NegativeBalanceException {
	System.out.println("In Withdraw method");
	//AMOUNT>1000 ExceedingLimitException
	throw new ExceedingLimitException("Limit exceed");

//balance is negative throw NegBalanceException
if(balance - amount<=0)
	throw new NegativeBalanceException("balance is negative");
//if all good
balance =  balance=amount;
System.out.println("Balance"+balance);
}
}
