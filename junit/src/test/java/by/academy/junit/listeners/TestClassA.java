package by.academy.junit.listeners;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class TestClassA extends Assert {

	@Test
	public void test_A_1() {
		Assert.assertTrue(1 == 2);
	}

	@Test
	public void testEquals() {
		Assert.assertTrue(1 == 2);
	}

	@Test
	public void test_A_2() {
		assertTrue(true);
	}
}