package com.leetcode.arrays;

import java.util.Arrays;

public class SortColors {
	
	public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
        	while(left < right && nums[left] == 0) left++;
        	while(left < right && nums[right] == 2) right--;
        	
        	int temp = nums[right];
        	nums[right] = nums[left];
        	nums[left] = temp;
        	
        	left++;
        	right--;
        }
    }
	public static void main(String[] args) {
		int [] nums = new int[] {2,2,2,0,1};
		sortColors(nums);
		
		System.out.println(Arrays.toString(nums));
	}

}
