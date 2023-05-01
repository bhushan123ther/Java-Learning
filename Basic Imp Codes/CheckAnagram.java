package com.stringpract;

import java.util.Scanner;

public class CheckAnagram {

	public static boolean checkAnagram(String str1, String str2) {

		boolean flag = false;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			sortStr(ch1);
			sortStr(ch2);

			if (arrEquals(ch1, ch2)) {
				flag = true;
			}
		}
		return flag;

	}

	public static void sortStr(char[] str) {
		char temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	public static boolean arrEquals(char[] arr1, char[] arr2) {
		boolean isEqual = true;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word : ");
		String st1 = sc.next();

		System.out.println("Enter second word : ");
		String st2 = sc.next();

		boolean status = checkAnagram(st1, st2);

		if (status) {
			System.out.println("Words are anagram.");
		} else {
			System.out.println("Words are not anagram");
		}

	}

}
