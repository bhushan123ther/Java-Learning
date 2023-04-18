package com.javacodedaily.advpattern;

public class PalindromeNumberPattern {

	public static void palindrome_number_pattern(int n) {
		for (int i = 1; i <= n; i++) {
			// space
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// descending order number
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			// ascending order number
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		palindrome_number_pattern(5);
	}
}
