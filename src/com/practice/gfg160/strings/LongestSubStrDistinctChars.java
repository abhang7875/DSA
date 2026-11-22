package com.practice.gfg160.strings;

public class LongestSubStrDistinctChars {
    public int longestUniqueSubstr(String s) {
        // code here
        int freq[] = new int[255];
        int left = 0, right = 0;
        int n = s.length(), output = 0;
        while(right < n) {
            char ch = s.charAt(right);
            freq[ch]++;
            if(freq[ch] == 2) {
                while(s.charAt(left) != ch) {
                    freq[s.charAt(left)]--;
                    left++;
                }
                freq[s.charAt(left)]--;
                left++;
            } else {
                output = Math.max(output, right - left + 1);
            }
            right++;
        }
        return output;
    }
}
