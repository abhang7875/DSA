package com.leetcode.binary_tree;

public class MaximumDepth {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));

	}
}
