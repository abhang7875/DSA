package com.leetcode.math;

public class MyPow {
    public double myPow(double x, int n) {
        double output = 1.0;
        long sign = n;
        if(sign < 0) sign = -sign;

        while(sign > 0){
            if(sign % 2 == 0){
                x *= x;
                sign /= 2;
            }else{
                output *= x;
                sign--;
            }
        }
        if(n < 0) output = 1/ output;
        return output;
    }
}