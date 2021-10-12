package com.qa.garage;

public class Bus extends Vehicle {
	private String numOfDecks;
	private int carryingCapacity;
	
	// Constructor
	public Bus(String numOfDoors, int engineSize, boolean isManual, String numOfDecks, int carryingCapacity) {
		super(numOfDoors, engineSize, isManual);
		this.numOfDecks = numOfDecks;
		this.carryingCapacity = carryingCapacity;
	}
	
	// Getters and Setters
	public String getNumOfDecks() {
		return numOfDecks;
	}

	public void setNumOfDecks(String numOfDecks) {
		this.numOfDecks = numOfDecks;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	@Override
	public String toString() {
		return "Bus [numOfDecks=" + numOfDecks + ", carryingCapacity=" + carryingCapacity + ", numOfDoors=" + numOfDoors
				+ ", engineSize=" + engineSize + ", isManual=" + isManual + "]";
	}


	
	

}
