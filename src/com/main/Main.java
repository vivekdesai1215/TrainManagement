package com.main;
import java.util.*;

//Use Case 4 : Using LinkedList to maintain insertion Order
// In this use case I LinkedList to maintain Insertion order of bogies
// And also perform LinkedList operations

// @version 4.0
// @author Vivek


public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		List<String> train = new LinkedList<>();
		
		train.add("Engine");
		train.add("Sleeper");
		train.add("AC");
		train.add("Cargo");
		train.add("Guard");
		System.out.println("Initially Train contains : "+train.toString());
		
		System.out.println("\nInsterting 'Pantry Car' at 2nd position");
		train.add(2,"Pantry Car");
		System.out.println("Train : "+train);
		train.removeFirst();
		train.removeLast();
		System.out.println("\nAfter removing first and last bogie.");
		System.out.println("Train contains : "+train);
		
		
		System.out.println("\nUC4 Operations completed successfully !!");
	}
	
}

