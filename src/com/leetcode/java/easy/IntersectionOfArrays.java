package com.leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//350. Intersection of Two Arrays II
//Given two arrays, write a function to compute their intersection.
public class IntersectionOfArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
		// put nums2 array in Map
		Map<Integer, Integer> counterMapNums2 = new HashMap<Integer, Integer>();
		for (int i : nums2) {
			if (!counterMapNums2.containsKey(i)) {
				counterMapNums2.put(i, 1);
			} else {
				int temp = counterMapNums2.get(i);
				counterMapNums2.put(i, temp + 1);
			}
		}

		List<Integer> outputList = new ArrayList<Integer>();
		for (int key : nums1) {

			// if Map contains array element then put result in array
			// and decrease value by 1
			if (counterMapNums2.containsKey(key)) {
				if (counterMapNums2.get(key) > 0) {
					int temp = counterMapNums2.get(key);
					counterMapNums2.put(key, temp - 1);
					outputList.add(key);
				}
			}
		}
		int[] array = new int[outputList.size()];
		for (int i = 0; i < outputList.size(); i++) {
			array[i] = outputList.get(i);
		}
		return array;

	}

	// main method
	public static void main(String[] args) {
		int[] nums1 = { 4, 10, 2, 1, 5, 2 };
		int[] nums2 = { 9, 2, 1, 3, 10, 1, 2 };
		IntersectionOfArrays callingObject = new IntersectionOfArrays();
		int[] outputArray = callingObject.intersect(nums1, nums2);
		System.out.println("expected output is: " + "[10,2,1,2]");
		System.out.println("actual output is: " + Arrays.toString(outputArray));

	}
}
