package com.leetcode.java.easy;
//171. Excel Sheet Column Number

///Given a column title as appear in an Excel sheet, return its corresponding column number.
//14 April-2017

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {

		char[] input = s.toLowerCase().toCharArray();
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			int z = (int) Math.pow(26, input.length - 1 - i);
			if (input[i] == 'a') {
				sum = sum + 1 * z;
				continue;
			}
			if (input[i] == 'b') {
				sum = sum + 2 * z;
				continue;
			}
			if (input[i] == 'c') {
				sum = sum + 3 * z;
				continue;
			}
			if (input[i] == 'd') {
				sum = sum + 4 * z;
				continue;
			}
			if (input[i] == 'e') {
				sum = sum + 5 * z;
				continue;
			}
			if (input[i] == 'f') {
				sum = sum + 6 * z;
				continue;
			}
			if (input[i] == 'g') {
				sum = sum + 7 * z;
				continue;
			}
			if (input[i] == 'h') {
				sum = sum + 8 * z;
				continue;
			}
			if (input[i] == 'i') {
				sum = sum + 9 * z;
				continue;
			}
			if (input[i] == 'j') {
				sum = sum + 10 * z;
				continue;
			}
			if (input[i] == 'k') {
				sum = sum + 11 * z;
				continue;
			}
			if (input[i] == 'l') {
				sum = sum + 12 * z;
				continue;
			}
			if (input[i] == 'm') {
				sum = sum + 13 * z;
				continue;
			}
			if (input[i] == 'n') {
				sum = sum + 14 * z;
				continue;
			}
			if (input[i] == 'o') {
				sum = sum + 15 * z;
				continue;
			}
			if (input[i] == 'p') {
				sum = sum + 16 * z;
				continue;
			}
			if (input[i] == 'q') {
				sum = sum + 17 * z;
				continue;
			}
			if (input[i] == 'r') {
				sum = sum + 18 * z;
				continue;
			}
			if (input[i] == 's') {
				sum = sum + 19 * z;
				continue;
			}
			if (input[i] == 't') {
				sum = sum + 20 * z;
				continue;
			}
			if (input[i] == 'u') {
				sum = sum + 21 * z;
				continue;
			}
			if (input[i] == 'v') {
				sum = sum + 22 * z;
				continue;
			}
			if (input[i] == 'w') {
				sum = sum + 23 * z;
				continue;
			}
			if (input[i] == 'x') {
				sum = sum + 24 * z;
				continue;
			}
			if (input[i] == 'y') {
				sum = sum + 25 * z;
				continue;
			}
			if (input[i] == 'z') {
				sum = sum + 26 * z;
				continue;
			}

		}

		return sum;
	}

	// main method
	public static void main(String[] args) {
		ExcelSheetColumnNumber callingObject = new ExcelSheetColumnNumber();

		String s1 = "aA";
		int result1 = callingObject.titleToNumber(s1);
		System.out.println("expected: 27");
		System.out.println("actual: " + result1);
		System.out.println("");

		String s2 = "aa";
		int result2 = callingObject.titleToNumber(s2);
		System.out.println("expected: 27");
		System.out.println("actual: " + result2);
	}
}
