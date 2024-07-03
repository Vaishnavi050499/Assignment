package com.shristi.basic;

public class SmallestElementArray {
	public static void main(String[] args) {
		int arr[]= {20,1,9,5};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			min = Math.min(min, arr[i]);
		}
		System.out.println(min);
	}

}
