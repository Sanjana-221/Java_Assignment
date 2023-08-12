package com.lumen.basics;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int average=sum/a.length;
		System.out.println("sum:"+sum);
		System.out.println("average:"+average);

	}

}
