package com.leetcode.strings;

public class ReplaceStartsWith {

	public static void main(String[] args) {

		String prefixes[] = { "cat", "rat", "bat" };
		String input = "the cattled was rattled by battery";

		for (String prefix : prefixes) {
			String regex = String.format("\\b%s\\w*", prefix);
			input = input.replaceAll(regex, prefix);
		}
		
		System.out.println(input);
	}

}
