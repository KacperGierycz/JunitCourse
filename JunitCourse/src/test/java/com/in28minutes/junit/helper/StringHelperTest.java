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
	
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABCDFalse() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABABTrue() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABTrue() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AFail() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));		
	}
	

}
