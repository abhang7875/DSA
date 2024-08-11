package com.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(data.containsKey(target - nums[i])){
                return new int[]{data.get(target - nums[i]), i};
            }
            data.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
