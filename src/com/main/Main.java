package com.main;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.exception.InvalidInputException;
import com.trainmanagement.Bogie;
//import com.trainmanagement.CargoBogie;

import java.util.stream.Collectors;

import com.trainmanagement.Bogie;

/*
 * UC8: Filter Passenger Bogies Using Streams
 * 		Stored Bogies in class
 * 		Filter bogies with capacity > 60
 * 
 * @author Vivek
 * @version 8.0
 */



import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

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
		
		System.out.println("\nAll Bogies:");
		
		for(Bogie b : bogies) {
			System.out.println(b.getName() + " -> " + b.getCapacity());
		}
		
		bogies = bogies.stream().filter(bogie -> bogie.getCapacity() > 60).collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Filtered Bogies > 60:");
	}}



