package com.leetcode.java.easy;
//104. Maximum Depth of Binary Tree

public class MaximumDepthBST {

	public int maximumDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return calculateMaxDepth(root, 1);
		}
	}

	public int calculateMaxDepth(TreeNode node, int depth) {
		int left = depth;
		int right = depth;

		if (node.left != null) {
			left = calculateMaxDepth(node, depth + 1);
		}
		if (node.right != null) {
			right = calculateMaxDepth(node, depth + 1);
		}

		if (left > right) {
			return left;
		} else {
			return right;
		}
	}

}
