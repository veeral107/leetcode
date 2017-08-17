package com.leetcode.java.easy;

import java.util.HashSet;
import java.util.Set;

//19 is a happy number

//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> numberSet = new HashSet<Integer>();
		int squaredSum, remain;
		while (numberSet.add(n)) {
			squaredSum = 0;
			while (n > 0) {
				remain = n % 10;
				squaredSum = squaredSum + remain * remain;
				n = n / 10;
			}
			if (squaredSum == 1) {
				return true;
			} else {
				n = squaredSum;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		HappyNumber object = new HappyNumber();
		boolean output = object.isHappy(2);
		System.out.println(output);
	}

}
