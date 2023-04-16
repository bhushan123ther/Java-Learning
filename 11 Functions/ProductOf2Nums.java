package com.javacodedaily.functions;

import java.util.Scanner;

public class ProductOf2Nums {

	public static int findProduct(int a, int b) {
		int prod = a * b;
		System.out.println("Product of " + a + " and " + b + " is : " + prod);
		return prod;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();

		findProduct(n1, n2); // function call
	}

}
