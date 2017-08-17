package com.leetcode.java.easy;
//198. House Robber	

//You are a professional robber planning to rob houses along a street. 
//Each house has a certain amount of money stashed, 
//the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
//it will automatically contact the police if two adjacent houses were broken into on the same night.
//Given a list of non-negative integers representing the amount of money of each house, 
//determine the maximum amount of money you can rob tonight without alerting the police.
//19 April 2017

public class HouseRobber {
	public int rob(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}

		int even = 0;
		int odd = 0;
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				even = even + num[i];
				if (even < odd) {
					even = odd;
				} else {
					continue;
				}
			}

			else {
				odd = odd + num[i];
				if (odd < even) {
					odd = even;
				} else {
					continue;
				}
			}
		}

		if (even > odd) {
			return even;
		} else {
			return odd;
		}

	}
	// short code
	// public int rob(int[] num) {
	// if(num==null || num.length == 0)
	// return 0;
	//
	// int even = 0;
	// int odd = 0;
	//
	// for (int i = 0; i < num.length; i++) {
	// if (i % 2 == 0) {
	// even += num[i];
	// even = even > odd ? even : odd;
	// } else {
	// odd += num[i];
	// odd = even > odd ? even : odd;
	// }
	// }
	//
	// return even > odd ? even : odd;
	// }

	// main method
	public static void main(String[] args) {
		HouseRobber callingObject = new HouseRobber();
		int[] nums = { 5, 2, 5, 2, 5 };
		int output = callingObject.rob(nums);
		System.out.println("Expected output is: 15");
		System.out.println("Actual output is: " + output);

		System.out.println("");

		int[] nums3 = { 1, 2, 1 };
		int output3 = callingObject.rob(nums3);
		System.out.println("Expected output is: 2");
		System.out.println("Actual output is: " + output3);

	}

}
