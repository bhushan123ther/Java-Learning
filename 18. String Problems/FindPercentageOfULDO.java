package com.stringprac;

import java.text.DecimalFormat;

public class FindPercentageOfULDO {

	static void characterPercentage(String inputStr) {
		// Getting total number of characters in the given string
		int totalChars = inputStr.length();

		// Intitializing upperCaseLetters, lowerCaseLetters, digits
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int digits = 0;
		int others = 0;

		// iterating through each character of inputString
		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseLetters++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseLetters++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				others++;
			}
		}

		// calculating percentage of uppercase letters, lowercase letters , digits and
		// other

		double upperCasePercentage = (upperCaseLetters * 100) / totalChars;
		double lowerCasePercentage = (lowerCaseLetters * 100) / totalChars;
		double digitsPercentage = (digits * 100) / totalChars;
		double othersPercentage = (others * 100) / totalChars;

		// Printing percentages

		DecimalFormat formatter = new DecimalFormat("##.##");

		System.out.println("In '" + inputStr + " ' : ");
		System.out.println("Uppercase letters are : " + formatter.format(upperCasePercentage) + " %");
		System.out.println("Lowercase letters are : " + formatter.format(lowerCasePercentage) + " %");
		System.out.println("Digits are : " + formatter.format(digitsPercentage) + " %");
		System.out.println("Others are : " + formatter.format(othersPercentage) + " %");
		System.out.println("----------------------------------------------------");

	}

	public static void main(String[] args) {
		characterPercentage("Time has not come yet #work hard with 100% ");

	}

}
