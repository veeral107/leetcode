package com.leetcode.java.easy;

//13. Roman to Integer
//Given a Roman numeral, convert it to an integer.
//Input is guaranteed to be within the range from 1 to 3999.

public class RomanToInteger {
	public int romanToInt(String s) {
		char[] array = s.toCharArray();
		int number = 0;

		for (int i = 0; i < array.length;) {

			// rest elements
			if (array[i] == 'V') {
				number = number + 5;
				i++;
				continue;
			} else if (array[i] == 'L') {
				number = number + 50;
				i++;
				continue;
			} else if (array[i] == 'D') {
				number = number + 500;
				i++;
				continue;
			} else if (array[i] == 'M') {
				number = number + 1000;
				i++;
				continue;
			}
			// IV,IX
			else if (array[i] == 'I') {
				if (i == array.length - 1) {
					number = number + 1;
					i++;
					continue;
				} else if (array[i + 1] == 'V') {
					number = number + 4;
					i = i + 2;
					continue;
				} else if (array[i + 1] == 'X') {
					number = number + 9;
					i = i + 2;
					continue;
				} else if (array[i] == 'I') {
					number = number + 1;
					i++;
					continue;
				}
			}
			// CD,CM
			else if (array[i] == 'C') {

				if (i == array.length - 1) {
					number = number + 100;
					i++;
					continue;
				} else if (array[i + 1] == 'D') {
					number = number + 400;
					i = i + 2;
					continue;
				} else if (array[i + 1] == 'M') {
					number = number + 900;
					i = i + 2;
					continue;
				} else if (array[i] == 'C') {
					number = number + 100;
					i++;
					continue;
				}

			}

			// XL,XC
			else if (array[i] == 'X') {
				if (i == array.length - 1) {
					number = number + 10;
					i++;
					continue;
				} else if (array[i + 1] == 'L') {
					number = number + 40;
					i = i + 2;
					continue;
				} else if (array[i + 1] == 'C') {
					number = number + 90;
					i = i + 2;
					continue;
				} else if (array[i] == 'X') {
					number = number + 10;
					i++;
					continue;
				}
			}
		}
		return number;
	}

	public static void main(String[] args) {

		RomanToInteger callingObject = new RomanToInteger();

		// String s4 = "IVCD";

		String s1 = "I";
		int number1 = callingObject.romanToInt(s1);
		System.out.println("expected Roman to Integer for string " + s1 + " is: " + 1);
		System.out.println("Roman to Integer for string " + s1 + " is: " + number1);

		String s2 = "IV";
		int number2 = callingObject.romanToInt(s2);
		System.out.println("expected Roman to Integer for string " + s2 + " is: " + 4);
		System.out.println("Roman to Integer for string " + s2 + " is: " + number2);

		String s3 = "XCIX";
		int number3 = callingObject.romanToInt(s3);
		System.out.println("expected Roman to Integer for string " + s3 + " is: " + 99);
		System.out.println("Roman to Integer for string " + s3 + " is: " + number3);

		String s4 = "DCXXI";
		int number4 = callingObject.romanToInt(s4);
		System.out.println("expected Roman to Integer for string " + s4 + " is: " + 621);
		System.out.println("Roman to Integer for string " + s4 + " is: " + number4);
	}
}
