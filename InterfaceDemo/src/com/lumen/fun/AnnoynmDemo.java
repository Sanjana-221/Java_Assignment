package com.lumen.fun;

public class AnnoynmDemo {
	public static void main(String[]args) {
		Greeter greeter= new GreeterImp1();
		greeter.greetUser("Whiskey");
		Greeter greeter2 = new Greeter() {
			
			@Override
			public void greetUser(String username) {
				// TODO Auto-generated method stub
				
			}
		};
		greeter2.greetUser("Jhope");
		Greeter greeter3 = new Greeter() {
			
			@Override
			public void greetUser(String username) {
				// TODO Auto-generated method stub
				
			}
		};
		greeter2.greetUser("Jhope");
	};
}
