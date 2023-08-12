package com.lumen.basics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int no;
		int i = 0;
		for(int no1=1;i<=100;no1++)
		{
			for(int i1=2;i1<=no1-1;i1++)
			{
				if(no1%i1==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no1);
			}
			temp=0;
		}

	}

}
