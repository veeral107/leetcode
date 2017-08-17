package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//409. Longest Palindrome
//Given a string which consists of lowercase or uppercase letters, 
//find the length of the longest palindromes that can be built with those letters.
//This is case sensitive, for example "Aa" is not considered a palindrome here.
//Note: Assume the length of given string will not exceed 1,010.

public class LongestPalindrome {
	public int longestPalindrome(String s) {

		char[] inputString = s.toCharArray();
		Map<Character, Integer> counterMap = new HashMap<Character, Integer>();

		for (char key : inputString) {
			if (!counterMap.containsKey(key)) {
				counterMap.put(key, 1);
			} else {
				int temp = counterMap.get(key);
				counterMap.put(key, temp + 1);
			}
		}

		int countLength = 0;
		for (Entry<Character, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() % 2 == 0) {
				countLength = countLength + entry.getValue();
			} else {
				countLength = countLength + entry.getValue() - 1;
			}
		}

		for (char key : inputString) {
			if (counterMap.get(key) % 2 != 0) {
				countLength++;
				break;
			}
		}

		return countLength;
	}

	// main method
	public static void main(String[] args) {
		LongestPalindrome callingObject = new LongestPalindrome();

		String s1 = "ccc";
		int outputLength2 = callingObject.longestPalindrome(s1);
		System.out.println("Longest Palindrome is: ccc ");
		System.out.println("expected length is: 3");
		System.out.println("Actual Length is: " + outputLength2);
		System.out.println("");

		String s3 = "cccddd";
		int outputLength3 = callingObject.longestPalindrome(s3);
		System.out.println("Longest Palindrome is: dcccd ");
		System.out.println("expected length is: 5");
		System.out.println("Actual Length is: " + outputLength3);
		System.out.println("");
		String s = "abccccdd";

		int outputLength = callingObject.longestPalindrome(s);
		System.out.println("Longest Palindrome is: dccaccd ");
		System.out.println("expected length is: 7");
		System.out.println("Actual Length is: " + outputLength);

	}

}
// nirav solution
// import java.util.HashMap;
// import java.util.Map;
//
// public class LongestPalindrome {
// public int longestPalindrome(String s) {
// char[] input = s.toCharArray();
// Map<Character, Integer> freq = new HashMap<Character, Integer>();
//
// for (char c : input) {
// freq.put(c, (freq.containsKey(c) ? freq.get(c) : 0) + 1);
// }
//
// int result = 0;
// boolean isOddFreqPresent = false;
// for (int f : freq.values()) {
// if (f % 2 == 0) {
// result += f;
// } else {
// result += f - 1;
// isOddFreqPresent = true;
// }
// }
//
// return isOddFreqPresent ? result + 1 : result;
// }
// }

// Solution in leetcode
// if(s==null || s.length()==0) return 0;
// HashSet<Character> hs = new HashSet<Character>();
// int count = 0;
// for(int i=0; i<s.length(); i++){
// if(hs.contains(s.charAt(i))){
// hs.remove(s.charAt(i));
// count++;
// }else{
// hs.add(s.charAt(i));
// }
// }
// if(!hs.isEmpty()) return count*2+1;
// return count*2;
