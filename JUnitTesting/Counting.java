package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Counting {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("javan");
		assertEquals(2, output);
		}
	

}
