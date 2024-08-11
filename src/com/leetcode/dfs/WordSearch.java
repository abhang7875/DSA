package com.leetcode.dfs;

public class WordSearch {

	public static boolean exist(char[][] board, String word) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				boolean visited[][] = new boolean[board.length][board[0].length];
				if(helper(board, word, 0, i, j,visited)) return true;
				System.out.println();
			}
		}
		return false;
	}

	public static boolean helper(char[][] board, String word, int index, int i, int j, boolean [][] visited) {
		if (index == word.length())
			return true;
		char ch = word.charAt(index);
		if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && ch == board[i][j] && !visited[i][j]) {
			visited[i][j] = true;
			return helper(board, word, index + 1, i + 1, j, visited) ||
					helper(board, word, index + 1, i - 1, j, visited) ||
					helper(board, word, index + 1, i, j-1, visited) ||
					helper(board, word, index + 1, i, j+1, visited);
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		char [][] board = new char[][]{{'A','B','C','E'}
		,{'S','F','E','S'}
		,{'A','D','E','E'}};
		
		System.out.println(exist(board, "ABCESEEEFS"));
	}
}
