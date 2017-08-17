package com.leetcode.java.easy;
//412

//Write a program that outputs the string representation of numbers from 1 to n.
//But for multiples of three it should output “Fizz” instead of the number 
//and for the multiples of five output “Buzz”. 
//For numbers which are multiples of both three and five output “FizzBuzz”.

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<String>();
		int i = 1;
		while (i <= n) {

			int x = i % 3;
			int y = i % 5;

			if (x == 0 && y == 0) {
				output.add("FizzBuzz");
				i++;
				continue;
			}
			if (x == 0) {
				output.add("Fizz");
				i++;
				continue;
			}
			if (y == 0) {
				output.add("Buzz");
				i++;
				continue;
			}
			output.add(String.valueOf(i));
			i++;
		}
		return output;
	}
}
