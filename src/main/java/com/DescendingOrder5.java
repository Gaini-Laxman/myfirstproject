 package com;

public class DescendingOrder5 {

	public static void main(String[] args) {
		int n = 10; // set the number of rows
		for (int i = 1; i <= n; i++) {
			for (int j = 10; j >= 11 - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
