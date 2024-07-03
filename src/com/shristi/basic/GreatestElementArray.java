package com.shristi.basic;

public class GreatestElementArray {

	public static void main(String[] args) {
		int arr[]= {100,20,50,60,1};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		
		System.out.println(max);

	}

}
