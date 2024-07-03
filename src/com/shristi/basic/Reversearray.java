package com.shristi.basic;

public class Reversearray {
public static void main(String[] args) {
	int arr[]= {20,35,12,55};
	int n=arr.length;
	int revarr[]=new int[n];
	int j=n;
	for(int i=0;i<n;i++) {
		revarr[j-1]=arr[i];
		j=j-1;
	}
	
	for(int i=0;i<n;i++)
		System.out.println(revarr[i]);
}
}
