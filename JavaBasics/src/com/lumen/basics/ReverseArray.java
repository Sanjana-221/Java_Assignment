package com.lumen.basics;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
int[] original = {90,-9,33,4,55,67,73};
int[] reverse=new int[original.length];
for(int i=0;i<original.length;i++) {
	reverse[original.length-i-1]=original[i];
}
System.out.println(Arrays.toString(reverse));
	}

}
