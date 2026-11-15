package com.practice.geeksforgeeks.array.matrix;

import java.util.ArrayList;

public class MatrixBoundaryTraversal {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int n = mat.length, m = mat[0].length;
        ArrayList<Integer> output = new ArrayList<>();
        if(n == 1 || m == 1) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    output.add(mat[i][j]);
                }
            }
            return output;
        }
        for(int i = 0; i < m; i++)
            output.add(mat[0][i]);
        for(int i = 1; i < n; i++)
            output.add(mat[i][m - 1]);
        for(int i = m - 2; i >= 0; i--)
            output.add(mat[n - 1][i]);
        for(int i = n - 2; i > 0; i--)
            output.add(mat[i][0]);
        return output;
    }
}
