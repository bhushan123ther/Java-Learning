package com.javacodedaily.overloadfunction;

public class Example1 {

	// Multiple functions with the same name but different parameters

	// function to add two number (type int)
	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	// function to add three number
	public static int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	// -------------------------------------------------------
	/*
	 * -- error
	 * 
	 * int sum(int a, int b) { return a+b; } float sum(int a , int b) { return a+b;
	 * }
	 */
	public static void main(String[] args) {
		System.out.println("Type int 2 parameters :" + add(3, 4));
		System.out.println("Type int 3 parameters : " + add(3, 4, 5));

	}

}
