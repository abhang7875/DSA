package com.leetcode.daily;

public class BeautifulString {
    public int minChanges(String s) {
        int n = s.length();
        int i = 0, j = 1;
        int output = 0;
        while(j < n) {
            if(s.charAt(i) != s.charAt(j)) output++;
            i+=2;
            j+=2;
        }
        return output;
    }
}
