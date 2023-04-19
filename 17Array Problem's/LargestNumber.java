package com.javacodedaily.array;

public class LargestNumber {

	public static int getLargest(int nums[]) {
		int largest = Integer.MIN_VALUE; // - infinity

		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
			}
		}
		return largest;

	}

	public static void main(String[] args) {

		int numbers[] = { 4, 5, 6, 7, 8, 22, 3, 4, 56, 5 };

		System.out.println("Laegest number is : " + getLargest(numbers));

	}

}
