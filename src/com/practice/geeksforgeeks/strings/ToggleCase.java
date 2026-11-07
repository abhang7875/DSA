package com.practice.geeksforgeeks.strings;

public class ToggleCase {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch - 'A' + 'a'));
            } else if(ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch + 'A' - 'a'));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
