package com.shristi.scan;

import java.util.Scanner;

public class Onedimsumandavg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		int sum=0;
		
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter the number"+i);
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	
	double avg=(double)(sum/n);
		System.out.println("Sum and Average of the given array is"+"\t"+sum+" "+avg);
	}

}
