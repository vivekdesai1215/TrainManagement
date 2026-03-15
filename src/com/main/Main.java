package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.exception.InvalidInputException;
import com.trainmanagement.Bogie;
import com.trainmanagement.CargoBogie;

/*
 * UC20: Exception Handling During Search Operations
 * 		 User triggers a search operation.
		 System checks whether the bogie collection is empty.
		 If no bogies are available, the system throws an IllegalStateException.
		 The operation stops immediately.
		 User receives a meaningful error message.
 * @author Vivek
 * @version 20.0
 */



import java.util.Scanner;
import java.util.Arrays;
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
        sc.nextLine(); // consume newline

        String[] bogies = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID " + (i + 1) + ": ");
            bogies[i] = sc.nextLine();
        }

        // Sort bogies for binary search
        Arrays.sort(bogies);

        System.out.println("\nAvailable Bogie IDs (sorted):");
        for (String s : bogies) System.out.println(s);

        // throwing an Exception if there areno bogies added
        if(bogies.length==0)throw new IllegalStateException("No bogies available in train consist. Search operation cannot proceed.");
       
        System.out.print("\nEnter Bogie ID to search: ");
        String searchID = sc.nextLine();
        boolean found = false;

        int left = 0;
        int right = bogies.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = searchID.compareTo(bogies[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println();
        if (found) System.out.println("Bogie " + searchID + " found in train consist");
        else System.out.println("Bogie " + searchID + " not found in train consist");

        sc.close();
    }
}
