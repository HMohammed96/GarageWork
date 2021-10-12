package com.qa.garage;

public class Truck extends Vehicle {
	
	private int wheelSize;
	private int loadingCapacity;
	
	// Constructor
	public Truck(String numOfDoors, int engineSize, boolean isManual, int wheelSize, int loadingCapacity) {
		super(numOfDoors, engineSize, isManual);
		this.wheelSize = wheelSize;
		this.loadingCapacity = loadingCapacity;
	}

	// Getters and Setters
	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public int getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(int loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
	}

	@Override
	public String toString() {
		return "Truck [wheelSize=" + wheelSize + ", loadingCapacity=" + loadingCapacity + ", numOfDoors=" + numOfDoors
				+ ", engineSize=" + engineSize + ", isManual=" + isManual + "]";
	}

	// toString

	
	
	
	
	
}
