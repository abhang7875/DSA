package com.leetcode.arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = 0, n = digits.length;
        while(i < digits.length){
            int val = digits[n - i - 1] + 1;
            if(val == 10){
                digits[n - i - 1] = 0;
            }else{
                digits[n - i - 1] = val;
                break;
            }
            i++;
        }
        if(i == n){
            digits = new int[n+1];
            digits[0] = 1;
        }
        return digits;
    }
}