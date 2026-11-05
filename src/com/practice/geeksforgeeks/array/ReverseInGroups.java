package com.practice.geeksforgeeks.array;

public class ReverseInGroups {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        int left = 0, right = k - 1;
        do {
            int start = left;
            int end = Math.min(n - 1, right);
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            left += k;
            right += k;
        } while(right < n);
        int start = left;
        int end = Math.min(n - 1, right);
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
