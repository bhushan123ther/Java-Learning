package com.performance;

public class StringPerformance {

	public static void main(String[] args) {

		String s = "JAVA";

		long startTime = System.currentTimeMillis();

		for (int i = 0; i <= 10000; i++) {
			s = s + "J2EE";
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Time taken by string class : " + (endTime - startTime) + " ms");

//======================================================================================		
		StringBuffer sb = new StringBuffer("JAVA");

		long startTime1 = System.currentTimeMillis();

		for (int i = 0; i <= 10000; i++) {
			sb.append("J2EE");
		}

		long endTime1 = System.currentTimeMillis();

		System.out.println("Time taken by string buffer class : " + (endTime1 - startTime1) + " ms");

// ======================================================================================

		StringBuilder sb1 = new StringBuilder("Java");

		long startTime2 = System.currentTimeMillis();

		for (int i = 0; i <= 10000; i++) {
			sb1.append("J2EE");
		}

		long endTime2 = System.currentTimeMillis();

		System.out.println("Time take by string builder class : " + (endTime2 - startTime2) + " ms");

	}

}
