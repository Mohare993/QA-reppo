package Classys;

public class Bus extends Vehicle {
	
	private int numberOfAxles;
	
	
	public Bus(int registrationNumber, int numberOfAxles) {
		super(registrationNumber);
		this.numberOfAxles = numberOfAxles;
		
	}
	
	public int getnumberOfAxles() {
		return numberOfAxles;
	}
	

	@Override
	public String toString() {
		return "This bus has " + numberOfAxles + " Axles!";
	}
	
	@Override
	public float calculateBill() {
		float price = 550;
		return (price * numberOfAxles);
 	}	
}


