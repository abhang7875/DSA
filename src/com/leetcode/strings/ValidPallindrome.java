package com.leetcode.strings;

public class ValidPallindrome {
	public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while(low < high){
            char ch1 = s.charAt(low);
            char ch2 = s.charAt(high);
            if(!isAlphaNumeric(ch1)) low++;
            else if(!isAlphaNumeric(ch2)) high--;
            else{
                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
                	return false;
                low++;
                high--;
            }
        }
        return true;
    }

	public boolean isAlphaNumeric(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
	}
}