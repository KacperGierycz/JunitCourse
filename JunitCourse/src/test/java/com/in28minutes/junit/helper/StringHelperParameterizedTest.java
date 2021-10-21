package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	//AACD => CD ACD => CD CDEF => CDEF CDAA =>CDAA
	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = 
			{{"AAD","CD"},
			 {"ACD","CD"}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {

		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

	}
	
}
	
	