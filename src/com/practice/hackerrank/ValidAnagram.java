package com.practice.hackerrank;

public class ValidAnagram {
    public static int isAnagram(String s, String t) {
        // Write your code here
        if(s == null && t == null) return 1;
        if(s == null || t == null) return 0;
        if(s.isEmpty() && t.isEmpty()) return 1;
        if(s.isEmpty() || t.isEmpty()) return 0;
        if(s.length() != t.length()) return 0;
        int n = s.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < n; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq1[i] != freq2[i]) return 0;
        }
        return 1;
    }
}
