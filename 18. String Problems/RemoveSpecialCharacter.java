package com.interviewAskQues;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String str = "Hello@#!!";

		String removeSpecialChar = "";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				count++;
			} else {
				removeSpecialChar = removeSpecialChar + str.charAt(i);
			}
		}
		System.out.println(removeSpecialChar);

	}
}
