package com.practice.gfg160.mathematics;

public class GCD {
    public static int gcd(int a, int b) {
        // code here
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
