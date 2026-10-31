package com.practice.hackerrank;

public class CustomFibonacciSequence {
    private static final long[] data = new long[93];
    static {
        data[0] = 1;
        data[1] = 2;
    }
    public static long getAutoSaveInterval(int n) {
        // Write your code here
        if(data[n] != 0) return data[n];
        data[n] = getAutoSaveInterval(n - 1) + getAutoSaveInterval(n - 2);
        return data[n];
    }
}
