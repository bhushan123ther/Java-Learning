package com.javacodedaily.loop;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is : " + fact);

	}

}
