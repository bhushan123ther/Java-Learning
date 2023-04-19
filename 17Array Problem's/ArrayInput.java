package com.javacodedaily.array;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {

		int marks[] = new int[26];

		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter size : ");
		// int pys = sc.nextInt();

		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();

		System.out.println("Physics : " + marks[0]);
		System.out.println("Chemistry : " + marks[1]);
		System.out.println("Biology : " + marks[2]);

		// update marks

		marks[2] = marks[2] + 1;
		System.out.println("Biology : " + marks[2]);

	}

}
