package com.practice.geeksforgeeks.array.matrix;

public class MagicSquare {
    public boolean magicSquare(int[][] mat) {
        // code here
        int n = mat.length;
        int size = n * n;
        boolean temp[] = new boolean[size];
        int sum = -1;
        for(int i = 0; i < n; i++) {
            int x = 0, y = 0;
            for(int j = 0; j < n; j++) {
                if(mat[i][j] > size || mat[i][j] < 1) return false;
                if(temp[mat[i][j] - 1]) return false;
                temp[mat[i][j] - 1] = true;
                x += mat[i][j];
                y += mat[j][i];
            }
            if(sum == -1) sum = x;
            if(sum != x || sum != y) return false;
        }
        int diag = 0;
        for(int i = 0; i < n; i++) diag += mat[i][i];
        if(diag != sum) return false;
        diag = 0;
        for(int i = 0, j = n - 1; i < n; i++, j--) {
            diag += mat[i][j];
        }
        if(diag != sum) return false;
        return true;
    }
}
