package org.escoladeltreball.numerosbicapicua;

import static java.lang.System.out;

import java.util.Scanner;

public class Main {

	private final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			solve(n);
		}
	}

	private static void solve(int number) {
		String s = String.valueOf(number);
		for (int i = 0; i < s.length() - 1; i++) {
			String s1 = s.substring(0, i + 1);
			String s2 = s.substring(i + 1);
			if (s2.matches("0\\d+")) {
				continue;
			}
			if (check(Integer.parseInt(s1)) && check(Integer.parseInt(s2))) {
				out.printf("%s%n", "SI");
				return;
			}
		}
		out.printf("%s%n", "NO");
	}

	/*
	 * checks for capicua
	 */
	private static boolean check(int number) {
		StringBuilder builder = new StringBuilder(String.valueOf(number));
		StringBuilder reversed = new StringBuilder(builder);
		reversed.reverse();
		// out.printf("%s %s%n", builder.toString(), reversed.toString());
		// Collections.reverse(Arrays.asList(c1));
		return builder.toString().equals(reversed.toString());
	}

}
