package com.javacodedaily.loop;

import java.util.Scanner;

public class SumOfnNaturalNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int sum = 0;
		int counter = 1;
		while (counter <= num) {
			sum += counter;
			counter++;
		}
		System.out.println(sum);
	}

}
