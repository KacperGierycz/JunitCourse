package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	//Arrays.sort()
	
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers= {12,3,4,1};
		int[] expected= {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);

	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArrayException() {
		int[] numbers= null;
	//	int[] numbers= {};

		Arrays.sort(numbers);

	}
	
	@Test
	public void testArraySort_NullArray() {
		int[] numbers=null;
		try {
		Arrays.sort(numbers);
		}
		catch(NullPointerException e) {
			//exception
		}
	}
	
	@Test(timeout = 1)
	public void testSort_SortPerformance() {
		int array[]= {12,23,4};
		for(int i= 0;i<=100000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
	

}
















