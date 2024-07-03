package com.shristi.scan;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an array of usernames
        String[] usernames = {"Vaishu", "Varun", "Sai", "Yethu"};
        
        // Get user input for registration
        System.out.println("Enter name to register:");
        String nameToRegister = sc.nextLine();
        
        // Check if the name already exists in the array
        boolean nameExists = false;
        for (String username : usernames) {
            if (username.equalsIgnoreCase(nameToRegister)) {
                nameExists = true;
                break;
            }
        }
        
      
        if (nameExists) {
            System.out.println("Name is not unique");
        } else {
            System.out.println("You are registered");
        }
        
        sc.close();
    }
}