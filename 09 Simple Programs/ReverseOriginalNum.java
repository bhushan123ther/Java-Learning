package com.javacodedaily.loop;

public class ReverseOriginalNum {

	public static void main(String[] args) {
		int num = 81298;
		int rev = 0;

		while (num != 0) {
			int lastdigit = num % 10;
			rev = (rev * 10) + lastdigit;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
