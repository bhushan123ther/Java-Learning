package com.javacodedaily;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		boolean isPrime = true;

		if (num == 2) {
			System.out.println("Prime number");
		} else {
			for (int i = 2; i <= num - 1; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime == true) {
				System.out.println("Prime number");
			} else {
				System.out.println("Not prime number");
			}
		}

	}

}
