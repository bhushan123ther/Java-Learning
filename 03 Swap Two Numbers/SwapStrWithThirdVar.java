package com.javacodedaily;

public class SwapStrWithThirdVar {

	public static void main(String[] args) {
		String box = "";
		String str1 = "Good";
		String str2 = "Morning";

		System.out.println("Strings Before swapping : " + str1 + " " + str2);

		box = str1;
		str1 = str2;
		str2 = box;

		System.out.println("Strings after swapping : " + str1 + " " + str2);

	}

}
