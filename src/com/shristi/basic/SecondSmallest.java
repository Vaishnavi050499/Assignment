package com.shristi.basic;

public class SecondSmallest {
public static void main(String[] args) {
	      int arr[]= {2,5,3,4};
	      int n=arr.length;
	      int small=arr[0];
	      int ssmall=Integer.MAX_VALUE;
	      for(int i=1;i<n;i++)
	      {
	    	  if(arr[i]<small)
	    	  {
	    		  ssmall=small;
	    		  small=arr[i];
	    	  }
	    	  
	    	  if(arr[i]>small && arr[i]<ssmall)
	    		  ssmall=arr[i];
	      }
	      
	      System.out.println(ssmall);
	      }
}
