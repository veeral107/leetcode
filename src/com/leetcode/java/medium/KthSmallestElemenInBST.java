package com.leetcode.java.medium;

//230.Kth Smallest Element in a BST
public class KthSmallestElemenInBST {
	public int kthSmallest(TreeNode root, int k) {

		while (root.left != null) {
			root = root.left;
		}

		if (k == 1) {
			return root.left.val;
		} else {
			// TreeNode currNode =root.left;
			int count = 1;
			for (int i = 1; i <= k; i++) {

				if (count == k) {
					return root.left.val;
				} else {
					count++;

				}
				if (count == k) {
					return root.val;
				} else {
					count++;
				}
				if (count == k) {
					return root.right.val;
				}

			}
		}

		return 0;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
