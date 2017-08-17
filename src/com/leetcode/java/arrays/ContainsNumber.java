package com.leetcode.java.arrays;

//http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html
//3. How to check if array contains a number in Java? 	
public class ContainsNumber {

	public boolean containsNumSortedArrayMethod(int[] array, int n) {
		int left = 0;
		int right = array.length - 1;
		int mid = (left + right) / 2;

		do {
			if (n < mid) {
				right = mid - 1;
				mid = (left + right) / 2;
			} else if (n > mid) {
				left = mid + 1;
				mid = (left + right) / 2;
			} else if (n == mid) {
				return true;
			}
		} while (left != right);
		return false;
	}

	public boolean containsNumUnsortedArrayMethod(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsNumber object = new ContainsNumber();
		System.out.println("Sorted Array");
		System.out.println();
		int[] sortedArray = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int findNumber1 = 5;
		int findNumber2 = 9;

		boolean output1 = object.containsNumSortedArrayMethod(sortedArray, findNumber1);
		System.out.println("expected output = true");
		System.out.println("actual output = " + output1);
		System.out.println();
		boolean output2 = object.containsNumSortedArrayMethod(sortedArray, findNumber2);
		System.out.println("expected output = false");
		System.out.println("actual output = " + output2);

		System.out.println();
		System.out.println("Unsorted Array");
		System.out.println();
		int[] unsortedArray = { 5, 3, 9 };
		int findNumber3 = 5;
		int findNumber4 = 1;

		boolean output3 = object.containsNumUnsortedArrayMethod(unsortedArray, findNumber3);
		System.out.println("expected output = true");
		System.out.println("actual output = " + output3);
		System.out.println();
		boolean output4 = object.containsNumUnsortedArrayMethod(unsortedArray, findNumber4);
		System.out.println("expected output = false");
		System.out.println("actual output = " + output4);

	}
}
