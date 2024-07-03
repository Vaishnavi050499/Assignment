package com.shristi.basic;

public class SumndAvg {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int n=a.length;
		int sum=0,avg=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			
		}
		avg = sum/n;
		System.out.println("Sum is"+" "+sum+"\t"+"\n"+"Avg is"+" "+avg);
	}

}
