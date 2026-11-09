package com.practice.geeksforgeeks.array;

public class SumOfSubArrays {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length, sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (arr[i] * ((n-i) * (i +1)));
        }
        return sum;
    }
}
