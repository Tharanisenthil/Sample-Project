package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	SampleProject sm;
	@SuppressWarnings("static-access")
	@Test
	public void testHello() {
		sm = new SampleProject();
		
		assertEquals("Hello World!",sm.printHello());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testAdd() {
		sm = new SampleProject();
		int a = 23+45;
		assertEquals(a,sm.add(23, 45));
	}

}
