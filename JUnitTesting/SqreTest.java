package testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SqreTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
		}
	

}
