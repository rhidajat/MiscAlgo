package com.rheezy.practice.numbermanipulation;

public class ConvertBaseNumber {

	private static final String NEGATIVE_SIGN = "-";
	private static final Integer BEGINNING_INDEX = 0;
	
	public static String convertBaseNumber(Integer number, Integer base) {
		/*
		 * 	Keep dividing up the number with the base until it is smaller than the base
		 * 	Each time, find the number % base which turns out to be the 'digits'
		 * 
		 * 	if number is negative, this becomes negative
		 * 	if base is negative, throw an error, does not make sense
		 * 
		 * 	While (number >= base)
		 * 		digit = number % base 
		 *		result.prepend(digit)
		 *		number = number / base
		 *	end of while
		 *
		 *	result.prepend(number);
		 */
		
		if (number == null || base == null) {
			return null;
		}
		
		if (base < 1) {
			// throw an error
		}
		
		Boolean isNegative = false;
		if (number < 0) {
			isNegative = true;
			number = Math.abs(number);
		}
		
		StringBuffer buffer = new StringBuffer();
		
		while (number >= base) {
			Integer digit = number % base;
			buffer.insert(BEGINNING_INDEX, digit.toString());
			number = number / base;
		}
		buffer.insert(BEGINNING_INDEX, number.toString());
		
		if (isNegative) {
			buffer.insert(BEGINNING_INDEX, NEGATIVE_SIGN);
		}
		return buffer.toString();
	}
}
