package com.practice.gfg160.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctElementInWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        Map<Integer, Integer> data = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        int left = 0, right = 0;
        int n = arr.length;
        while(right < n) {
            if((right - left) < k) {
                data.put(arr[right], data.getOrDefault(arr[right], 0) + 1);
                right++;
            } else {
                output.add(data.size());
                int curr = data.get(arr[left]);
                if(curr == 1) {
                    data.remove(arr[left]);
                } else {
                    data.put(arr[left], curr - 1);
                }
                left++;
            }
        }
        output.add(data.size());
        return output;
    }
}
