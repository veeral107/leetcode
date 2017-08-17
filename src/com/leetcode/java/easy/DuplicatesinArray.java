package com.leetcode.java.easy;

//217 Contains Duplicate
//Given an array of integers, find if the array contains any duplicates. 
//Your function should return 
//true if any value appears at least twice in the array, 
//and it should return false if every element is distinct.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesinArray {

	boolean containsDuplicate(int[] nums) {
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
			if (entry.getValue() >= 2) {
				return true;
			}
		}
		return false;
	}

	// using sets
	boolean setDuplicate(int[] array) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i : array) {
			if (!set.add(i)) {
				return true;
			}
		}
		return false;

	}

	// main method
	public static void main(String[] args) {
		DuplicatesinArray callingObject = new DuplicatesinArray();
		int[] inputArray = { 3, 2, 6, 7 };
		// using Maps
		boolean mapsOutput = callingObject.containsDuplicate(inputArray);
		System.out.println("Maps output:  " + mapsOutput);
		// using sets
		boolean setsOutput = callingObject.setDuplicate(inputArray);
		System.out.println("Sets output:  " + setsOutput);
	}
}
