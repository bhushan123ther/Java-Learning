package com.javacodedaily.loop;

import java.util.Scanner;

public class MultiPlicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}

	}

}
