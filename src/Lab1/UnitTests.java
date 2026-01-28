package csi213.lab01;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * {@code UnitTests} tests the Lab 1 implementations.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnitTests {

	/**
	 * Tests the Task 1 implementations.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	public void test1() throws Exception {
		assertEquals(2, Example.quotient(4, 2));
		assertEquals(1, Example.quotient(3, 2));
	}

	/**
	 * Tests the Task 2 implementations.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	public void test2() throws Exception {
		assertEquals(0, Example.remainder(4, 2));
		assertEquals(1, Example.remainder(3, 2));
	}

	/**
	 * Tests the Task 3 implementations.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	public void test3() throws Exception {
		assertEquals(0, Example.remainder(-4, 2));
		assertEquals(1, Example.remainder(-3, 2));
		assertEquals(3, Example.remainder(-5, 4));
	}
}
