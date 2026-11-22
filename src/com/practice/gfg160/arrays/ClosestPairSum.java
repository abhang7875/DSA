package com.practice.gfg160.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPairSum {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        int left = 0, right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> output = new ArrayList<>();
        Arrays.sort(arr);
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                output.clear();
                output.add(arr[left]);
                output.add(arr[right]);
                return output;
            }
            int diff = 0;
            if(sum > target) {
                diff = sum - target;
                if(diff < minDiff) {
                    minDiff = diff;
                    output.clear();
                    output.add(arr[left]);
                    output.add(arr[right]);
                }
                right--;
            } else {
                diff = target - sum;
                if(diff < minDiff) {
                    minDiff = diff;
                    output.clear();
                    output.add(arr[left]);
                    output.add(arr[right]);
                }
                left++;
            }
        }
        return output;
    }
}
