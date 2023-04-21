package com.interviewAskQues;

import java.util.HashSet;
import java.util.Set;

public class GetCommanElement {

	public static void main(String[] args) {
		int arr1[] = { 80, 10, 15, 2, 35, 60 };
		int arr2[] = { 35, 30, 60, 80, 75 };

		// printIntersection(arr1, arr2);
		printUnion(arr1, arr2);
	}

	public static void printIntersection(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			if (s.contains(arr2[i])) {
				System.out.println(arr2[i] + " ");
			}
		}
	}

	public static void printUnion(int arr1[], int arr2[]) {
		Set<Integer> s2 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s2.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			s2.add(arr2[i]);
		}

		System.out.println("Union : ");
		System.out.print(s2);
	}
}
