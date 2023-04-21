package com.interviewAskQues;

public class FindSpecialCharacter {

	public static void main(String[] args) {

		String str = "Bhush@n!#";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				count++;
				// System.out.println(str.charAt(i)); // To print special character.
			}
		}
		if (count == 0) {
			System.out.println("There is no special character");
		} else {
			System.out.println("Special character found : " + count);
		}

	}

}
