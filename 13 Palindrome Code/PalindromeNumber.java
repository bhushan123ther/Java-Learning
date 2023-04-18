package com.javacodedaily;

import java.util.Scanner;

public class PalindromeNumber {

	public static boolean isPalindrome(int n) {
		int palindrome = n;
		int reverse = 0;

		while (palindrome != 0) {
			int rem = palindrome % 10;
			reverse = (reverse * 10) + rem;
			palindrome = palindrome / 10;
		}
		if (n == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		if (isPalindrome(num)) {
			System.out.println(num + " is palindrome");
		} else {
			System.out.println(num + " is not palindrome");
		}
	}

}
