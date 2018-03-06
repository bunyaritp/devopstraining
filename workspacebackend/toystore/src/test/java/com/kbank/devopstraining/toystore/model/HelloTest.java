package com.kbank.devopstraining.toystore.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test1() {
		// fail("Not yet implemented");
		Hello target = new Hello("test");
		assertEquals("test", target.getMessage());
	}

	@Test
	public void test2() {
		// fail("Not yet implemented");
		Hello target = new Hello("");
		target.setMessage("test");
		assertEquals("test", target.getMessage());
	}

}
