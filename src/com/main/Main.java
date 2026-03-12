package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.trainmanagement.Bogie;

/*
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 * 		Grouped the same bogies in a map
 * 		Used Stream to do grouping
 * 
 * @author Vivek
 * @version 8.0
*/



public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		List<Bogie> bogies = new ArrayList<>();
		
		boolean end = true;
		do {
			System.out.print("\nWanna add Bogie  ?(y/n) : ");
			String option = sc.nextLine();
			if(!option.equalsIgnoreCase("y")) {
				break;
			}
			
			System.out.print("Enter Bogie Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Bogie Capacity : ");
			int capacity = sc.nextInt();
			sc.nextLine();
			bogies.add(new Bogie(name,capacity));
			
		}while(end=true);
		

		System.out.println("All Bogies:");
		
		for(Bogie b : bogies) {
			System.out.println(b.getName() + " -> " + b.getCapacity());
		}
		
		Map<String,List<Bogie>> groupedMap = bogies.stream().collect(Collectors.groupingBy(bogie -> bogie.getName().strip()));
		
		System.out.println();
		System.out.println("Grouped Bogies:\n");

		for(String key : groupedMap.keySet()) {
			System.out.println("Bogie Type: " + key);
			for(Bogie b : groupedMap.get(key)) {
				System.out.println("Capacity -> " + b.getCapacity());
			}
			System.out.println();
		}
		

	}

}