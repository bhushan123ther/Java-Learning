package com.javacodedaily.patterns;

public class RightAngleOppShadow {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
