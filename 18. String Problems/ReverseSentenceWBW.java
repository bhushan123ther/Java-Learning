package com.stringprac;

import java.util.Scanner;

public class ReverseSentenceWBW {

	public static String reverseTheSentence(String inputString) {
		String[] words = inputString.split("\\s");

		String outputStr = "";

		for (int i = words.length - 1; i >= 0; i--) {
			outputStr += words[i] + " ";
		}

		return outputStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String inputStr = sc.nextLine();

		String outputStr = reverseTheSentence(inputStr);

		System.out.println("Input string : " + inputStr);
		System.out.println("Output string : " + outputStr);

	}

}
