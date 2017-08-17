package com.leetcode.java.easy;

import java.util.Stack;

//20. Valid Parentheses Add to List
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				System.out.println("char: " + c);
				stack.push(')');
				System.out.println("stack: " + stack);
			} else if (c == '{') {
				System.out.println("char: " + c);
				stack.push('}');
				System.out.println("stack: " + stack);

			} else if (c == '[') {
				System.out.println("char: " + c);
				stack.push(']');
				System.out.println("stack: " + stack);

			} else if (stack.isEmpty() || stack.pop() != c) {
				System.out.println("char: " + c);
				System.out.println("stack: " + stack);
				return false;
			}
		}
		return stack.isEmpty();
	}

	// main
	public static void main(String[] args) {
		ValidParentheses object = new ValidParentheses();
		System.out.println("first string:  ({}) ");
		boolean output = object.isValid("({})");
		System.out.println("expected: true,    actual: " + output);

		System.out.println();
		System.out.println("Second string: ({}]  ");
		boolean output1 = object.isValid("({}]");
		System.out.println("expected: false,    actual: " + output1);
	}
}
