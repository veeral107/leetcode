package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//136
//Given an array of integers, every element appears twice except for one. 
//Find that single one.
public class SingleNumber {

	int inputArrayXoR(int[] nums) {
		int ans = 0;

		int len = nums.length;
		for (int i = 0; i != len; i++)
			ans ^= nums[i];

		return ans;

	}

	int inputArray(int[] nums) {

		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

		for (int key : nums) {
			if (!counterMap.containsKey(key)) {
				counterMap.put(key, 1);
			} else {
				int temp = counterMap.get(key);
				counterMap.put(key, temp + 1);
			}
		}

		for (Entry<Integer, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		SingleNumber callmethod = new SingleNumber();
		int[] sortedarray = { 5, 5, 2, 3, 2, 3, 1 };
		int outputelement = callmethod.inputArrayXoR(sortedarray);
		System.out.println(outputelement);
		outputelement = callmethod.inputArray(sortedarray);
		System.out.println(outputelement);
	}
}
