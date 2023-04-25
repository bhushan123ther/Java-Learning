package com.interviewAskQues;

public class PrintNumFromString {

	public static void main(String[] args) {
		// A : 65
		// a : 97
		// 0 : 48
		String str = "Hell2o3M6M"; // output will be : 236

		String digit = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digit += ch;
			}
		}
		System.out.println(digit);

	}

}
