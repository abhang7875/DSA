package com.practice.gfg160.mathematics;

public class Factorial {
    int factorial(int n) {
        // code here
        if(n <= 1) return 1;
        return n * factorial(n -1);
    }
}
