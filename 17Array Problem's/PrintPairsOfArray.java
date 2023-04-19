package com.javacodedaily.array;

public class PrintPairsOfArray {

	public static void printPairs(int arr[]) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			int curr = arr[i]; // 2, 4 ,5 , 6, 7
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + curr + "," + arr[j] + ")");
				counter++;
			}
			System.out.println();
		}

		System.out.println("Total pairs : " + counter);
	}

	public static void main(String[] args) {

		int numbers[] = { 2, 4, 5, 6, 7 };
		printPairs(numbers);
	}
}

// To find total pairs in array = n*(n-1)/2 
// Time complexity = O(n2).