package com.lumen.extent;

public class CalcMain {

	public static void main(String[] args) {
Calculator calculator=new BasicCalculator();
calculator.add(10,50);
calculator.product(10,30);

Scientific scientific = new ScientificCalculator();
scientific.add(10,20);
scientific.product(10,40);
scientific.square(10);
scientific.cube(10);
	}

}
