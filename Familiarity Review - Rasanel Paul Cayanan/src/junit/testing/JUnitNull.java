package junit.testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitNull {

	@Test
	void test() {
		 JUnitTesting test = new JUnitTesting();
	        assertNull(test.getPropValue(1 ));
	}

}
