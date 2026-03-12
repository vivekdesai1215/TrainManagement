package com.trainmanagement;

import com.exception.CargoSafetyException;

public class CargoBogie {
	public String type;
	public String cargo;
	
	public CargoBogie(String type) {
		this.type = type;
	}
	
	public void assignCargo(String cargo){
		try {
			if(this.type.equals("Rectanguler") && cargo.equals("Petroleum")) {
				throw new CargoSafetyException("Unsafe Cargo Assignment.");
			}
			this.cargo = cargo;
			System.out.println("Cargo assigned successfully -> " + cargo);
		}
		catch(CargoSafetyException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			System.out.println("Cargo Validation Completed for " + this.type + " bogie");
		}
		
	}
}