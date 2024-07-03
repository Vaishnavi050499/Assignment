package com.shristi.scan;

import java.util.Scanner;

public class SmallestusingAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Enter the value of c");
		int c = sc.nextInt();
		
		if(a<b && a<c)
		{	System.out.println(a + " is the smallest number");
		}
		else if(b<c) {
					
			System.out.println(b+ " is the smallest number");}
		else {
			System.out.println(c + " is the smallest number");		
		}

}}
