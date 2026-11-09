package com.practice.geeksforgeeks.strings;

public class MyAtoi {
    public int myAtoi(String s) {
        // code here
        int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        boolean negative = false;
        if(s.charAt(i) == '-') {
            negative = true;
            i++;
        } else if(s.charAt(i) == '+') {
            i++;
        }
        long output = 0;
        while(i < n) {
            int curr = s.charAt(i) - '0';
            i++;
            if(curr < 0 || curr > 9) break;
            output = output * 10 + curr;
        }
        if(output > Integer.MAX_VALUE) {
            return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return negative? (int)-output : (int)output;
    }
}
