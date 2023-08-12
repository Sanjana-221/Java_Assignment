package com.lumen.fun;

public class ShapeFactory {
	public void printArea(Shape shape, double x, double y) {
		System.out.println("Printing Area...");
		shape.calcArea((int)x, (int)y);
		System.out.println("Done!");
	}

	public void printArea1(Shape shape, double x, double y) {
		// TODO Auto-generated method stub
		
	}
}









