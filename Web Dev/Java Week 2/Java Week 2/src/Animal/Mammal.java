package Animal;

public abstract class Mammal extends Animal {
	private int noOfMammaryGlands;

	public Mammal(int noOfMammaryGlands) {
		super();
		this.noOfMammaryGlands = noOfMammaryGlands;
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("#gasp#");
	}

	public void milk() {
		System.out.println("lactate");
	}

	public void sweat() {
		System.out.println("Fuck me, it's warm in here");
	}

	public int getNoOfMammaryGlands() {
		return this.noOfMammaryGlands;
	}

	public void setNoOfMammaryGlands(int num) {
		if (num >= 0 && num < 13) {
			this.noOfMammaryGlands = num;
		}
	}
}