package com.javacodedaily.overloadfunction;

public class Example2 {

	// function to add two number (type float)
	public static float add(float a, float b) {
		return a + b;
	}

	// function to add two number (type int)
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(add(4, 5));
		System.out.println(add(2.5f, 4.5f));
	}

}
