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
		// Negative numbers are not palindrome and 0 is the nearest  palindrome
		int result = 0;
		if(num < 0){
			return result;
		}

		int counter =1;
		boolean isPalindrome=false;

		while(!isPalindrome) {
			// Search in lower numbers
			isPalindrome =checkPalindrome(num-counter);
			if(isPalindrome) {
				result = num-counter;
				break;
			}
			// Search in upper numbers
			isPalindrome =checkPalindrome(num+counter++);
			if(isPalindrome) {
				result = num+counter-1;
				break;
			}
		}
		return result;
	}

	/**
	 * This methods checks if a number is palindrome
	 * @param num  integer number
	 * @return true if the given number is palindrome
	 */

	public static boolean checkPalindrome(final int num){
		// Negative numbers are not palindrome and 0 is the nearest  palindrome
		if ( num < 0 ){
				return false;
		}

		int tempNumber = num ;
		int leftDivider = 1 ;
		int rightNumber;
		int leftNumber;

		// Find largest dividable power of 10 for the number
		while ( tempNumber / leftDivider >= 10 ){
			leftDivider *= 10;
		}

		// Find left and right numbers and compare them
		while ( tempNumber != 0 ){
			rightNumber = tempNumber % 10 ;
			leftNumber  = tempNumber / leftDivider ;

			if (rightNumber != leftNumber){
				return false;
			}
			// Remove left and right numbers
			tempNumber %= leftDivider;
			tempNumber /= 10;
			leftDivider /= 100;
		}
		return true;
	}
}
