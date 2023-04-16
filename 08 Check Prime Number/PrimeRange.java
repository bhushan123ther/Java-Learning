package com.javacodedaily.functions;

public class PrimeRange {

	public static boolean isPrime(int n) {
		boolean isPrime = true;

		if (n == 2) {
			isPrime = true;
		} else {
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

	public static void primeInRange(int n) {

		for (int i = 2; i <= 20; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		primeInRange(20);

	}

}
