package junit.testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitSame {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		assertSame(test.getPropValue(12346),test.getPropValue(12346));
	}

}
