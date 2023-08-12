package com.lumen.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		System.out.println("Enter any Number ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.println(r);
			n=n/10;
		}

	}

}
