package com.javacodedaily.array;

public class MaxSubArraySum {

	public static void maxSubArraySum(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = start; j < arr.length; j++) {

				int end = j;
				currSum = 0;

				for (int k = start; k <= end; k++) {
					// print sub array sum
					currSum += arr[k];
				}

				System.out.println(currSum);

				if (maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("Maximum sum of sub array is : " + maxSum);
	}

	public static void main(String[] args) {

		int arr[] = { 1, -2, 6, -1, 3 };
		maxSubArraySum(arr);
	}

}

// Time complexity will be O(n3).
