package com.leetcode.java.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html
//2. How to find duplicate number on Integer array in Java?  
public class DuplicateNumber {
	public int duplicateNumMethodSets(int[] array) {

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
			} else {
				return array[i];
			}
		}
		return 0;
	}

	public int duplicateNumMaps(int[] array) {

		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (!counterMap.containsKey(array[i])) {
				counterMap.put(array[i], 1);
			} else {
				// int temp=counterMap.get(array[i]);
				// counterMap.put(array[i], temp+1);
				return array[i];
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		int[] inputArray = { 7, 5, 3, 5 };
		DuplicateNumber object = new DuplicateNumber();
		int output = object.duplicateNumMethodSets(inputArray);
		System.out.println("expected duplicate number = 5 ");
		System.out.println("actual duplicate number = " + output);

		int output2 = object.duplicateNumMaps(inputArray);
		System.out.println("expected duplicate number = 5 ");
		System.out.println("actual duplicate number = " + output2);

	}
}
