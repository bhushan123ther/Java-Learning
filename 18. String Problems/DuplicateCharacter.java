package com.stringprac;

public class DuplicateCharacter {

	public static void findDuplicateChr(String str) {

		str = str.toLowerCase();

		char strarr[] = str.toCharArray();

		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i] == strarr[j]) {
					System.out.println(strarr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		String ch = "Annabell";
		findDuplicateChr(ch);
	}

}
