package com.atb;

import org.junit.Test;

import static com.atb.Palindrome.checkPalindrome;
import static com.atb.Palindrome.findNearestPalindrome;
import static org.junit.Assert.assertEquals;


public class PalindromeTest {
	@Test
	public void testGivenValues(){
		assertEquals(121, findNearestPalindrome(123));
		assertEquals(1234444321, findNearestPalindrome(1234554321));
		assertEquals(1234554321, findNearestPalindrome(1234554329));
		assertEquals(999999999, findNearestPalindrome(999999998));
		assertEquals(2147447412, findNearestPalindrome(Integer.MAX_VALUE));
	}
	@Test
	public void testNotINcludingItself() {
		assertEquals(11, findNearestPalindrome(12));
		assertEquals(9, findNearestPalindrome(11));
		assertEquals(111, findNearestPalindrome(121));
		assertEquals(0, findNearestPalindrome(1));
		assertEquals(1, findNearestPalindrome(0));
	}
	@Test
	public void testNegativeValues(){
		assertEquals(0, findNearestPalindrome(-1000));
		assertEquals(0, findNearestPalindrome(-1));
		assertEquals(0, findNearestPalindrome(Integer.MIN_VALUE));
		assertEquals(true, checkPalindrome(2147447412));

	}

	@Test
	public void testIsPalindromeValidCases(){
		assertEquals(true, checkPalindrome(0));
		assertEquals(true, checkPalindrome(1));
		assertEquals(true, checkPalindrome(9));
		assertEquals(true, checkPalindrome(11));
		assertEquals(true, checkPalindrome(99));
		assertEquals(true, checkPalindrome(101));
		assertEquals(true, checkPalindrome(1001));
		assertEquals(true, checkPalindrome(2147447412));
	}
	@Test
	public void testIsPalindromeInValidCases(){
		assertEquals(false, checkPalindrome(-1));
		assertEquals(false, checkPalindrome(Integer.MIN_VALUE));
		assertEquals(false, checkPalindrome(12));
		assertEquals(false, checkPalindrome(112));
		assertEquals(false, checkPalindrome(990));
		assertEquals(false, checkPalindrome(1011));
		assertEquals(false, checkPalindrome(100111));
		assertEquals(false, checkPalindrome(2147447419));
	}
	@Test
	public void testIsPalindromeOverflowCases(){
		assertEquals(false, checkPalindrome(299999999));
	}
}