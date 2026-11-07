package com.practice.geeksforgeeks.strings;

public class PanagramStrings {
    public static boolean checkPangram(String s) {
        // code here
        boolean[] alphabets = new boolean[26];
        s = s.toLowerCase();

        for(char ch: s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') alphabets[ch - 'a'] = true;
        }
        for(boolean al: alphabets) {
            if(!al) return false;
        }
        return true;
    }
}
