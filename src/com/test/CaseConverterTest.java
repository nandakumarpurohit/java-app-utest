package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.demo.CaseConverter;

class CaseConverterTest {
	
	CaseConverter c1 = new CaseConverter();

	@Test
	public void testConvertCase() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase2() {
		assertEquals(c1.convertCase("hello"), "HELLO");
	}
	
	@Test
	public void testConvertCase3() {
		assertEquals(c1.convertCase(""), null);
	}

	
	@Test
	public void testConvertCase5() {
		assertEquals(c1.convertCase(null), "");
	}
	
	@Test
	public void testConvertCase6() {
		assertEquals(c1.convertCase("7"), "7");
	}

}
