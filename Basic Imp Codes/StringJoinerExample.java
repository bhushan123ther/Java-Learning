package com.interviewAskQues;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(","); // (",") it is delimiter
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);

		sj1.merge(sj2);
		System.out.println(sj1);
	}

}
/*
 * print this output using string joiner A,B,C P:Q A,B,C,P:Q
 */
