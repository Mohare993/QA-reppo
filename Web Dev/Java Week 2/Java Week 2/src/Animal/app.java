package Animal;

public class app {

	public static void main(String[] args) {
		
		Cow abc = new Cow(2);
		
		Cage<Cow> nickCage = new Cage<Cow>();
		
		nickCage.setCage(abc);
		
		
		System.out.println(nickCage.getCage());

	}

}
