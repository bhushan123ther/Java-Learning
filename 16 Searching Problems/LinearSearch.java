package com.javacodedaily.searching;

public class LinearSearch {

	public static int linerSearch(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int numbers[] = { 10, 30, 40, 50, 60, 70, 77, 88, 95 };

		int index = linerSearch(numbers, 50);
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found at index : " + index);
		}
	}

}
