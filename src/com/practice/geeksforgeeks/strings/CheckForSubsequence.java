package com.practice.geeksforgeeks.strings;

public class CheckForSubsequence {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        if(s1.length() > s2.length()) return false;
        int index = 0, n = s1.length();
        for(int i = 0; i < s2.length(); i++) {
            if(s1.charAt(index) == s2.charAt(i)) index++;
            if(index == n) return true;
        }
        return false;
    }
}
