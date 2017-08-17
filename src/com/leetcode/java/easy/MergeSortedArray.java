package com.leetcode.java.easy;

import java.util.Arrays;

//88. Merge Sorted Array
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//You may assume that nums1 has enough space 
//(size that is greater or equal to m + n) to hold additional elements from nums2. 
//The number of elements initialized in nums1 and nums2 are m and n respectively
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// no extra array
		int x = m + n;

		for (; m > 0 && n > 0; x--) {
			if (nums1[m - 1] > nums2[n - 1]) { // 6>3
				nums1[x - 1] = nums1[m - 1];
				m--;
			} else {
				nums1[x - 1] = nums2[n - 1];
				n--;
			}
		}

		if (m == 0) {
			while (x > 0) {
				nums1[x - 1] = nums2[n - 1];
				n--;
				x--;
			}
		} else {
			while (x > 0) {
				nums1[x - 1] = nums1[m - 1];
				m--;
				x--;
			}
		}
	}

	public void mergeWithExtraArray(int[] nums1, int m, int[] nums2, int n) {
		// Using extra array
		int[] outputArray = new int[nums1.length + nums2.length];
		int x = 0; // for outputArray
		int i = 0;
		int j = 0;

		for (x = 0; x < m + n; x++) {
			if (j >= n) {
				outputArray[x] = nums1[i];
				i++;
			} else if (i >= m) {
				outputArray[x] = nums2[j];
				j++;
			} else if (nums1[i] >= nums2[j]) {
				outputArray[x] = nums2[j];
				j++;
			} else if (nums1[i] < nums2[j]) {
				outputArray[x] = nums1[i];
				i++;
			}
		}

		for (int y = 0; y < nums1.length; y++) {
			nums1[y] = outputArray[y];
		}
	}

	// main method
	public static void main(String[] args) {
		MergeSortedArray callingObject = new MergeSortedArray();
		int[] nums1 = { 4, 5, 6, 0, 0, 0 };
		int[] nums2 = { 1, 2, 3 };
		int m = 3;
		int n = 3;

		callingObject.merge(nums1, m, nums2, n);
		System.out.println("expected array: [1, 2, 3, 4, 5, 6]");
		System.out.println("actual array:   " + Arrays.toString(nums1));

	}
}
