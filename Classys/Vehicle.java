package Classys;

public abstract class Vehicle {
	
	private int registrationNumber; 
	
	
	public Vehicle(int registrationNumber) {
		super();
		this.registrationNumber = registrationNumber;
		
	}
	
	
	public int getReg() {
		return registrationNumber;
	}
	

	@Override
	public String toString() {
		return "Vehicle Registration No. =" + registrationNumber;
	}


	public float calculateBill() {
		return (0);
	}


	

	
}
