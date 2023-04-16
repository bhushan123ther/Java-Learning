package com.javacodedaily.functions;

public class BinomialCoefficient {

	public static int findFact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public static int binCoeff(int n, int r) {
		int nFact = findFact(n);
		int rFact = findFact(r);
		int n_rFact = findFact(n - r);

		int binCoefficient = nFact / (rFact * n_rFact);

		return binCoefficient;
	}

	public static void main(String[] args) {

		System.out.println(binCoeff(5, 2));
		/*
		 * binomialCofficient = n!/r!*(n-r)!
		 */
	}

}
