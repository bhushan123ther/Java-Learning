package com.javacodedaily.loop;

public class PrintReverseNumber {

	public static void main(String[] args) {
		int num = 1234;

		while (num != 0) {
			int rem = num % 10;
			System.out.print(rem);
			num = num / 10;           // num/=10
		}

	}

}

// last digit = num % 10
// remove last digit = num / 10
