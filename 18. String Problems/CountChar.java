package com.stringprac;

public class CountChar {

	public static int countChar(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "Welcome to java";

		int count = countChar(s1);
		System.out.println(s1);
		System.out.println("Number of characters : " + count);
	}

}
