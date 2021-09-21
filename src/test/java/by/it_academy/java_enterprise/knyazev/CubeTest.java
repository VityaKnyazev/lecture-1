package by.it_academy.java_enterprise.knyazev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CubeTest {
	private Cube cube = new Cube();

	@Test
	public void testPositiveResultOnGetCube() {
		int value = 5;
		int result = cube.getCube(value);
		assertEquals(125, result);
	}

	@Test
	public void testNegativeResultOnGetCube() {
		int value = -5;
		int result = cube.getCube(value);
		assertEquals(-125, result);
	}

}
