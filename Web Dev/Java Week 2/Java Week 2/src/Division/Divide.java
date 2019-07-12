package Division;

public class Divide {

	public int sumDiv(Integer a, Integer b) {
		try {
			if (b > a ) {
				throw new TooBigException();
			}
			return a / b;
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			return Integer.MAX_VALUE;
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
			return Integer.MIN_VALUE;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}

}
