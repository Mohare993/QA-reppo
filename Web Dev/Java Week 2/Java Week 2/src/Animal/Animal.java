package Animal;

public abstract class Animal {

	private String colour;
	private String species;
	private int age;
	private int noOfLegs;

	public abstract void breathe();

	public void die() {
		System.out.println("bleh");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
}