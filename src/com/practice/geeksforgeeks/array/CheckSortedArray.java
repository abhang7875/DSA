package com.practice.geeksforgeeks.array;

public class CheckSortedArray {
    public boolean isSorted(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
}
