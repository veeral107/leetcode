package com.leetcode.java.easy;
//125. Valid Palindrome

//Given a string, determine if it is a palindrome, 
//considering only alphanumeric characters and ignoring cases.

public class ValidPalindrome {

	int range1 = 'a';
	int range2 = 'z';
	int range3 = 'A';
	int range4 = 'Z';
	int range5 = '0';
	int range6 = '9';

	public boolean isPalindrome(String s) {
		char[] inputArray = s.toCharArray();
		// Improvise:
		// char[] inputArray = s.toLowerCase().toCharArray();
		for (int i = 0, m = inputArray.length - 1; i <= m;) {

			char start = inputArray[i];
			char end = inputArray[m];

			if (isNotValidChar(start)) {
				i++;
			} else if (isNotValidChar(end)) {
				m--;
			} else if (Character.toLowerCase(start) == Character.toLowerCase(end)) {
				i++;
				m--;
			} else {
				return false;
			}
		}
		return true;
	}

	private boolean isNotValidChar(char character) {
		return !isValidChar(character);
	}

	private boolean isValidChar(char character) {
		if (character >= range1 && character <= range2) {
			return true;
		}
		if (character >= range3 && character <= range4) {
			return true;
		}
		if (character >= range5 && character <= range6) {
			return true;
		}
		return false;
	}

	// main method
	public static void main(String[] args) {
		ValidPalindrome callingObject = new ValidPalindrome();

		// String s1 = "A man, a plan, a canal: Panama";
		// boolean output1 = callingObject.isPalindrome(s1);
		// System.out.println("Expected answer: True");
		// System.out.println("Actual answer: " + output1);
		// System.out.println("");

		String s2 = "0P";
		boolean output2 = callingObject.isPalindrome(s2);
		System.out.println("Expected answer: False");
		System.out.println("Actual answer: " + output2);
	}

}

// if (inputArray.length % 2 == 0) {
// if (inputArray[i] == inputArray[inputArray.length - 1]
// || Math.floorMod(inputArray[i], inputArray[inputArray.length - 1]) == offset
// && j >= range1
// && j <= range2
// || k >= range3 && k <= range4) {
// i++;
// } else {
// return false;
// }
// }
// if (inputArray.length % 2 != 0) {
// if (inputArray[i] == inputArray[inputArray.length - 1]
// || Math.floorMod(inputArray[i], inputArray[inputArray.length - 1]) == offset
// && j >= range1
// && j <= range2
// || k >= range3 && k <= range4) {
// i++;
// }
// }
// }
//
// return false;
