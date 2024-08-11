package com.leetcode.binary_tree;

public class ValidateBinaryTree {
	class TreeNode {
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

	public boolean isValidBST(TreeNode root) {
		if (root.left != null) {
			if (root.left.val >= root.val)
				return false;
			isValidBST(root.left);
		}
		
		if (root.right != null) {
			if (root.right.val <= root.val)
				return false;
			isValidBST(root.right);
		}

		return true;
	}

	public static void main(String[] args) {
		ValidateBinaryTree validator = new ValidateBinaryTree();
		TreeNode root = validator.new TreeNode(2);
		root.left = validator.new TreeNode(1);
		root.right = validator.new TreeNode(3);

		System.out.println(validator.isValidBST(root));
	}
}