package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.trainmanagement.Bogie;

/*
 * UC10: Count Total Seats in Train (reduce)
 * 		 Sum of capacity using reduce in stream
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
		
		int totalCapacity = bogies.stream().map(bogie -> bogie.getCapacity()).reduce(0, Integer::sum);
		
		System.out.println();
		System.out.println("Total seating capacity of train: " + totalCapacity);


	}

}