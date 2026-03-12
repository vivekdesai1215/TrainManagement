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



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println(" Train Consist Management App ");
        System.out.println("==============================");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // First Cargo Bogie
        System.out.print("Enter type of Cargo Bogie (e.g., Cylindrical/Rectangular): ");
        String type1 = sc.nextLine();
        CargoBogie c1 = new CargoBogie(type1);

        System.out.print("Enter cargo to assign: ");
        String cargo1 = sc.nextLine();
        c1.assignCargo(cargo1);
        System.out.println();

        // Second Cargo Bogie
        System.out.print("Enter type of Cargo Bogie: ");
        String type2 = sc.nextLine();
        CargoBogie c2 = new CargoBogie(type2);

        System.out.print("Enter cargo to assign: ");
        String cargo2 = sc.nextLine();
        c2.assignCargo(cargo2);

    }


	
	public static class CargoSafetyException extends RuntimeException{
		public CargoSafetyException(String message){
			super(message);
		}
	}

}

