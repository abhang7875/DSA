package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneDigitCombinations {
    private static final List<String> mappings = Arrays.asList("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
    private static int n = 0;
    public static List<String> minTasksToCancelForNoConflict(String digits) {
        // Write your code here
        n = digits.length();
        List<String> output = new ArrayList<>();
        helper(new StringBuilder(), digits, 0, output);
        return output;
    }

    private static void helper(StringBuilder curr, String digits, int index, List<String> output) {
        if(index >= n) {
            output.add(curr.toString());
            return;
        }
        String mapping = mappings.get(digits.charAt(index) - '0');

        for(char ch: mapping.toCharArray()) {
            curr.append(ch);
            helper(curr, digits, index + 1, output);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
