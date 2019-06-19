package Classys;

public class Car extends Vehicle {
	
	private int numberOfDoors;
	


	
	public Car(int registrationNumber, int numberOfDoors) {
		
		super(registrationNumber);
		this.numberOfDoors = numberOfDoors;
		
      }
	

	public int getnumberOfDoors() {
		return numberOfDoors;
	}
	

	@Override
	public String toString() {
		return "This car has " + numberOfDoors + " doors!";
	}
	
	@Override
	public float calculateBill() {
		float price = 450;
		return (price * numberOfDoors);
 	}

}
