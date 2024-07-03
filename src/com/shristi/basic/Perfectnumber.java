package com.shristi.basic;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=21;
        int sum=1;
        for(int i=2;i<n;i++)
        {
        	if((n%i)==0)
        	{
        		sum+=i;
        	}
        }
        if(sum==n)
        	System.out.println(n +" is a perfect number");
        else 
        	System.out.println(sum +" is not a perfect number");
	}

}
