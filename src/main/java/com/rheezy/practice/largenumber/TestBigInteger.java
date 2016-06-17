package com.rheezy.practice.largenumber;

import java.math.BigInteger;

import org.junit.Test;
import org.junit.Assert;

public class TestBigInteger {
	
	@Test
	public void testCreating() {
		BigInteger reallyBigNumber = new BigInteger("1234567890987654321");
		Assert.assertNotNull(reallyBigNumber);
	}
	
	@Test
	public void testAddition() {
		BigInteger reallyBigNumber = new BigInteger("1234567890987654321");
		BigInteger notAsBigNumber = new BigInteger("12345678");
		BigInteger additionResult = reallyBigNumber.add(notAsBigNumber);
		
		Assert.assertEquals(new BigInteger("1234567890999999999"), additionResult);
	}
	
	
}
