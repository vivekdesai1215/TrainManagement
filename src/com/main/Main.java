package com.main;
import java.util.*;

//Use Case 5 : Using LinkedHashSet to maintain Insertion Order and avoid Duplicate Insertion
// In this use case I used LinkedHashSet to insert train bogies
// LinkedHashSet maintains the Insertion order of Bogies and also avoids Duplicate Insertions

// @version 5.0
// @author Vivek


public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		Set<String> train = new LinkedHashSet<>();
		
		train.add("Engine");
		train.add("Sleeper");
		train.add("AC");
		train.add("Cargo");
		train.add("Guard");
		System.out.println("Train contains : "+train.toString());
		System.out.println("\nUC5 Operations completed successfully !!");
	}
	
}

