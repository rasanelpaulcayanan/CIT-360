package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestCube {

	@Test
	public void test() {
		JUnitTesting test1 = new JUnitTesting();
		int output = test1.cube(5);
		assertEquals(125, output);
	}

}
