package com.shristi.basic;

public class Patern2 {
	//pattern 1 23 456 789
	
	public static void main(String[] args) {
		   int a = 1,n=5;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(a++ +" ");
	            }
	            System.out.println();
	}

}}
