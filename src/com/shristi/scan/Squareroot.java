package com.shristi.scan;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		double resultarr[]=new double[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the number"+i);
			arr[i]=sc.nextInt();
			resultarr[i] =Math.sqrt(arr[i]);
	       
	}
		
		for(double num:resultarr)
		          System.out.println(num);
		

}}
