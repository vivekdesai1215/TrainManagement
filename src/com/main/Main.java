package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.exception.InvalidInputException;
import com.trainmanagement.Bogie;
import com.trainmanagement.CargoBogie;

/*
 * UC18: Linear Search for Bogie ID (Array-Based Searching)
 * 		 User provides a list of bogie IDs.
		 User provides a search key.
		 System traverses the array sequentially.
		 Each element is compared with the search key.
		 If match found, search stops.
		 Result is displayed.	 
 * @author Vivek
 * @version 18.0
 */



import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        System.out.println("==============================");
	        System.out.println(" Train Consist Management App ");
	        System.out.println("==============================");
	        System.out.println();

	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter number of bogies: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        String[] bogies = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Bogie ID " + (i + 1) + ": ");
	            bogies[i] = sc.nextLine();
	        }

	        System.out.println("\nAvailable Bogie IDs:");
	        for (String s : bogies) System.out.println(s);

	        System.out.print("\nEnter Bogie ID to search: ");
	        String searchID = sc.nextLine();
	        boolean found = false;

	        for (String s : bogies) {
	            if (s.equals(searchID)) {
	                found = true;
	                break;
	            }
	        }

	        System.out.println();
	        if (found) System.out.println("Bogie " + searchID + " found in train consist");
	        else System.out.println("Bogie " + searchID + " not found in train consist");

	        sc.close();
	    }

}

