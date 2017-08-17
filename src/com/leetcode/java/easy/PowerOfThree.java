package com.leetcode.java.easy;

//326. Power of Three Add to List
//Given an integer, write a function to determine if it is a power of three.
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		int i = 0;
		do {
			if (Math.pow(3, i) == n) {
				return true;
			} else {
				i++;
			}
		} while (n >= Math.pow(3, i));
		return false;
	}

	public static void main(String[] args) {
		PowerOfThree callingobject = new PowerOfThree();
		int number1 = 81;
		boolean output1 = callingobject.isPowerOfThree(number1);
		System.out.println(number1 + " is power of 3? " + output1);
		int number2 = 12;
		boolean output2 = callingobject.isPowerOfThree(number2);
		System.out.println(number2 + " is power of 3? " + output2);
	}

}
