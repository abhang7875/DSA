package com.practice.geeksforgeeks.strings;

public class CheckSameString {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1 == null || s2 == null) return s1 == s2;
        return s1.equals(s2);
    }
}
