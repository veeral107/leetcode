package com.leetcode.java.easy;

import java.util.Arrays;

//283
//Given an array of numbers, 
//write a function to move all 0's to the end of it 
//while maintaining the relative order of the non-zero elements.

public class MoveZeroes {

	public void moveZeroes(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
			System.out.println(Arrays.toString(nums));
		}
	}

	public static void main(String[] args) {
		MoveZeroes callingObject = new MoveZeroes();
		int[] inputArray = { 0, 1, 9, 3, 0, 7 };
		// System.out.println(Arrays.toString(inputArray));
		callingObject.moveZeroes(inputArray);
		// System.out.println(Arrays.toString(inputArray));
	}
}
