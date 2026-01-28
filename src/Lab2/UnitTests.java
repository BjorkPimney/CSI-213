package csi213.lab02;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * {@code UnitTests} tests the Lab 2 implementations.
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
		assertEquals("Meow!", new Cat(38.23, Color.GRAY).sound());
	}

	/**
	 * Tests the Task 2 implementations.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	public void test2() throws Exception {
		assertEquals("[bodyTemperature=38.6, name=Rocky]", "" + new Dog(38.55, "Rocky"));
		assertEquals("[bodyTemperature=38.2, furColor=java.awt.Color[r=128,g=128,b=128]]",
				"" + new Cat(38.23, Color.GRAY));
		assertEquals("[bodyTemperature=38.9, name=Apollo]", "" + new Dog(38.94, "Apollo"));
		assertEquals("[bodyTemperature=39.1, furColor=java.awt.Color[r=255,g=200,b=0]]",
				"" + new Cat(39.12, Color.ORANGE));
		assertEquals("[bodyTemperature=38.9, furColor=java.awt.Color[r=64,g=64,b=64]]",
				"" + new Cat(38.86, Color.DARK_GRAY));
	}

	/**
	 * Tests the Task 3 implementations.
	 * 
	 * @throws Exception if an error occurs
	 */
	@Test
	public void test3() throws Exception {
		assertEquals(2, Dog.count());
		assertEquals(4, Cat.count());
		assertEquals(6, Mammal.count());
		new Dog(38.55, "Rocky");
		new Cat(38.23, Color.GRAY);
		assertEquals(3, Dog.count());
		assertEquals(5, Cat.count());
		assertEquals(8, Mammal.count());
	}

}
