package com.javacodedaily;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigits(int number) {
		int sum = 0;

		while (number != 0) {
			int lastdigit = number % 10;
			sum += lastdigit;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();

		System.out.println("Your sum is : " + sumOfDigits(num));
	}

}
