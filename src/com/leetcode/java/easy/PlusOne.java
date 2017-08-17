package com.leetcode.java.easy;

import java.util.Arrays;

//66. Plus One Add to List

//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//You may assume the integer do not contain any leading zero, except the number 0 itself.
//The digits are stored such that the most significant digit is at the head of the list.

public class PlusOne {
	public int[] plusOne(int[] digits) {

		int length = digits.length;
		for (int i = length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] outputArray = new int[digits.length + 1];
		outputArray[0] = 1;
		return outputArray;

		// if (digits[0] == 0) {
		// int[] res = new int[digits.length+1];
		// res[0] = 1;
		// return res;
		// }
	}

	// main method
	public static void main(String[] args) {
		PlusOne callingObject = new PlusOne();

		int[] inputArray1 = { 7, 4, 2 };
		int[] outputArray1 = callingObject.plusOne(inputArray1);
		System.out.println("expected output: [7, 4, 3]");
		System.out.println("actual output: " + Arrays.toString(outputArray1));

		inputArray1 = new int[] { 7, 4, 9 };
		outputArray1 = callingObject.plusOne(inputArray1);
		System.out.println("expected output: [7, 5, 0]");
		System.out.println("actual output: " + Arrays.toString(outputArray1));

		inputArray1 = new int[] { 9, 9, 9 };
		outputArray1 = callingObject.plusOne(inputArray1);
		System.out.println("expected output: [1, 0, 0, 0]");
		System.out.println("actual output: " + Arrays.toString(outputArray1));
	}
}
