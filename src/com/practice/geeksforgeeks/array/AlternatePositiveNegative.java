package com.practice.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AlternatePositiveNegative {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for(int i: arr) {
            if(i < 0) neg.add(i);
            else pos.add(i);
        }
        int n = arr.size();
        int i = 0;
        while(i < n) {
            Integer positive = pos.isEmpty() ? neg.poll() : pos.poll();
            Integer negative = neg.isEmpty() ? pos.poll() : neg.poll();
            arr.set(i, positive);
            if(i + 1 < n) arr.set(i + 1, negative);
            i += 2;
        }
    }
}
