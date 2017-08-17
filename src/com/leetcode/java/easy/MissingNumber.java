package com.leetcode.java.easy;
//268. Missing Number

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
//find the one that is missing from the array.
//For example, Given nums = [0, 1, 3] return 2.

public class MissingNumber {

	public int missingNumber(int[] nums) {
		// total number of Elements in array, including missing number
		int expectedLength = nums.length;
		// sum of all elements in array with extra number
		int expectedSum = expectedLength * (expectedLength + 1) / 2;

		// actual sum of elements in array
		int actualSum = 0;

		for (int value : nums) {
			actualSum += value;
		}

		int missingNumber = expectedSum - actualSum;

		return missingNumber;
	}

	// main method
	public static void main(String[] args)

	{
		MissingNumber callingObject = new MissingNumber();
		int[] inputArray1 = { 0, 1, 2, 4, 5 };
		int missingNumber1 = callingObject.missingNumber(inputArray1);
		System.out.println("expected missing number is: " + "3");
		System.out.println("missing number from algorithm is: " + missingNumber1);

		int[] inputArray2 = { 0, 1, 2, 3, 4, 5, 7 };
		int missingNumber2 = callingObject.missingNumber(inputArray2);
		System.out.println("expected missing number is: " + "6");
		System.out.println("missing number from algorithm is: " + missingNumber2);

	}
}
