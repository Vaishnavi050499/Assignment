package com.shristi.basic;

public class Factorial {

	public static void main(String[] args) {
		int n=4;
		int result=1;
		for(int i=n;i>=1;i--)
		{
			result=result*i;
		}
			System.out.println("Factorial of the number is"+"\t"+result);

	}

}
