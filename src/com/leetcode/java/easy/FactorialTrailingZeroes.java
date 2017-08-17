package com.leetcode.java.easy;

//172. Factorial Trailing Zeroes
//Given an integer n, return the number of trailing zeroes in n!.
//Note: Your solution should be in logarithmic time complexity.
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {

		int trailingZeroes = 0;
		do {
			trailingZeroes = trailingZeroes + n / 5;
			n = n / 5;
		} while (n > 0);
		return trailingZeroes;
	}

	public static void main(String[] args) {
		FactorialTrailingZeroes callingObject = new FactorialTrailingZeroes();

		int output1 = callingObject.trailingZeroes(25);
		System.out.println("expected output: 6");
		System.out.println("actual output: " + output1);

		int output2 = callingObject.trailingZeroes(30);
		System.out.println("expected output: 7");
		System.out.println("actual output: " + output2);

	}
}
