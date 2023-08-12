package com.lumen.fun;

public class ProcessMain {

	public static void main(String[] args) {
Processor processor= new Processor();
//NewCalculator adder = new Adder();
//processor.processData(adder);
//processor.processData(new Adder(),10,20);
////Anonymous
//
//processor.processData(new NewCalculator() {
//	
//	@Override
//	public void calculate(int x, int y) {
//		System.out.println("Sum "+(x+y));
//	}
//	},20,10);

//lambda
processor.processData((int x, int y)->{
	System.out.println(x-y);
},90,20);
	}
}
