package com.javacodedaily.array;

public class SmallestNumber {

	public static int getSmallest(int nums[]) {
		int smallest = Integer.MAX_VALUE; // infinity

		for (int i = 0; i < nums.length; i++) {
			if (smallest > nums[i]) {
				smallest = nums[i];
			}
		}
		return smallest;

	}

	public static void main(String[] args) {

		int numbers[] = { 4, 5, 6, 7, 8, 22, 3, 4, 56, 5 };

		System.out.println("Smallest number is : " + getSmallest(numbers));

	}

}
