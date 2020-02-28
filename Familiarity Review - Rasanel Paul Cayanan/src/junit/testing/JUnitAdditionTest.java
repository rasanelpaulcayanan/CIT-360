package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitAdditionTest {

	@Test
	void test() {
		JUnitTesting test3 = new JUnitTesting();
		int output = test3.simpleAddition(25,50);
		
		assertTrue( output == 75);
	}

}
