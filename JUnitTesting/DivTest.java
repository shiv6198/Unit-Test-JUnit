package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(8,2);
		assertEquals(4, output,0.00);
		}
	

}
