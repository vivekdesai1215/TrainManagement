package com.main;
import java.util.*;

//Use Case 3 : Using Hashset to avoid adding duplicate Bogie Ids
// In this use case I used HashSet to maintain unqiue BogiIds,
// HashSet automatically rejects duplcate addition

// @version 3.0
// @author Vivek


public class Main {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------");
		System.out.println("-------- Train Management App ----------");
		System.out.println("----------------------------------------");
		Set<String> bogieIds = new HashSet<>();
		
		bogieIds.add("BG101");
		bogieIds.add("BG101"); // Trying to enter duplicate value
		bogieIds.add("BG102");
		bogieIds.add("BG102"); // trying to add duplicate value
		bogieIds.add("BG103");
		bogieIds.add("BG105");
		
		System.out.println("Bogie ids added into HashSet : "+bogieIds.toString());
		
		System.out.println("UC3 Operations completed successfully !!");
	}
}
