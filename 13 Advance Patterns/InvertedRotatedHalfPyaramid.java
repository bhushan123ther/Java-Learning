package com.javacodedaily.advpattern;

public class InvertedRotatedHalfPyaramid {

	public static void halfPyaramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		halfPyaramid(4);
	}

}
