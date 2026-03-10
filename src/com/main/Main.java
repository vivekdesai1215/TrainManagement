package com.main;
import java.util.*;

//Use Case 1 : Initialize class and Display Consist Summary
// This class represents the entry point of the Train Management System
// In this use case I initialized a ArrayList of Strings
// And I print the size of the List

public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		List<String> train = new ArrayList<>();
		
		System.out.println("Train Initialised Successfully.");
		System.out.println("Initial Bogie Count : "+train.size());
		System.out.println("Currently train consists : "+train.toString());
		
		System.out.println("System ready for operations !");
	}
}
