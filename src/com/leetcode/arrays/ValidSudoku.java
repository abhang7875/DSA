package com.leetcode.arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if(!checkColumns(board)) return false;
        if(!checkRows(board)) return false;

        for(int i = 0; i < board.length; i+=3){
            for(int j =0; j < board[0].length; j+=3){
                if(!checkBox(board, i, j)) return false;
            }
        }
        return true;
    }

    public boolean checkColumns(char[][] board){
        for(int i = 0; i < board[0].length; i++){
            boolean temp[] = new boolean[10];
            for(int j = 0; j < board.length; j++){
                if(board[j][i] == '.') continue;
                if(temp[board[j][i]-'0']){
                    return false;
                }else{
                    temp[board[j][i]-'0'] = true;
                }
            }
        }
        return true;
    }

    public boolean checkRows(char[][] board){
        for(int i = 0; i < board.length; i++){
            boolean temp[] = new boolean[10];
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.') continue;
                if(temp[board[i][j]-'0']){
                    return false;
                }else{
                    temp[board[i][j]-'0'] = true;
                }
            }
        }
        return true;
    }

    public boolean checkBox(char[][] board, int rowStart, int colStart){
        boolean temp[] = new boolean[10];
        for(int i = rowStart; i < rowStart + 3; i++){
            for(int j = colStart; j < colStart + 3; j++){
                if(board[i][j] == '.') continue;
                if(temp[board[i][j]-'0']){
                    return false;
                }else{
                    temp[board[i][j]-'0'] = true;
                }
            }
        }
        return true;
    }
}