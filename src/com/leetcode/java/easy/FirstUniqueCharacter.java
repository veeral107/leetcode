package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;

//387. First Unique Character in a String
//Given a string, find the first non-repeating character in it and return it's index. 
//If it doesn't exist, return -1.
//10-April-2017

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		Map<Character, Integer> counterMap = new HashMap<Character, Integer>();

		char[] inputStringArray = s.toCharArray();

		for (char value : inputStringArray) {
			if (!counterMap.containsKey(value)) {
				counterMap.put(value, 1);
			} else {
				int temp = counterMap.get(value);
				counterMap.put(value, temp + 1);
			}
		}

		System.out.println(counterMap);

		for (int index = 0; index < inputStringArray.length; index++) {
			char value = inputStringArray[index];
			if (counterMap.get(value) == 1) {
				return index;
			}
		}
		return -1;
	}

	// main method
	public static void main(String[] args) {
		FirstUniqueCharacter callingObject = new FirstUniqueCharacter();
		String s1 = "harry";
		int output1 = callingObject.firstUniqChar(s1);
		System.out.println("expected index for harry = 0");
		System.out.println("actual index for harry = " + output1);
		String s2 = "harbhajan";
		int output2 = callingObject.firstUniqChar(s2);
		System.out.println(" ");
		System.out.println("expected index for harbhajan = 2");
		System.out.println("actual index for harbhajan = " + output2);
	}
}
