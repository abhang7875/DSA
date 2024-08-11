package com.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	static class TreeNode {
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

	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root == null) return output;
        Queue<TreeNode> data = new LinkedList<>();
        data.add(root);
        
        while(!data.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();

            while(!data.isEmpty()){
            	TreeNode curr = data.poll();
                temp.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            output.add(temp);
            data = queue;

        }
        
        return output;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(15);

		System.out.println(levelOrder(root));
	}
}
