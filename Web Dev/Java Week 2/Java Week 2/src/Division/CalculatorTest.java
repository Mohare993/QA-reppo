package Division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	
	Divide m = new Divide();

	@Test
	void testSumDiv() {
		assertEquals(m.sumDiv(20, 5), 4);
	}
	
	@Test
	void testSumDiv2() {
		assertEquals(m.sumDiv(20, 5), 4);
	}

}
