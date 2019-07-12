package Animal;

public class Cow extends Mammal {

	private int noOfUdders = 4;

	public Cow(int noOfUdders) {
		super(3);
		super.setNoOfMammaryGlands(4);
		this.noOfUdders = noOfUdders;
	}

	public Cow() {
		super(2);
	}

	public void becomeSteak() {
		System.out.println("Mooooooooo......");
	}

	public int getNoOfUdders() {
		return noOfUdders;
	}

	public void setNoOfUdders(int noOfUdders) {
		this.noOfUdders = noOfUdders;
	}
}