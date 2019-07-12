package Division;

import java.util.Scanner;

public class UseCalc {

	public static void main(String[] args) {

		Divide m = new Divide();

		Integer input = null;
		Integer input2 = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number : ");
		input = scan.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter a number : ");

		input2 = scan2.nextInt();

		scan2.close();

		System.out.println(m.sumDiv(input, input2));

	}

}
