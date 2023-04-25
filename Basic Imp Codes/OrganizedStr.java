package com.interviewAskQues;

public class OrganizedStr {

	public static void organizedString() {
		String input = "Hell1@M78G9Sim/.J";
		String digit = "";
		String alp = "";
		String specialChar = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				digit += ch;
			} else if (Character.isAlphabetic(ch)) {
				alp += ch;
			} else {
				specialChar += ch;
			}
		}
		String output = digit + alp + specialChar;
		System.out.println(output);

	}

	public static void main(String[] args) {
		// Input : Hell1@M78G9Sim/.J
		// Output : 1789HellMGSimmJ@/.

		organizedString();
	}

}
