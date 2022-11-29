package com.felix.caranddriver;

public class Car {
	private boolean driving;
	private boolean boost;
	public boolean refuel;
	public static int gas = 10;
	
	
	public void DisplayGas() {
		System.out.println("Fuel Tank: " + gas);
	}
	
	public boolean isDriving() {
		driving = true;
		gas -= 1;
		System.out.println("Fuel Tank: " + gas);
		return driving;
	}
	
	public boolean useBoost() {
		if(gas < 3) {
			boost = false;
		}
		else {
			boost = true;
			gas -= 2;
		}
		System.out.println(" ----- Boost Initiated -----");
		System.out.println("Fuel Tank: " + gas);
		return boost;
	}
	
	public boolean isRefueling() {
		refuel = true;
		gas += 3;
		return refuel;
		
	}
	
}

