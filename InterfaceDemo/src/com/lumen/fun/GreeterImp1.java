package com.lumen.fun;

public class GreeterImp1 implements Greeter {

	@Override
	public void greetUser(String username) {
		System.out.println("Greet Day" + username);
	}

}
