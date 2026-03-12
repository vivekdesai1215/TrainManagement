package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.trainmanagement.Bogie;
import com.trainmanagement.CargoBogie;

/*
 * UC12: Safety Compliance Check for Goods Bogies
 * 		 Used Stream allMatch to check Validation
 * 		 Validation checking train is same or not
 * 		 Cylindrical only petroleum condition is used
 * 		 
 * @author Vivek
 * @version 12.0
*/



public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		List<CargoBogie> cargoBogie = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		do {
			System.out.print("\nWanna add Bogie  ?(y/n) : ");
			String option = sc.nextLine();
			if(!option.equalsIgnoreCase("y")) {
				break;
			}
			
			System.out.print("Enter Bogie Type  :(Cylindrical,Open,Box,...): ");
			String type = sc.nextLine();
			System.out.print("Enter the Cargo being transported (Petroleum, Coal, Grain,...): ");
			String cargo = sc.nextLine();
			cargoBogie.add(new CargoBogie(type,cargo));
			
		}while(end=true);
		
		System.out.println("Goods Bogies in Train: ");
		for(CargoBogie b : cargoBogie) {
			System.out.println(b.type + " -> " + b.cargo);
		}
		System.out.println();

		boolean isSafe = cargoBogie.stream().allMatch(bogie -> validateBogie(bogie));

		System.out.println("Safety Compliance Status: " + isSafe);

		if(isSafe) System.out.println("Train formation is SAFE");
		else System.out.println("Train formation is NOT SAFE");

		}
	
	
		public static boolean validateBogie(CargoBogie b) {
		if ("cylindrical".equalsIgnoreCase(b.type)) {
		    return "Petroleum".equalsIgnoreCase(b.cargo);
		}
		return true;
		}
		


	}





