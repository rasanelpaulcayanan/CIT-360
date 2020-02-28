package junit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitNotSame {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		assertNotSame(test.getPropValue(12346),test.getPropValue(12346));
	}

}
