package com.leetcode.java.practice;

//136: easy
///Could you implement it in linear runtime complexity & without using extra memory?
//with extra memory we can use map
public class SingleNumber {
	public int solutions(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			result = result ^ array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		SingleNumber object = new SingleNumber();
		int[] inputArray = { 7, 8, 4, 4, 8 };
		int output = object.solutions(inputArray);
		System.out.println("expected output = 7");
		System.out.println("actual output = " + output);
	}
}
