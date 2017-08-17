package com.leetcode.java.easy;

import java.util.Arrays;

//238. Product of Array Except Self Add to List
//Given an array of n integers where n > 1, nums, 
//return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//For example, given [1,2,3,4], return [24,12,8,6]
//Solve it without division and in O(n).

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];

		result[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		int right = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			result[i] = result[i] * right;
			right = right * nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		ProductOfArrayExceptSelf callingObject = new ProductOfArrayExceptSelf();
		int[] nums = { 1, 2, 3, 4 };
		int[] output = callingObject.productExceptSelf(nums);
		System.out.println(Arrays.toString(output));
	}
}
