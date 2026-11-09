package com.practice.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedSubSeqOfSize3 {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int prevFirst = Integer.MAX_VALUE;

        for(int i: arr) {
            if(i <= first) {
                first = i;
            } else if(i <= second) {
                second = i;
                prevFirst = first;
            } else {
                return new ArrayList<>(Arrays.asList(prevFirst, second, i));
            }
        }
        return new ArrayList<>();
    }
}
