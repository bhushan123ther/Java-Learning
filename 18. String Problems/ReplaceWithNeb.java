package com.stringprac;

public class ReplaceWithNeb {
	public static void replaceWithNeb(char[] chr) {
		for (int i = 0; i < chr.length - 1; i++) {
			chr[i] = chr[i + 1];
		}
		for (int j = 0; j < chr.length; j++) {
			System.out.print(chr[j] + " ");
		}
	}

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'd', 'f' };
		replaceWithNeb(ch);
	}
}
