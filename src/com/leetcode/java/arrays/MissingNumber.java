package com.leetcode.java.arrays;
//http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html

//1. How to find the missing number in integer array of 1 to 100
// S=n(a1+an)/2 
public class MissingNumber {
	public int missingNumberMethod(int[] a) {
		int i = 0;
		int expectedSum = (a.length + 1) * (a[i] + a[a.length - 1]) / 2;
		int actualSum = 0;
		for (int j = 0; j < a.length; j++) {
			actualSum = actualSum + a[j];
		}
		int missingNum = expectedSum - actualSum;
		return missingNum;
	}

	public static void main(String[] args) {
		MissingNumber object = new MissingNumber();
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 8 };
		int output = object.missingNumberMethod(inputArray);
		System.out.println("expected missing number= 7");
		System.out.println("actual missing number= " + output);

	}

}
