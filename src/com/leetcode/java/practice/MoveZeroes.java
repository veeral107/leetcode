package com.leetcode.java.practice;

import java.util.Arrays;

//283. Move Zeroes: easy
//given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

public class MoveZeroes {

	public int[] moveZeroes(int[] array) {

		// for(int i=0;i<array.length-1;i++){
		// if(array[i]==0){
		// int temp=0;
		// array[i]=array[i+1];
		// array[i+1]=0;
		// }

		int j = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j++;
			}

		}

		return array;
	}

	public static void main(String[] args) {
		int[] inputArray = { 0, 1, 0, 3, 12 };
		MoveZeroes object = new MoveZeroes();
		int[] output = object.moveZeroes(inputArray);
		System.out.println(Arrays.toString(output));

	}

}
