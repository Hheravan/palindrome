package com.atb;

import org.junit.Test;

import static com.atb.Palindrome.checkPalindrome;
import static com.atb.Palindrome.findNearestPalindrome;
import static org.junit.Assert.assertEquals;


public class PalindromeTest {
	@Test
	public void testGivenValues(){
		assertEquals(121, findNearestPalindrome(123));
	}
	@Test
	public void testNegativeValues(){
		assertEquals(0, findNearestPalindrome(-1000));
		assertEquals(0, findNearestPalindrome(-1));
		assertEquals(0, findNearestPalindrome(Integer.MIN_VALUE));
	}

	@Test
	public void testIsPalindromeValidCases(){
		assertEquals(true, checkPalindrome(0));
	}
	@Test
	public void testIsPalindromeInValidCases(){
		assertEquals(false, checkPalindrome(-1));
		assertEquals(false, checkPalindrome(Integer.MIN_VALUE));
		assertEquals(false, checkPalindrome(12));
	}
	@Test
	public void testIsPalindromeOverflowCases(){
		assertEquals(false, checkPalindrome(299999999));
	}
}
