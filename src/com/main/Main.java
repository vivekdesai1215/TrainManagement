package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.trainmanagement.Bogie;

/*
 * UC11: Validate Train ID & Cargo Codes (Regex)
 * 		 Used Pattern Class to compile and store my custom Regex pattern
 * 		 Used TrainIDPattern and CargoIDPattern
 * 		 Used Mather class to match the input string to the compiled regex pattern
 * 		 Taking input and matches with pattern
 * 		 Printing validation Result
 * 
 * @author Vivek
 * @version 10.0
*/



public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		
		// Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainInput = sc.nextLine();
        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoInput = sc.nextLine();
        System.out.println();
        
        Matcher trainMatcher = trainIdPattern.matcher(trainInput);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoInput);
        
        System.out.println("Validation Result: ");
        System.out.println("Valid Train ID: " + trainMatcher.matches());
        System.out.println("Valid Train ID: " + cargoMatcher.matches());


	}

}