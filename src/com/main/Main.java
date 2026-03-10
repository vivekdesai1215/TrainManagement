package com.main;
import java.util.*;

//Use Case 6 : Using HashMap to store the Bogie Capacity along with the Bogie Name
// In this Use Case I have used HashMap to store Bogie capacity along with the Bogie name


// @version 6.0
// @author Vivek


public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		
		Map<String,Integer> train = new HashMap<>();
		train.put("Engine", 2);
		train.put("First Class", 50);
		train.put("Second Class", 100);
		train.put("Third Class", 150);
		train.put("Sleeper", 240);
		
		System.out.println("\nBogie Capacity Details : ");
		for(Map.Entry<String, Integer> entry : train.entrySet()) {
			System.out.println(entry.getKey()+ " -> "+entry.getValue());
		}
		
		
		System.out.println("\nUC6 Operations completed successfully !!");
	}
	
}

