package com.practice.geeksforgeeks.array.matrix;

import java.util.ArrayList;

public class MatrixDiagonalTraversal {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> output = new ArrayList();
        int i = 0;
        int n = mat.length;

        while(i < n) {
            int x = 0;
            int y = i;
            while(x < n && y >= 0) {
                output.add(mat[x++][y--]);
            }
            i++;
        }
        int j = 1;
        while(j < n) {
            int x = j;
            int y = n - 1;
            while(x < n && y >= 0) {
                output.add(mat[x++][y--]);
            }
            j++;
        }
        return output;
    }
}
