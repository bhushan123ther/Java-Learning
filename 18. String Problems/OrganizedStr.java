package com.interviewAskQues;

public class OrganizedStr {

	public static void main(String[] args) {
		String input = "Hell1@M78G9Sim/.J";
		String digits = "";
		String alphabets = "";
		String specialChar = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digits += ch;
			} else if (Character.isAlphabetic(i)) {
				digits += ch;
			} else {
				specialChar += ch;
			}
		}
		System.out.println(digits + alphabets + specialChar);
	}
}
