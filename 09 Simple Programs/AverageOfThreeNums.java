package com.javacodedaily;

import java.util.Scanner;

public class AverageOfThreeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int n3 = sc.nextInt();

		System.out.println("Average of three number is : " + avg(n1, n2, n3));

	}

	public static int avg(int a, int b, int c) {
		return (a + b + c) / 3;
	}

}
