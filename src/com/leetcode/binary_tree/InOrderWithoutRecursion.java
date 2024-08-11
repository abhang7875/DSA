package com.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderWithoutRecursion {

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

	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> data = new Stack<>();
		List<Integer> output = new ArrayList<>();

		TreeNode current = root;

		while (current != null || data.size() > 0) {

			while (current != null) {
				data.push(current);
				current = current.left;
			}

			current = data.pop();

			output.add(current.val);

			current = current.right;
		}

		return output;
	}
}