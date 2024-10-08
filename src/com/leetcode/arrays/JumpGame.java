package com.leetcode.arrays;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int last = nums.length - 1;
		for (int i = last - 1; i >= 0; i--) {
			if (i + nums[i] >= last) {
				last = i;
			}
		}
		return last == 0;
	}
}