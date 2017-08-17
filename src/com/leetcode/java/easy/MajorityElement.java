package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//169
//Given an array of size n, find the majority element. 
//The majority element is the element that appears more than ⌊ n/2 ⌋ times.

public class MajorityElement {
	int majorityElement(int[] nums) {
		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

		for (int key : nums) {
			if (!counterMap.containsKey(key)) {
				counterMap.put(key, 1);
			} else {
				int temp = counterMap.get(key);
				temp = counterMap.put(key, temp + 1);
			}
		}

		int elementCount = nums.length / 2 + 1;
		for (Entry<Integer, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() >= elementCount) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		MajorityElement calligObject = new MajorityElement();
		int[] inputArray = { 1, 2, 2, 2, 5, 2 };
		int majorityElement = calligObject.majorityElement(inputArray);
		System.out.println(majorityElement);
	}

}
