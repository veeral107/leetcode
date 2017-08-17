package com.leetcode.java.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1. Two Sum
//Given an array of integers, 
//return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		// fill Map with array entries
		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
		for (int key : nums) {
			if (!counterMap.containsKey(key)) {
				counterMap.put(key, 1);
			} else {
				int temp = counterMap.get(key);
				counterMap.put(key, temp + 1);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int numberTwo = target - nums[i];
			// int indice1=0;
			// int indice2=0;
			// case1: 7=14-7
			if (numberTwo == nums[i]) {
				int value1 = counterMap.get(nums[i]);
				if (value1 >= 2) {
					int indice1 = i;
					for (int j = 0; j < nums.length; j++) {
						if (nums[j] == numberTwo && j != i) {
							int indice2 = j;
							int[] outputArray = { indice1, indice2 };
							return outputArray;
						}
					}
				}
			}
			// case2: 2=9-7
			if (numberTwo != nums[i]) {
				if (counterMap.containsKey(numberTwo)) {
					int indice1 = i;
					for (int j = 0; j < nums.length; j++) {
						if (nums[j] == numberTwo) {
							int indice2 = j;
							int[] outputArray = { indice1, indice2 };
							return outputArray;
						}

					}
				}
			}
		}
		return null;

	}

	// main method
	public static void main(String[] args) {
		TwoSum callingObject = new TwoSum();
		int[] nums1 = { 2, 7, 11, 15 };
		int[] outputArray1 = callingObject.twoSum(nums1, 9);
		System.out.println("expected indices: 0,1");
		System.out.println("actual indices: " + Arrays.toString(outputArray1));

		int[] nums2 = { 1, 7, 11, 7 };
		int[] outputArray2 = callingObject.twoSum(nums2, 14);
		System.out.println("expected indices: 1,3");
		System.out.println("actual indices: " + Arrays.toString(outputArray2));

	}
}
