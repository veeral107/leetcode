package com.leetcode.java.easy;

//26. Remove Duplicates from Sorted Array
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] == nums[i - 1]) {
				nums[i] = Integer.MIN_VALUE;
			}
		}

		// move zeros
		int j = 0;
		int newLength = 0;
		for (int i = 0; i < nums.length; i++) {
			// System.out.println("i: " + i);
			// System.out.println("j: " + j);
			if (nums[i] != Integer.MIN_VALUE) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
				newLength++;
			}
			// System.out.println(Arrays.toString(nums));
		}
		return newLength;
	}

	// main method
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 3, 3 };
		RemoveDuplicates callingObject = new RemoveDuplicates();
		int output = callingObject.removeDuplicates(nums);
		System.out.println("Expected length: 3");
		System.out.println("Actual length: " + output);

	}
}
