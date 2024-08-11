package com.leetcode.math;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i =0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}