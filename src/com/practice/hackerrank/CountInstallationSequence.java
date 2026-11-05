package com.practice.hackerrank;

import java.math.BigInteger;

public class CountInstallationSequence {
    /*
     * Complete the 'countInstallationSequences' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER n as parameter.
     */

    public static String countInstallationSequences(int n) {
        // Write your code here
        if(n == 0) return "1";
        BigInteger a = BigInteger.ONE, b = new BigInteger("2");
        if(n == 1) return a.toString();
        if(n == 2) return b.toString();
        for(int i = 2; i < n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b.toString();
    }
}
