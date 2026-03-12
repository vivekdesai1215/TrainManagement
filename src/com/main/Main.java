package com.main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.exception.InvalidInputException;
import com.trainmanagement.Bogie;
import com.trainmanagement.CargoBogie;

/*
 * UC17: Sort Bogie Names Using Arrays.sort()
 * 		 User provides bogie type names.
		 System calls Arrays.sort() on the array.
		 Java internally sorts the values.
		 Sorted bogie names are displayed.
		 Program continues.		 
 * @author Vivek
 * @version 17.0
 */



import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();

		String[] capacities = {"Sleeper","AC Chair","First Class","General","Luxury"};
		
		System.out.println("Original Bogies:");
		System.out.print(Arrays.toString(capacities) + "\n\n");
		
		Arrays.sort(capacities);
		
		System.out.println("Sorted Bogies: ");
		System.out.print(Arrays.toString(capacities));
	}

}

