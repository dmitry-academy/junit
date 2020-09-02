package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

public class SimpleMathTets extends Assert {

	@Test
	public void testMathPlus() {
		assertEquals(5, FuncMath.plus(2, 2));
	}
}
