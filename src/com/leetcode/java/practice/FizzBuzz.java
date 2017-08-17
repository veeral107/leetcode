package com.leetcode.java.practice;
//412: easy

public class FizzBuzz {
	public String solutions(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz";
		}
		if (n % 3 == 0) {
			return "Fizz";
		}
		if (n % 5 == 0) {
			return "Buzz";
		}

		return null;
	}

	public static void main(String[] args) {
		FizzBuzz object = new FizzBuzz();
		int n1 = 30;
		String output1 = object.solutions(n1);
		System.out.println("expected: FizzBuzz");
		System.out.println("actual: " + output1);

	}
}
