package org.com.test;

import static org.junit.Assert.*;

import org.com.junit.*;
import org.com.junit.Math;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathJunitTestCase {
	Math M = new Math();

	@Test
	public void testSquare() {
		// assertTrue(Math.square(5)==25);

		Object ob = new Object();
		System.out.println(M.createObject("mayur") != null);

		assertEquals(true, M.createObject("mayur") != null);

		System.out.println("1");
		// System.out.println(Math.square(5)==24);
		// System.out.println(M.createObject("mayur").equals(ob));
	}

	@Test
	public void testCreateObjectToPass() {

		assertNull(M.createObject("null"));
		System.out.println("2");
	}

	@Test
	public void testCreateObject() {
		assertNotNull(M.createObject("mayur"));
		System.out.println("3");
	}

	@Test
	public void testSum() {

		assertEquals(true, Math.sum(25, 10) == 35); // ( true/false(expected
													// value), expression( to
													// make it true or false
													// dependents on
													// requirement)
		System.out.println(Math.sum(25, 10));
		System.out.println("4");
	}

	// Method @BeforeClass() & @AfterClass should be static
	@BeforeClass
	public static void beforeClass() {
		System.out.println("THIs is testing before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("THIs is testing after class");
	}

	@After // Method @After() & @Before should not be static
	public void after() {
		System.out.println("THIs is testing after ");
	}

	@Before
	public void before() {
		System.out.println("THIs is testing before ");
	}

}

// "null" null false
// math class's object ob has reference value @1231' MathJunitTestCae object ob
// has refrence value @54322
/*
 * NOTES: Annotating a public static void method with @AfterClass causes that
 * method to be run after all the tests in the class have been run.
 * All @AfterClass methods are guaranteed to run even if a BeforeClass method
 * throws an exception
 */

