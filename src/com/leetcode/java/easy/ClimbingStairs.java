package com.leetcode.java.easy;

//70. Climbing Stairs
//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. 
//In how many distinct ways can you climb to the top? Given n will be a positive integer.
//Fibonacci series 
// 19 April 2017
public class ClimbingStairs {

	public int climbStairs(int n) {
		int a = 1;
		int b = 1;
		int count = 0;
		if (n == 1) {
			return 1;
		}
		for (int i = 1; i < n; i++) {
			if (n > 1) {
				count = a + b;
				a = b;
				b = count;
			}
		}
		return count;
		// if(n <= 0) return 0;
		// ASK nirav:
		// public int climbStairs(int n) {
		// int a = 1, b = 1;
		// while (n-- > 0)
		// a = (b += a) - a;
		// return a;
		// }
	}

	// main method
	public static void main(String[] args) {
		ClimbingStairs callingObject = new ClimbingStairs();
		int output1 = callingObject.climbStairs(1);
		System.out.println("expected output: 1");
		System.out.println("actual output: " + output1);
		int output2 = callingObject.climbStairs(7);
		System.out.println("expected output: 21");
		System.out.println("actual output: " + output2);
	}

}
