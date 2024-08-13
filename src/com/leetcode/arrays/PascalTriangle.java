package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        output.add(Arrays.asList(1));
        if(numRows==1) return output;
        output.add(Arrays.asList(1,1));
        for(int i = 2; i < numRows; i++){
            List<Integer> prev = output.get(i-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 2; j <= i; j++){
                temp.add(prev.get(j-2) + prev.get(j-1));
            }
            temp.add(1);

            output.add(temp);
        }
        return output;
    }
}