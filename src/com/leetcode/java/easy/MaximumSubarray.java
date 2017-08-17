package com.leetcode.java.easy;
//53. Maximum Subarray

//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//the contiguous subarray [4,-1,2,1] has the largest sum = 6.

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (sum < 0) {
				sum = nums[i];
			} else {
				sum = sum + nums[i];
			}
			if (sum > max)
				max = sum;
		}
		return max;
	}

	// main
	public static void main(String[] args) {
		MaximumSubarray callingObject = new MaximumSubarray();
		int[] nums = { 4, -1, 2, 1, -5, 4 };
		int largestSum = callingObject.maxSubArray(nums);
		System.out.println("largest sum: " + largestSum);
	}

}
