package com.lumen.basics;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,a=1,b=1;
		Scanner sc = new Scanner(System.in);
		k=0;
		System.out.println("Enter any number");
		int n = sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n)
		{
			k=a+b;
			System.out.println(k +"");
			a=b;
		}
		

	}

}
