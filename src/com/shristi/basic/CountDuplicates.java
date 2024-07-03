package com.shristi.basic;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
	 public static void main(String[] args)  {
		 int arr[]= {2,2,4,5,4};
	 Map<Integer, Integer> freq = new HashMap<>();
     
     // Iterate through the array.
     for (int i = 0; i < arr.length; i++) {
         // Check if the element is already in the HashMap.
         if (freq.containsKey(arr[i])) {
             // If it's already in the HashMap, increment its frequency.
             freq.put(arr[i], freq.get(arr[i]) + 1);
              
         }
         else {
             // If the element is not in the HashMap, add it with a frequency of 1.
             freq.put(arr[i], 1);
         }
         
         
     }
     for(Map.Entry<Integer, Integer> entry :  freq.entrySet()){
                   
         if(entry.getValue() > 1)
         {
             System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
         }
     }
 }


}

