package com.practice.gfg160.mathematics;

public class CountSquares {
    static int countSquares(int n) {
        // code here
        int output = 0;
        for(int i = 1; i * i < n; i++) {
            output++;
        }
        return output;
    }
}
