package com.leetcode.java.medium;

//287. Find the Duplicate Number, 17 may 2017
public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		int slow = 0;
		int fast = 0;
		int finder = 0;

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		do {
			slow = nums[slow];
			finder = nums[finder];
		} while (slow != finder);

		return finder;
	}

	// main
	public static void main(String[] args) {
		FindTheDuplicateNumber callingObject = new FindTheDuplicateNumber();
		int[] array = { 18, 13, 14, 17, 9, 19, 7, 17, 4, 6, 17, 5, 11, 10, 2, 15, 8, 12, 16, 17 };
		int output = callingObject.findDuplicate(array);
		System.out.println("expected:17 actual:" + output);

	}

}
