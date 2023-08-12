package com.lumen.basics;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		boolean b = isPerfect(n);
		if(b)
			System.out.println("Its a Perfect Number");
		else
			System.out.println("Its not a perfect Number");

	}

	private static boolean isPerfect(int n) 
	{
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum=sum +=i;
		}
		if(n==sum)
			return true;
		return false;
		
		
		
	}
	

}
