package com.qa.runner;

import com.qa.garage.Car;
import com.qa.garage.Garage;
import com.qa.garage.Vehicle;

public class Runner {
	public static void main(String[] args) {
		
		Vehicle corsa = new Car("Five", 2, true, "hatchback", 5);
		Vehicle merc = new Car("Three", 2, false, "saloon", 5);
		
		Garage tyresRUs = new Garage();
		tyresRUs.addNewVehicle(corsa);
		
//		tyresRUs.getAllVehicle();
	}

}
