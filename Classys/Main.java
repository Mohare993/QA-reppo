package Classys;


import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person Carl = new Person("Carl", 41, "Driver");
		Person Mark = new Person("Mark", 24, "Teacher");
		Person Matt = new Person("Matt", 36, "Policeman");
		Person Dave = new Person("Dave", 31, "Farmer");

		List<Person> people = Arrays.asList(Carl, Mark, Matt, Dave);

////		people.stream().forEach(System.out::println);
//		
//		search("Dave", people);
		
		Car car1 = new Car(101, 5);
		Car car2 = new Car(102, 4);
		Bus bus1 = new Bus(103, 2);
		Bus bus2 = new Bus(104, 3);
		Motorcycle bike1 = new Motorcycle(105, true);
		Motorcycle bike2 = new Motorcycle(106, false);
		
		
		Garage Halfords = new Garage();
		
		Halfords.addVehicle(car1);
		Halfords.addVehicle(bus1);
		Halfords.addVehicle(bike1);
		Halfords.addVehicle(car2);
		
		System.out.println(Halfords.getVehicles());
		
		
		System.out.println(Halfords.fixVehicle(car1));
		System.out.println(Halfords.garageBill());
		
		Halfords.emptyGarage();
		
		System.out.println(Halfords.getVehicles());
		
	
	
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	public static void search(String search, List<Person> listname ) {
			 listname.stream()
		    .filter(i-> i.getName().equals((search)))
			.forEach(System.out::println);
			
			
		    
}
}