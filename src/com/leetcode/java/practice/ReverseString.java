package com.leetcode.java.practice;

//344. easy
public class ReverseString {
	public String solutions(String s) {
		char[] array = s.toCharArray();
		int j = array.length - 1;
		for (int i = 0; i < j; i++) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		return new String(array);
	}

	public static void main(String[] args) {
		ReverseString object = new ReverseString();
		String s = "hello";
		String output1 = object.solutions(s);
		System.out.println("expected: olleh");
		System.out.println("actual: " + output1);

	}

}
