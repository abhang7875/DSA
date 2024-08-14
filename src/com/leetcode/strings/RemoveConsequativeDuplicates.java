package com.leetcode.strings;

public class RemoveConsequativeDuplicates {
	public static void main(String[] args) {
		String input = "Hhello World   ....!!!".toLowerCase();
		StringBuilder sb = new StringBuilder();

		if (input == null || input.isEmpty()) {
			System.out.println(" ");
		} else {
			sb.append(input.charAt(0));
			for (int i = 1; i < input.length(); i++) {
				if (input.charAt(i) != input.charAt(i - 1))
					sb.append(input.charAt(i));
			}
			System.out.println(sb.toString());
		}
	}
}
