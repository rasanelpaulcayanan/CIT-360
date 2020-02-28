package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestLetterCounter {

	@Test
	void test() {
		JUnitTesting test2 = new JUnitTesting();
		int output = test2.letterCounter("cabinet");
		
		assertFalse( output == 0);
		
	}

}
