package com.main;
import java.util.*;

import com.trainmanagement.Bogie;


/*
 * UC7: Sort Bogies by Capacity (Comparator)
 * 		Stored in class
 * 		sorted using comparator
 * 		sorted on basis of capacity
 * 
 * @author Dilpreet
 * @version 7.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		List<Bogie> bogies = new ArrayList<>();
		
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("General",90));
		
		System.out.println("Before sorting:");
		
		for(Bogie b : bogies) {
			System.out.println(b.getCapacity() + " -> " + b.getCapacity());
		}
		
		Collections.sort(bogies, Comparator.comparingInt(bogie -> bogie.getCapacity()));
		
		System.out.println();
		System.out.println("After sorting:");

		for(Bogie b : bogies) {
			System.out.println(b.getName() + " -> " + b.getCapacity());
		}
		

	}

}