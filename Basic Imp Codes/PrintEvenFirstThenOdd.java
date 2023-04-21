package com.interviewAskQues;

public class PrintEvenFirstThenOdd {

	// for printing even numbers first
	public static void arrayEvenAndOdd(int arr[]) {
		int newArr[] = new int[arr.length];

		int index = 0;

		// print even number first
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				newArr[index] = arr[i];
				index++;
			}
		}

		// print odd number after even
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				newArr[index] = arr[j];
				index++;
			}
		}

		// finally print all elements

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 4, 20, 7, 9, 10 };

		arrayEvenAndOdd(arr); // 2 4 20 10 1 3 5 7 9
	}

}
