package com.practice.geeksforgeeks.strings;

public class RemoveCharacter {
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) {
                s.deleteCharAt(i);
                i--;
                n--;
            }
        }
    }
}
