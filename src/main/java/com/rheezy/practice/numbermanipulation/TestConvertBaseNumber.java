package com.rheezy.practice.numbermanipulation;

import org.junit.Assert;
import org.junit.Test;

public class TestConvertBaseNumber {

	@Test
	public void testConvertBaseNumber() {
		String expectedResult = "11120";
		
		String result = ConvertBaseNumber.convertBaseNumber(123, 3);
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testNull() {
		String result = ConvertBaseNumber.convertBaseNumber(null, 3);
		Assert.assertNull(result);
		
		result = ConvertBaseNumber.convertBaseNumber(123, null);
		Assert.assertNull(result);
		
		result = ConvertBaseNumber.convertBaseNumber(null, null);
		Assert.assertNull(result);
	}
	
	@Test
	public void testNegativeNumber() {
		String result = ConvertBaseNumber.convertBaseNumber(-123, 3);
		String expectedResult = "-11120";
		
		Assert.assertEquals(expectedResult, result);
	}
}
