package com.shristi.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        // Create an array of usernames
        String[] usernames = {"Vaishu", "Varun", "Sai", "Yethu"};
        
        // Get user input for registration
        System.out.println("Enter username to login");
        String nameToLogin = sc.nextLine();
        
        boolean exist=false;
        for(String name:usernames)
        {
        	if(name.equalsIgnoreCase(nameToLogin))
        	{
        		exist=true;
        		break;
        	}
        }
        
        if(exist==true)
        {
        	System.out.println("You are logged in successfully");
        	
        }
        else 
        	System.out.println("Invalid username");
        sc.close();
    	
	}

}
