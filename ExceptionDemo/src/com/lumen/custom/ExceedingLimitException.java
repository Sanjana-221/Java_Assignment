package com.lumen.custom;

public class ExceedingLimitException extends Exception {

	private Object balance;
	public ExceedingLimitException(Object balance) {
		super();
		this.balance = balance;
	}
	public ExceedingLimitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	}
	


