package com.shristi.scan;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		int number=sc.nextInt();
		int n=number;
		int rev=0,rem;
		
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		if(number==rev)
		
			System.out.println(number+" "+"is a Palindrome number");
		
		else
			System.out.println(number+" "+"not a Palindrome number");
		
		sc.close();

}}
