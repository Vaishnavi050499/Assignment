package com.shristi.basic;

public class Secondlargest {

	public static void main(String[] args) {
		int arr[]= {2,5,3,4};
	      int n=arr.length;
	      int largest=arr[0];
	      int slargest=-1;
	      for(int i=1;i<n;i++)
	      {
	    	  if(arr[i]>largest)
	    	  {
	    		  slargest=largest;
	    		  largest=arr[i];
	    	  }
	    	  
	    	  if(arr[i]<largest && arr[i]>slargest)
	    		  slargest=arr[i];
	      }
	      
	      System.out.println(slargest);


	}

}
