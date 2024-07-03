package com.shristi.scan;

import java.util.HashMap;
import java.util.Map;

public class MaxLetterinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> map=new HashMap<>();
		int max=0;
		Character res = null;
		
		String s ="shristiLabs";
		for(int i=0;i<s.length();i++)
		{Character c=s.charAt(i);
			if(map.containsKey(s.charAt(i)))
			{   
				
				map.put(s.charAt(i),map.get(c)+1);
			}
			else
				map.put(c,1);
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		
		if(entry.getValue()>max)
		{
			max=entry.getValue();
			res=entry.getKey();
		}

	}
		
		System.out.println("Letter"+" "+res+" "+"Occurred maximum of"+" "+ max+" "+"times");

}}
