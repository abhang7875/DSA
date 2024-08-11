package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums.length < 3)
            return output;
        int start = 0;
        int n = nums.length;
        while(start + 2 < n){
            int a = nums[start];
            int b = nums[start + 1];
            int c = nums[start + 2];
            if(a + b + c == 0){
                List<Integer> temp = new ArrayList<>();
                temp.add(a);
                temp.add(b);
                temp.add(c);
                output.add(temp);
            }
            start++;
        }
        return output;
    }
}