package com.practice.geeksforgeeks.strings;

import java.math.BigInteger;

public class MultiplyTwoStrings {
    public String multiplyStrings(String s1, String s2) {
        // code here
        if(s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        BigInteger output = new BigInteger("0");
        boolean firstNeg = s1.charAt(0) == '-';
        boolean secondNeg = s2.charAt(0) == '-';
        int left1 = 0, left2 = 0;
        int right1 = s1.length() - 1, right2 = s2.length() - 1;
        while(left1 <= right1 && (s1.charAt(left1) < '0' || s1.charAt(left1) > '9')) left1++;
        while(left2 <= right2 && (s2.charAt(left2) < '0' || s2.charAt(left2) > '9')) left2++;
        int count = 0;
        while(right1 >= left1) {
            int carry = 0;
            String res = "";
            int right = right2;
            while(right >= left2) {
                int a = s1.charAt(right1) - '0';
                int b = s2.charAt(right) - '0';
                int c = (a * b) + carry;
                if(c >= 10) {
                    carry = c / 10;
                } else {
                    carry = 0;
                }
                res = (c % 10) + res;
                right--;
            }
            if(carry != 0) {
                res = carry + res;
            }
            if(!res.isEmpty()) {
                for(int i = 0; i < count; i++) res += "0";
                output = output.add(new BigInteger(res));
            }
            right1--;
            count++;
        }
        if(output.equals(BigInteger.ZERO)) return "0";
        boolean sign = firstNeg == secondNeg;
        return !sign ? "-" + output.toString() : output.toString();
    }
}
