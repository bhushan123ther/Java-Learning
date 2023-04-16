package com.javacodedaily.functions;

public class Factorial {

	public static int findFact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		System.out.println(findFact(5));
	}

}
