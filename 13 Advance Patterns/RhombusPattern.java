package com.javacodedaily.advpattern;

public class RhombusPattern {

	public static void print_rhombus(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print_rhombus(5);
	}

}
