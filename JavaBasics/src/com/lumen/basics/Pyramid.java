package com.lumen.basics;

public class Pyramid {
	static void pyramid(int num) {
		for(int i=num;i>0;i--) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pyramid(9);
	}
}


