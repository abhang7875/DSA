package com.practice.hackerrank;

import java.util.List;

public class FindSmallestMissingPositive {
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        if(orderNumbers == null || orderNumbers.isEmpty()) return 1;
        int n = orderNumbers.size();

        for(int i = 0; i < n; i++) {
            int curr = orderNumbers.get(i);
            if(curr > 0 && curr <= n && curr != i + 1 && orderNumbers.get(curr - 1) != curr) {
                swap(orderNumbers, curr - 1, i);
                i--;
            }
        }
        for(int i = 0; i < n; i++) {
            int curr = orderNumbers.get(i);
            if(curr != i + 1) return i + 1;

        }
        return n + 1;

    }

    private static void swap(List<Integer> orderNumbers, int i, int j) {
        int temp = orderNumbers.get(i);
        orderNumbers.set(i, orderNumbers.get(j));
        orderNumbers.set(j, temp);
    }
}
