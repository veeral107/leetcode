package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//347. Top K Frequent Elements
//Given a non-empty array of integers, return the k most frequent elements.
public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (!counterMap.containsKey(i)) {
				counterMap.put(i, 1);
			} else {
				int temp = counterMap.get(i);
				counterMap.put(i, temp + 1);
			}
		}

		return null;

	}

}
