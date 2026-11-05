package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAndSortIntervals {
    static void main() {
        List<List<Integer>> intervals = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        intervals.add(Arrays.asList(1, 3));
        intervals.add(Arrays.asList(8, 15));
        intervals.add(Arrays.asList(8, 10));
        intervals.add(Arrays.asList(9, 10));
        intervals.add(Arrays.asList(15, 18));

        intervals.sort((a,b) -> {
            int x1 = a.get(0), x2 = a.get(1);
            int y1 = b.get(0), y2 = b.get(1);
            if(x1 == y1) return x2 - y2;
            return x1 - y1;
        });
        int n = intervals.size();
        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);
        for(int i = 1; i < n; i++) {
            int a = intervals.get(i).get(0), b = intervals.get(i).get(1);
            if(end >= a) {
                end = b;
            } else {
                output.add(Arrays.asList(start, end));
                start = a;
                end = b;
            }
        }
        output.add(Arrays.asList(start, end));
        System.out.println(output);
    }
}
