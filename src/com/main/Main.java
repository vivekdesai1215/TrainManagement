package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.exception.InvalidInputException;
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

		List<Bogie> bogies = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		do {
			try {

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
			}catch(InvalidInputException e) {
				System.out.println(e.getMessage());
			}}while(end=true);


	}
}

