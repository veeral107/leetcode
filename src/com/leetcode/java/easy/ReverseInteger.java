package com.leetcode.java.easy;
//7. Reverse Integer

//Reverse digits of an integer.
//The input is assumed to be a 32-bit signed integer. 
//Your function should return 0 when the reversed integer overflows.
//Throw an exception? Good, but what if throwing an exception is not an option? 
//You would then have to re-design the function (ie, add an extra parameter).

public class ReverseInteger {
	public int reverse(int x) {

		// convert int to char array
		char[] array = Integer.toString(x).toCharArray();

		if (array[0] == '-') {
			char temp = '0';
			int j = 1;
			array[0] = '-';
			for (int i = array.length - 1; i > j; i--) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		} else {
			char temp = '0';
			int j = 0;
			for (int i = array.length - 1; i > j; i--) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		// convert char array to int
		try {
			int number = Integer.parseInt(new String(array));
			return number;
		} catch (Exception e) {
			return 0;
		}

	}

	// main method
	public static void main(String[] args) {
		ReverseInteger callingObject = new ReverseInteger();
		int output1 = callingObject.reverse(10);
		System.out.println("expected reverse number: 1");
		System.out.println("reverse number: " + output1);
		System.out.println("");

		int output2 = callingObject.reverse(-321);
		System.out.println("expected reverse number: -123");
		System.out.println("reverse number: " + output2);
	}

}
