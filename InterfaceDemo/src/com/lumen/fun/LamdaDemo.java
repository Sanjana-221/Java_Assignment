package com.lumen.fun;

public class LamdaDemo {
	public static void main(String[] args) {
		//implementation
		Greeter greeter=(String username)->{
			System.out.println("Hello" +username);
			
		};
		//calling the method
		greeter.greetUser("Jhope");
		Greeter greeter1 = username->  System.out.println("Welcome"+username);
		greeter1.greetUser("jhope");
		
	}

}
