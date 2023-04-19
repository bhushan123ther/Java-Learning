package com.javacodedaily.searching;

public class LinearSearchStr {

	public static int searchItem(String list[], String item) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String menu[] = { "Samosa", "Kachori", "Khasta", "Rabadi", "Dosa", "Idli" };

		int index = searchItem(menu, "Khasta");

		if (index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at index : " + index);
		}
	}

}
