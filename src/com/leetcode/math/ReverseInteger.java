package com.leetcode.math;

public class ReverseInteger {
    public int reverse(int x) {
        boolean flag = false;
        if(x < 0){
            x = -x;
            flag = true;
        }
        int output = 0;
        while(x > 0){
            if(output > Integer.MAX_VALUE/10 || output < Integer.MIN_VALUE/10){
                return 0;
            }
            output = (output * 10) + (x % 10);
            x /= 10;
        }
        return flag? -output: output;
    }
} 