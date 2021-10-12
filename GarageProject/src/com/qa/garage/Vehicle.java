package com.qa.garage;

public class Vehicle {
	
	public String numOfDoors;
	public int engineSize;
	public boolean isManual;
	
	public void calcBill() {
		
	}

	// Constructor
	public Vehicle(String numOfDoors, int engineSize, boolean isManual) {
		super();
		this.numOfDoors = numOfDoors;
		this.engineSize = engineSize;
		this.isManual = isManual;
	}

	// Getters and Setters
	public String getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(String numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	@Override
	public String toString() {
		return "Vehicle [numOfDoors=" + numOfDoors + ", engineSize=" + engineSize + ", isManual=" + isManual + "]";
	}


	
	

}
