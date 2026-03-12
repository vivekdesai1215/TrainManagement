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
		
		List<Bogie> bogies = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
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
		
		long startTime1 = System.nanoTime();
		List<Bogie> list1 = bogies.stream().filter(bogie -> bogie.getCapacity() > 60).collect(Collectors.toList());
		long endTime1 = System.nanoTime();
		
		List<Bogie> list2 = new ArrayList<>();
		long startTime2 = System.nanoTime();
		for(Bogie bogie : bogies) {
			if(bogie.getCapacity() > 60) {
				list2.add(bogie);
			}
		}
		long endTime2 = System.nanoTime();
		
		
		System.out.println("Stream Execution Time(ns): " + (endTime1-startTime1));
		System.out.println("Loop Execution Time(ns): " + (endTime2-startTime2));
		
		System.out.println((endTime1-startTime1) >(endTime2-startTime2)? "Loop Execution was faster than Stream":"Stream execution was faster than Loop" );
	}

	}





