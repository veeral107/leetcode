package com.leetcode.java.easy;

//344
//Write a function that takes a string as input and returns the string reversed.
public class ReverseString {

	public String reverseString(String inputString) {
		char[] inputArray = inputString.toCharArray(); // learning //converts
														// string to char array
		StringBuilder outputStringBuilder = new StringBuilder(); // learning //
																	// String
																	// builder

		for (int i = inputArray.length - 1; i >= 0; i--) {
			outputStringBuilder.append(inputArray[i]); // learning // append
														// function
		}

		return outputStringBuilder.toString(); // learning // conversion
	}

	public static void main(String[] args) {
		ReverseString call = new ReverseString();
		String reversedString = call.reverseString("Hello!");
		System.out.println(reversedString);
	}

}
