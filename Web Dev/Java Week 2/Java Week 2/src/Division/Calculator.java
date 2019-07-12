package Division;

import java.util.Scanner;

public class Calculator {

	public int sumAdd(int a, int b) {
		return a + b;
	}

	public int sumMinus(int a, int b) {
		return a - b;
	}

	public int sumMultiply(int a, int b) {
		return a * b;
	}

	public int sumDiv(Integer a, Integer b) {
		int result = 0;
		if (a > b) {
			result = a / b;
		} else if (b > a) {
			System.out.println("Try again, the second number must be smaller");
		}
		return result;
	}
}

