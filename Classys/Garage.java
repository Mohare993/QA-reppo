package Classys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Garage {
	
	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}
	
	
	public float fixVehicle(Vehicle vehicle) {
		return vehicle.calculateBill();
	}
 	

	public float garageBill() {
		return this.vehicles.stream().map(v -> v.calculateBill()).reduce((bill1, bill2) -> bill1 + bill2).get();
	}
		
	public void emptyGarage() {
		this.vehicles.clear();
	}
 

}


