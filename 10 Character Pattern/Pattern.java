package com.javacodedaily.patterns;

public class Pattern {
	public static void main(String[] args) {
		int n = 4;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int characters = 1; characters <= i; characters++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
