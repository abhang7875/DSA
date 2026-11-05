package com.practice.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubarrays {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> output = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            output.add(new ArrayList<>(temp));
            for(int j = i + 1; j < n; j++) {
                temp.add(arr[j]);
                output.add(new ArrayList<>(temp));
            }
        }

        return output;
    }
}
