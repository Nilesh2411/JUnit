package org.com.test;

import static org.junit.Assert.*;

import org.com.junit.DivClass;
import org.junit.After;
import org.junit.Test;

public class DivTestCase {


	@Test
	public void divTest(){
		assertEquals(1,DivClass.div(1,1));
	}
   @After
 public void afterPrint(){
	System.out.println("This is after Print");
}
}
