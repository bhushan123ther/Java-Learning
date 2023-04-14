package com.javacodedaily;
import java.util.Scanner;

public class SwapNumWithThirdVar {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();

		System.out.println("Before swaping a = " + a + " b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swaping a = " + a + " b = " + b);
	}
}