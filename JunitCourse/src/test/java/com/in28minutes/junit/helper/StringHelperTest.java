package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper =new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {
	//	fail("Not yet implemented");

		//AACD => CD ACD => CD CDEF => CDEF CDAA =>CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

		//expected,actual
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}

}
