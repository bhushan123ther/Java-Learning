package com.stringprac;

public class MethodOfString2 {

	public static void main(String[] args) {
		String s1 = "  Java is fun. I am learning it   ";
		System.out.println(s1.length());
		s1 = s1.trim();// removes the spaces from beginning and end
		System.out.println(s1);
		System.out.println(s1.length());

		System.out.println(s1.isEmpty());

		s1 = s1.replaceAll("is", "has");
		System.out.println(s1);

		s1 = s1.replace('a', 'z');
		System.out.println(s1);

		System.out.println("=================================");

		// String[] words=s1.split("\\s");
		String[] words = s1.split("\\s", 4); // whitesapce 4: limit

		for (String w : words) {
			System.out.println(w);
		}
	}
}
