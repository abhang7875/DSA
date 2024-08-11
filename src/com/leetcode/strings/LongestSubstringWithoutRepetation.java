package com.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepetation {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> data = new HashMap<>();
        int output = 0, current = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (data.containsKey(ch)) {
                current = 0;
                i = data.get(ch) + 1;
                data.clear();
            }
            data.put(ch, i);
            current++;

            output = Math.max(output, current);
        }
        return output;
    }
}
