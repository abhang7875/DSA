package com.leetcode.arrays;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int output = nums[0], current = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(!flag){
                current = nums[i];
                if(nums[i] >= 0){
                    flag = true;
                }
            }else{
                current += nums[i];
                if(current < 0) current = 0;
            }
            output = Math.max(output, current); 
        }
        return output;
    }
}