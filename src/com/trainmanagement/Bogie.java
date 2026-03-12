package com.trainmanagement;

import com.exception.InvalidInputException;

public class Bogie {
	private String name;
	private int capacity;
	
	
	public Bogie(String name,int capacity) throws InvalidInputException{
		if(capacity<=0) {
			throw new InvalidInputException("Capacity must be greater than 0");
		}
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) throws InvalidInputException{
		this.capacity = capacity;
	}
	
}
