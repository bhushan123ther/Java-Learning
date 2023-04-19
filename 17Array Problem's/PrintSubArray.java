package com.javacodedaily.array;

public class PrintSubArray {

	public static void printSubArr(int arr[]) {
		int total_sub_pairs = 0;

		for (int i = 0; i < arr.length; i++) {
			int start = i; // for better understanding
			for (int j = start; j < arr.length; j++) {
				int end = j; // for better understanding
				for (int k = start; k <= end; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
				total_sub_pairs++;
			}
			System.out.println();
		}
		System.out.println("Total sub pairs are : " + total_sub_pairs);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10 };

		printSubArr(arr);
	}

}
