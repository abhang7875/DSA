package com.practice.geeksforgeeks.array;

public class CountIncreasingSubarrays {
    public int countIncreasing(int[] arr) {
        // code here
        int output = 0;
        int n = arr.length;
        int left = 0, right = 1;
        while(right < n) {
            if(arr[right] > arr[right - 1]) {
                right++;
            } else {
                right--;
                int len = right - left + 1;
                left = right + 1;
                right = left + 1;
                output += ((len * (len - 1)) / 2);
            }
        }
        int len = right - left;
        output += ((len * (len - 1)) / 2);
        return output;
    }
}
