package com.shristi.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int anum=370;
		int originalsum=anum;
		int digit,cubesum=0;
		
		while(anum!=0)
		{
			 digit=anum%10;
			 cubesum+=(int) Math.pow(digit, 3);
			 anum=anum/10;
			
		}
		if (cubesum==originalsum)
			System.out.println(originalsum+"is an armstrongnumber");
		else
			System.out.println(originalsum+"is not an armstrongnumber");
	}

}
