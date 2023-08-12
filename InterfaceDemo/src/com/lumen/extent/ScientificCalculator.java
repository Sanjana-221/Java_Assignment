package com.lumen.extent;
public class ScientificCalculator implements Scientific {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int product(int x, int y) {
		return x*y;
	}
	@Override
	public int square(int x) {
		return x*x;
	}

	@Override
	public int cube(int x) {
		return x*x*x;
	}
}



	

