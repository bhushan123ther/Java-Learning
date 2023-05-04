package com.stringprac;

import java.util.Scanner;

public class AnagramCheck {
	public static void sortArray(char[] ch) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}

	public static boolean equalArray(char[] ch1, char[] ch2) {
		boolean isEqual = true;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	public static boolean checkAnagram(String str1, String str2) {
		boolean flag = false;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			sortArray(ch1);
			sortArray(ch2);

			if (equalArray(ch1, ch2)) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String str1 = sc.next();

		System.out.println("Enter second string : ");
		String str2 = sc.next();

		boolean status = checkAnagram(str1, str2);

		if (status) {
			System.out.println("The strings are anagram");
		} else {
			System.out.println("The strings are not anagram");
		}

	}

}
