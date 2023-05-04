package com.stringprac;

import java.util.Scanner;

public class ReplaceAllVowelsToEmptySpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string : ");
		String str = sc.nextLine();

		String newStr = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("The string without vowels...");
		System.out.println(newStr);
	}

}
