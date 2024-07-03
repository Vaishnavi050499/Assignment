package com.shristi.scan;

import java.util.Scanner;

public class Evennum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range for even numbers");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
			System.out.print(i+" ");
	}
	System.out.println();
}
}
