package com.lumen.basics;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,25};
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i*1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("Second largest element ="+a[i]);
		}

	}

}
