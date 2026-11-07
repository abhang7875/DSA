package com.practice.gfg160.mathematics;

import java.util.Arrays;

public class MedianOfArray {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        double a = arr[n / 2];
        double b = n % 2 == 1? a : arr[n / 2 - 1];
        return (a + b) / 2;
    }
}
