package com.practice.hackerrank;

public class AlphabeticPallindrome {
    public static boolean isAlphabeticPalindrome(String code) {
        // Write your code here
        code = code.toLowerCase();
        int left = 0, right = code.length() - 1;
        while(left < right) {
            if(!isAlphabetic(code.charAt(left))) left++;
            else if(!isAlphabetic(code.charAt(right))) right--;
            else {
                if(code.charAt(left) != code.charAt(right)) return false;
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isAlphabetic(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
