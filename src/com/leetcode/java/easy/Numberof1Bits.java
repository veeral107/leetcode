package com.leetcode.java.easy;

// 191. Number of 1 Bits
public class Numberof1Bits {
	public int countBits(int n) {
		int remainder;
		int count = 0;
		while (n != 0 || n > 0) {
			remainder = n % 2;
			count = count + remainder;
			n = n / 2 - 1;
		}

		return count;
	}

}
