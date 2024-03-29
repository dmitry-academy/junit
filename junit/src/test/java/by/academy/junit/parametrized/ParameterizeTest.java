package by.academy.junit.parametrized;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class ParameterizeTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name="{index}: sum {0} and {1} = {2}")
	public static Iterable<Integer[]> dataForTest() {
		return Arrays.asList(
				new Integer[][] { 
					{ 1, 2, 3 }, 
					{ 1, 1, 2 }, 
					{ 2, 6, 8 }, 
					{ 18, 2, 20 }, 
					{ 13, 15, 28 }, 
					{ 1, 5, 6 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}

}