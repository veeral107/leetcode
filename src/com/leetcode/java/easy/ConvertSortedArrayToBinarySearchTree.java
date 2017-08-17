package com.leetcode.java.easy;

//108. Convert Sorted Array to Binary Search Tree
//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] nums, int left, int right) {

		if (left > right) {
			return null;
		}

		int center = (left + right) / 2;

		TreeNode centerTN = new TreeNode(nums[center]);
		TreeNode leftTN = sortedArrayToBST(nums, left, center - 1);
		TreeNode rightTN = sortedArrayToBST(nums, center + 1, right);

		centerTN.left = leftTN;
		centerTN.right = rightTN;
		return centerTN;
	}

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ConvertSortedArrayToBinarySearchTree object = new ConvertSortedArrayToBinarySearchTree();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		object.sortedArrayToBST(nums);
		System.out.println("end");
	}
}
