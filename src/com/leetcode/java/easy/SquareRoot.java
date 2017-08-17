package com.leetcode.java.easy;

import java.util.Random;

/**
 * Created by veeral on 5/16/17.
 */
public class SquareRoot {

	public int mySqrt(int x) {
		int r = x;
		while (r * r > x) {
			r = (r + x / r) / 2;
		}

		Random random = new Random();
		random.nextInt(3);

		return r;
	}

	public static void main(String[] args) {
		System.out.println(new SquareRoot().mySqrt(4));
	}

}
