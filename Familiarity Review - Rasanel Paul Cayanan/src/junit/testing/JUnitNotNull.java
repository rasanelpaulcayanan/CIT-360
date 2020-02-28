package junit.testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitNotNull {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
        assertNotNull(test.getPropValue(12346 ));
	}

}
