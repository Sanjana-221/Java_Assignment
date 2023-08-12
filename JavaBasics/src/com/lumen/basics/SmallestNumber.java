package com.lumen.basics;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int min;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Array Elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		min=a[0];
		for(int i=1;i<=a.length;i++)
		{
			if (a[i]<min)
          {
	           min=a[i];
       }
		}
System.out.println("Smallest Element "+min);
	}

}
