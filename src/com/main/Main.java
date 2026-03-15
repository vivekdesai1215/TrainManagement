package com.main;
import java.util.*;

//Use Case 2 : Add Passenger Bogies to Train (ArrayList Operations)
// In this use case We implemented how We can add passenger bogies, How to remove Passenger bogies and How to check if some bogie exists
// and then print the passenger bogies that have been added
public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		List<String> train = new ArrayList<>();
		
		train.add("Sleeper");
		train.add("AC Chair");
		train.add("First Class");
		train.add("Second Class");
		System.out.println("\n After adding bogies ");
		System.out.println("Passenger Bogies :"+train.toString());
		
		System.out.println("\n After removing 'AC Chair '");
		train.remove("AC Chair");
		System.out.println("Passenger Bogies : "+train.toString());
		
		System.out.println("\n Checking if Sleeper exists");
		boolean check = train.contains("Sleeper");
		System.out.println("Sleeper exists ? : "+check);
		
		System.out.println("UC2 Operations completed successfully !!");
	}
}



