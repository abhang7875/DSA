package com.leetcode.arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;

        int output = 0;
        while(right > 0){
            output = Math.max(output, (right - left) * Math.min(height[right], height[left]));
            if(height[right] > height[left]) left++; else right--;
        }

        return output;
    }
}