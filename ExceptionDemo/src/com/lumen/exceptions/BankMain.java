package com.lumen.exceptions;

public class BankMain {
public static void main(String[]args) throws Exception {
	Bank bank = new Bank(6000);
	bank.withdraw(2000);
	try {
		bank.withdraw(2000);
	System.out.println("Amount withdraw");
	
}catch(Exception e) {
	System.out.println("try again");
	System.out.println("e.getMessage");
}
}
}

