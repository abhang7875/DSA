package com.leetcode.strings;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> data = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				data.push('(');
			} else if (ch == ')') {
				if (data.isEmpty()) {
					return false;
				} else {
					if (data.pop() != '(') {
						return false;
					}
				}
			} else if (ch == '{') {
				data.push('{');
			} else if (ch == '}') {
				if (data.isEmpty()) {
					return false;
				} else {
					if (data.pop() != '{') {
						return false;
					}
				}
			} else if (ch == '[') {
				data.push('[');
			} else if (ch == ']') {
				if (data.isEmpty()) {
					return false;
				} else {
					if (data.pop() != '[') {
						return false;
					}
				}
			}
		}
		return data.isEmpty();
	}
}