package com.atb;
/**
 * This class provides a method for checking if a number is palindrome,
 * and find a nearest palindrome number. If there is a tie, returns the smaller one.
 * it assumes that all negative numbers are not palindrome and returns 0 for all of them.
 * both methods get and integer number as parameter.
 * parameters will be between Integer.MIN_VALUE and Integer.MAX_VALUE
 */
public class Palindrome {

	/**
	 * This method find a nearest palindrome integer to the given integer number
	 * @param num  an integer number
	 * @return     is the nearest palindrome number to num
	 */
	public static int findNearestPalindrome(final int num) {
		//  negative numbers are not palindrome and 0 is the nearest  palindrome
		int result = 0;
		if(num < 0){
			return result;
		}
		return result;
	}

	/**
	 * This methods checks if a number is palindrome
	 * @param num  integer number
	 * @return true if the given number is palindrome
	 */

	public static boolean checkPalindrome(final int num){
			if ( num < 0 ){
				return false;
			}

			return true;
		}
}
