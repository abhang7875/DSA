package com.practice.gfg160.strings;

import java.util.ArrayList;

public class SearchPattern {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> output = new ArrayList<>();
        int n = txt.length(), k = pat.length();
        for(int i = 0; i <= n - k; i++) {
            if(txt.substring(i, i + k).equals(pat)) output.add(i);
        }
        return output;
    }
}
