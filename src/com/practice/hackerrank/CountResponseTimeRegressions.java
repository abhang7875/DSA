package com.practice.hackerrank;

import java.util.List;

public class CountResponseTimeRegressions {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here
        if(responseTimes == null || responseTimes.isEmpty()) return 0;
        int output = 0;
        double currSum = (int) responseTimes.get(0);
        for(int i = 1; i < responseTimes.size(); i++) {
            int curr = responseTimes.get(i);
            double average = Math.floor((currSum/ i));
            if(curr > average) output++;
            currSum += curr;
        }
        return output;
    }
}
