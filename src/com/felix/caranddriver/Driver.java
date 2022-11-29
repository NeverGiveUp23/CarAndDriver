package com.felix.caranddriver;

class Driver extends Car {
	
	
	
	public void areDriving() {
		super.isDriving();
	}
	
	public void areBoost() {
		super.useBoost();
	}
	
	public void areRefuel() {
		System.out.println(" ----- Refueling -----");
		super.isRefueling();
	}
}
