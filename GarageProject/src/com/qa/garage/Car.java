package com.qa.garage;

public class Car extends Vehicle{
	
	private String modelType;
	private int numOfSeats;
	
	
	// Constructor
	public Car(String numOfDoors, int engineSize, boolean isManual, String modelType, int numOfSeats) {
		super(numOfDoors, engineSize, isManual);
		this.modelType = modelType;
		this.numOfSeats = numOfSeats;
		
		
	}

	// Getters and Setters
	public String getModelType() {
		return modelType;
	}


	public void setModelType(String modelType) {
		this.modelType = modelType;
	}


	public int getNumOfSeats() {
		return numOfSeats;
	}


	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	@Override
	public String toString() {
		return "Car [modelType=" + modelType + ", numOfSeats=" + numOfSeats + ", numOfDoors=" + numOfDoors
				+ ", engineSize=" + engineSize + ", isManual=" + isManual + "]";
	}





	
	
	
	
	

}
