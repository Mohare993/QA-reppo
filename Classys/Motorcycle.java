package Classys;

public class Motorcycle extends Vehicle {
	
	boolean hasSidecar;
	
	public Motorcycle(int registrationNumber, boolean hasSidecar) {
		super(registrationNumber);
		this.hasSidecar = hasSidecar;
		
	}
	
	public boolean hasSidecar() {
		return hasSidecar;
	}
	

	@Override
	public String toString() {
		return "This motorcycle has a sidecar : " + hasSidecar;
	}
	
	@Override
	public float calculateBill() {
		float price = 350;
		if (hasSidecar == true) {
		return (price * 3);
		}	else {
		return (price);
		}
	}
}